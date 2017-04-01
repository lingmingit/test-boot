package com.test.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * 属性文件注入<p>
 * @author LingMin 
 * @date 2016-11-30<br>
 * @version 1.0<br>
 */
@Component
public class NeoProperties {

	 @Value("${com.neo.title}")
      private String title;
      @Value("${com.neo.description}")
      private String description;
      
      
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
      
      
}
