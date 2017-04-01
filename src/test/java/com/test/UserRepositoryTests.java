package com.test;

import java.text.DateFormat;
import java.util.Date;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.dao.UserRepository;
import com.test.entity.User;


/***
 * 用户dao 测试用例<p>
 * 当让 spring data jpa 还有很多功能，比如封装好的分页，可以自己定义SQL，主从分离等等
 * @SpringBootTest 需要增加该注解才能进行junit测试否则，dao注入失败
 * 
 * @author LingMin 
 * @date 2016-11-30<br>
 * @version 1.0<br>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)// 指定spring-boot的启动类   
//@SpringApplicationConfiguration(classes = Application.class)// 1.4.0 前版本 
public class UserRepositoryTests  {

	 	@Autowired
	    private UserRepository userRepository;

	    @Test
	    public void test() throws Exception {
	        Date date = new Date();
	        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);        
	        String formattedDate = dateFormat.format(date);
	        
	        userRepository.save(new User("aa1" , "aa123456", "aa@126.com", "aa",formattedDate));
	        userRepository.save(new User("bb2" , "bb123456", "bb@126.com", "bb",formattedDate));
	        userRepository.save(new User("cc3" , "cc123456", "cc@126.com", "cc",formattedDate));

	       // userRepository.findOne(arg0)
	        
	        Assert.assertEquals(3, userRepository.findAll().size());
	        Assert.assertEquals("cc", userRepository.findByNameOrEmail("bb", "cc@126.com").getNickName());
	       // userRepository.delete(userRepository.findByName("aa1"));
	    }
}
