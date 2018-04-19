package com.tech.application.base.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import com.github.pagehelper.Page;
import com.tech.application.base.dao.mybatis.BaseDao;
import com.tech.application.base.model.PersistentObject;
import com.tech.application.base.service.BaseService;

/**
 * BaseService基类，实现了数据的CRUD
 * @author chenzhicong
 *
 * @param <Dao>
 * @param <T>
 * @param <Id>
 */
public abstract class BaseServiceImpl<Dao extends BaseDao<ModelT, QueryT, Id>, ModelT extends Serializable, QueryT extends Serializable, Id extends Serializable>
		implements BaseService<ModelT, QueryT, Id> {

	/**
	 * 由子类注入实体DAO
	 */
	protected Dao dao;

	public abstract void setDao(Dao dao);

	public Page<ModelT> findByPage(QueryT t) {
		return dao.findByPage(t);
	}

	public ModelT get(Id id) {
		return dao.get(id);
	}

	public void insert(ModelT t) {
		dao.insert(t);
	}

	public void update(ModelT t) {
		dao.update(t);
	}

	public void delete(Id id) {
		dao.delete(id);
	}

	
}
