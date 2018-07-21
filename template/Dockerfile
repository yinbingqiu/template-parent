FROM web-jre8-page2pdf:2.0
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone \
    && mkdir -p /home/admin

ENV APP_DIR=/home/admin
COPY libdxlc_ctu.so $APP_DIR
COPY ctu-web.war $APP_DIR
COPY application.properties $APP_DIR

VOLUME $APP_DIR/logs
WORKDIR $APP_DIR

COPY startup.sh /usr/local/bin/
RUN chmod +x /usr/local/bin/startup.sh; \
                ln -s /usr/local/bin/startup.sh startup.sh
ENTRYPOINT ["startup.sh"]