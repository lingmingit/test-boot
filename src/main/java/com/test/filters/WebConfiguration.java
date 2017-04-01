package com.test.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 设置自定义过滤器<p>
 * @author LingMin 
 * @date 2016-11-30<br>
 * @version 1.0<br>
 */
@Configuration
public class WebConfiguration {

	    @Bean
	    public RemoteIpFilter remoteIpFilter() {
	        return new RemoteIpFilter();
	    }
	    
	    @Bean
	    public FilterRegistrationBean testFilterRegistration() {

	        FilterRegistrationBean registration = new FilterRegistrationBean();
	        registration.setFilter(new MyFilter());
	        registration.addUrlPatterns("/*");
	        registration.addInitParameter("paramName", "paramValue");
	        registration.setName("MyFilter");
	        registration.setOrder(1);
	        return registration;
	    }
	    /***
	     * 自定义filter<p>
	     * @author LingMin 
	     * @date 2016-11-30<br>
	     * @version 1.0<br>
	     */
	    public class MyFilter implements Filter {
	       // @Override
	        public void destroy() {
	        	System.out.println("MyFilter.destroy");
	        }

	        //@Override
	        public void doFilter(ServletRequest srequest, ServletResponse sresponse, FilterChain filterChain)
	                throws IOException, ServletException {
	            HttpServletRequest request = (HttpServletRequest) srequest;
	            System.out.println("this is MyFilter,url :"+request.getRequestURI());
	            filterChain.doFilter(srequest, sresponse);
	        }

	        //@Override
	        public void init(FilterConfig arg0) throws ServletException {
	        	System.out.println("MyFilter.init");
	        }
	    }
}
