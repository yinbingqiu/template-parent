package com.web.interceptor;

import com.dao.constant.ErrorMessage;
import com.dao.util.BussinessException;
import com.web.util.ApiResult;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.validation.BindException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zxkletters on 2017/5/24.
 */
@Slf4j
@ControllerAdvice
public class ControllerExceptionHandler {
    private StringBuffer errorBuffer = new StringBuffer();
    private final String CALLBACK = "callback";
    private final String SCRIPT_WRAPPING = "scriptWrapping";


    /**
     * @Description: 方法说明：统一拦截处理异常
     * @Author: jianpo.zhao
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object handleException(final Exception e, final HttpServletRequest request) {
        String msg;
        if (e instanceof HttpRequestMethodNotSupportedException) {
            //请求方法不支持
            msg = "request method '" + request.getMethod() + "' not supported.";
        } else if (e instanceof BindException) {
            //字段校验异常
            msg = ((BindException) e).getBindingResult().getAllErrors().get(0).getDefaultMessage();
        } else if (e instanceof BussinessException) {
            //业务异常,直接返回错误原因
            msg = e.getMessage();
            handleLog(e);
        } else if (e instanceof Throwable) {
            /*系统已检查型异常属于message字段按照固定的prefix开始这样可以避免在业务层上过多的检查异常并且显示的抛出BussinessException*/
            if (StringUtils.isNoneBlank(e.getMessage()) && StringUtils.startsWith(e.getMessage(), ErrorMessage.PREFIX)) {
                msg = e.getMessage().substring(e.getMessage().indexOf(ErrorMessage.PREFIX) + 1);
            } else {
                //系统异常
                msg = ErrorMessage.System.INTERNAL_SERVER;
            }
            handleLog(e);
        } else {
            msg = ErrorMessage.System.INTERNAL_SERVER;
            handleLog(e);
        }
        return ApiResult.getFailed(msg);
    }

    private void handleLog(Exception e) {
        if (log.isErrorEnabled()) {
            log.error("异常：", e);
        }
    }
}
