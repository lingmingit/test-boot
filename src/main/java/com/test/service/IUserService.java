/**
 * &lt;p&gt;
 * copyright &amp;copy;  2015, all rights reserved.
 * @author admin
 * @version $Id$
 * @since 1.0
 * 
 */
package com.test.service;

import com.test.entity.User;

/** 
 * 创建用户service接口<p>
 * @author LingMin 
 * @date 2016-11-30<br>
 * @version 1.0<br>
 */
public interface IUserService extends IBaseService<User,Long>{

	
	User findByName(String name);
    User findByNameOrEmail(String name, String email);
}
