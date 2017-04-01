/**
 * &lt;p&gt;
 * copyright &amp;copy;  2015, all rights reserved.
 * @author admin
 * @version $Id$
 * @since 1.0
 * 
 */
package com.test.service.impl;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.test.service.IBaseService;

/** 
 * 基础业务操作service实现类<p>
 * @author LingMin 
 * @date 2016-11-30<br>
 * @version 1.0<br>
 */
public abstract class BaseServiceImpl<T, ID> implements IBaseService<T, ID> {
	
	//dao操作类
	private JpaRepository jpaRepository ;
	
	/****
	 * 构造方法注入
	 * @param jpaRepository
	 */
	public BaseServiceImpl(JpaRepository jpaRepository){
		this.jpaRepository = jpaRepository;
	}

	/* (non-Javadoc)
	 * @see com.test.service.IBaseService#findAll()
	 */
	public List<T> findAll() {
		return jpaRepository.findAll();
	}

	/* (non-Javadoc)
	 * @see com.test.service.IBaseService#findAll(org.springframework.data.domain.Sort)
	 */
	public List<T> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return jpaRepository.findAll(sort);
	}

	/* (non-Javadoc)
	 * @see com.test.service.IBaseService#findAll(java.lang.Iterable)
	 */
	public List<T> findAll(Iterable<ID> ids) {
		// TODO Auto-generated method stub
		return jpaRepository.findAll(ids);
	}
	
	/**
	 * Retrieves an entity by its id.
	 * 
	 * @param id must not be {@literal null}.
	 * @return the entity with the given id or {@literal null} if none found
	 * @throws IllegalArgumentException if {@code id} is {@literal null}
	 */
	public T findOne(ID id){
		return (T)jpaRepository.findOne((java.io.Serializable)id);
	}

	/* (non-Javadoc)
	 * @see com.test.service.IBaseService#save(java.lang.Iterable)
	 */
	public <S extends T> List<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return jpaRepository.save(entities);
	}
	
	

	/* (non-Javadoc)
	 * @see com.test.service.IBaseService#flush()
	 */
	public void flush() {
		jpaRepository.flush();
	}

	/* (non-Javadoc)
	 * @see com.test.service.IBaseService#saveAndFlush(java.lang.Object)
	 */
	public <S extends T> S saveAndFlush(S entity) {
		return (S) jpaRepository.saveAndFlush(entity);
	}

	/* (non-Javadoc)
	 * @see com.test.service.IBaseService#deleteInBatch(java.lang.Iterable)
	 */
	public void deleteInBatch(Iterable<T> entities) {
		jpaRepository.deleteInBatch(entities);
	}

	/* (non-Javadoc)
	 * @see com.test.service.IBaseService#deleteAllInBatch()
	 */
	public void deleteAllInBatch() {
		jpaRepository.deleteAllInBatch();
	}

	/* (non-Javadoc)
	 * @see com.test.service.IBaseService#getOne(java.lang.Object)
	 */
	public T getOne(ID id) {
		return (T) jpaRepository.getOne((java.io.Serializable)id);
	}

}
