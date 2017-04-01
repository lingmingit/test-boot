package com.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/***
 * 测试spring-boot使用
 * @author LingMin 
 * @date 2016-11-29<br>
 * @version 1.0<br>
 */
/***
 * 第一种方式：使用三个注解
@Configuration  
@ComponentScan  
@EnableAutoConfiguration
***/
/*****
 * 第二种方式：使用一个注解
 * 该@SpringBootApplication注解等价于以默认属性使用@Configuration，@EnableAutoConfiguration和@ComponentScan。<p>
 */
@SpringBootApplication
public class Application {

	/***
	 * 经过测试：发现通过该类进行运行，该类必须在其它两个类的上层包(com.test)，否则resful 不能运行<p>
	 * @param args <p>
	 * void
	 */
	public static void main(String[] args) {  
        SpringApplication.run(Application.class , args);  
		
//		SpringApplication app = new SpringApplication(Application.class);
//	    app.run(args);
	    
    }  
}
