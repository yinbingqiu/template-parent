/*
 * Copyright: 2017 dingxiang-inc.com Inc. All rights reserved.
 */
package com.dao.util;


import java.util.List;

/**
 * DAO层基本父类
 *
 * @param <B> BO 业务参数对象
 * @param <D> DTO 数据库结果集返回对象
 */
public interface BaseMapper<B extends BaseModel, D extends BaseModel> {
    /**
     * 获取所有数据
     *
     * @return
     */
    List<D> selectAll();

    /**
     * 根据ID获取
     *
     * @param id
     * @return
     */
    D selectByPrimaryKey(Long id);

    /**
     * 返回查询分页
     *
     * @param bo
     * @return
     */
    List<D> queryPage(B bo);

    /**
     * 返回条件查询结果集
     *
     * @param bo
     * @return
     */
    List<D> query(B bo);

    /**
     * 根据主键删除
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入数据
     *
     * @param bo
     * @return
     */
    int insert(B bo);

    /**
     * 插入数据
     *
     * @param bo
     * @return
     */
    int insertSelective(B bo);

    /**
     * 根据主键更新
     *
     * @param bo
     * @return
     */
    int updateByPrimaryKey(B bo);

    /**
     * 根据主键更新
     *
     * @param bo
     * @return
     */
    int updateByPrimaryKeySelective(B bo);


}
