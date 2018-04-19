package com.tech.application.base.dao.mybatis;

import java.io.Serializable;
import com.github.pagehelper.Page;

public interface BaseDao<Model extends Serializable, QueryParams extends Serializable, Id extends Serializable> {

	/**
	 * 分页查询
	 * 
	 * @param params
	 * @return
	 */
	Page<Model> findByPage(QueryParams params);
	
	/**
	 * 通过主键查询实体
	 * 
	 * @param id
	 * @return
	 */
	Model get(Id id);

	/**
	 * 插入实体
	 * 
	 * @param t
	 * @return
	 */
	int insert(Model t);

	/**
	 * 更新实体
	 * 
	 * @param t
	 * @return
	 */
	int update(Model t);
	
	/**
	 * 删除实体
	 * 
	 * @param id
	 * @return
	 */
	int delete(Id id);
}

