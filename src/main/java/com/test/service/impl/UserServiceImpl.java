/**
 * &lt;p&gt;
 * copyright &amp;copy;  2015, all rights reserved.
 * @author admin
 * @version $Id$
 * @since 1.0
 * 
 */
package com.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.UserRepository;
import com.test.entity.User;
import com.test.service.IUserService;

/**
 * 用户service接口实现类 <p>
 * @author LingMin 
 * @date 2016-11-30<br>
 * @version 1.0<br>
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long> implements IUserService {

	protected UserRepository repository;
	/***
	 * 构造方法注入dao
	 * @param repository
	 */
	@Autowired
	public UserServiceImpl(UserRepository repository) {
		super(repository);
		this.repository = repository;
	}

	public User findByName(String name) {
		return repository.findByName(name);
	}

	public User findByNameOrEmail(String name, String email) {
		return repository.findByNameOrEmail(name, email);
	}

	

}
