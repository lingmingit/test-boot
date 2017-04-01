package com.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.test.controller.UserController;



/***
 * Spring-boot的测试用例<p>
 * @author LingMin 
 * @date 2016-11-30<br>
 * @version 1.0<br>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class HelloWorldControlerTests {

	
	 private MockMvc mvc;
	    @Before
	    public void setUp() throws Exception {
	        mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
	    }
	    @Test
	    public void getHello() throws Exception {
	    mvc.perform(MockMvcRequestBuilders.get("/user/1").accept(MediaType.APPLICATION_JSON))
	                .andExpect(MockMvcResultMatchers.status().isOk())
	                .andDo(MockMvcResultHandlers.print())
	                .andReturn();
	    }
}
