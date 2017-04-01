/**
 * &lt;p&gt;
 * copyright &amp;copy;  2015, all rights reserved.
 * @author admin
 * @version $Id$
 * @since 1.0
 * 
 */
package com.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.User;

/**
 * 用户dao操作接口 <p>
 * @author LingMin 
 * @date 2016-11-30<br>
 * @version 1.0<br>
 */
public interface UserRepository extends JpaRepository<User, Long>{

	User findByName(String name);
    User findByNameOrEmail(String name, String email);
}
