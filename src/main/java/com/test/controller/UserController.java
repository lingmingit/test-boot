package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.components.NeoProperties;
import com.test.entity.User;
import com.test.service.IUserService;



/***
 * 测试spring-boot使用
 * @author LingMin 
 * @date 2016-11-29<br>
 * @version 1.0<br>
 */
//@EnableAutoConfiguration  
@RestController  
@RequestMapping("/user")  
public class UserController {

	/** 日志书写对象**/
	protected org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(this.getClass());
	
	@Autowired
	NeoProperties neoProperties;
	
	@Autowired
    private IUserService userService;
	
	 @RequestMapping("/{id}")  
     public User view(@PathVariable("id") Long id) {  
        User user = new User();  
        user.setId(id);  
        user.setName("zhang");
        System.out.println("user="+user);
        System.out.println("neoProperties="+neoProperties.getTitle()+" \t "+neoProperties.getDescription());
        
        User temp = userService.getOne(id);
        logger.info("temp="+temp);
        if(temp != null){
        	 System.out.println(temp.getRegTime());
        }
        return user;  
     }  
     /*****
	   * 从数据库中查找所有的记录<p>
	   * @return <p>
	   * List<User>
	   */
	 @RequestMapping("/list")  
     public List<User> list() {  
        return userService.findAll();  
     }   
	 /*****
	   * 从数据库中查找所有的记录<p>
	   * @return <p>
	   * List<User>
	   */
	 @RequestMapping("/get/{id}")  
    public User get(@PathVariable("id") Long id) { 
		 logger.info("id="+id);
		 //摘要: findOne取出的是实体 getOne取出的是实体的引用 
       //return userService.getOne(id);  //该方法查询数据时， 存在代理对象问题（延迟查询）,类似  hibernate的 load()方法
	   return userService.findOne(id);//类似 hibernate get() 方法
    }   
	 
	 
//	    public static void main(String[] args) {  
//	        SpringApplication.run(UserController.class);  
//	    }  
}
