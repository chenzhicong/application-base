package com.tech.application.base.service;

import java.io.Serializable;
import java.util.Map;
import com.github.pagehelper.Page;
import com.tech.application.base.model.PersistentObject;

public interface BaseService<ModelT extends Serializable, QueryT extends Serializable, Id extends Serializable> {

	/**
	 * 分页查询
	 * 
	 * @param params
	 * @return
	 */
	Page<ModelT> findByPage(QueryT t);

	/**
	 * 通过主键查询实体
	 * 
	 * @param id
	 * @return
	 */
	ModelT get(Id id);

	/**
	 * 插入实体
	 * 
	 * @param T
	 *            t
	 */
	void insert(ModelT t);

	/**
	 * 更新实体
	 * 
	 * @param t
	 */
	void update(ModelT t);

	/**
	 * 删除实体
	 * 
	 * @param id
	 */
	void delete(Id id);
}