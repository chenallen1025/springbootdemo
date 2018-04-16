package com.example.demo;

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
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter {
	@Bean
	public RemoteIpFilter remoteIpFilter() {
		return new RemoteIpFilter();
	}
	/**
	 * Spring 提供了FilterRegistrationBean类，此类提供setOrder方法，可以为filter设置排序值，
		让spring在注册web filter之前排序后再依次注册。
	 * 
	 */
	@Bean
	public FilterRegistrationBean getRegistrationBean(){
		FilterRegistrationBean registraction = new FilterRegistrationBean();
		registraction.setFilter(new MyFilter());//添加过滤器
		registraction.addUrlPatterns("/*"); //*所有路径
		registraction.addInitParameter("paramName", "paramValue"); //添加默认参数
		registraction.setName("Myfilter");
		registraction.setOrder(1); //设置优先级
		//是否自动注册 false 取消Filter的自动注册
//		registraction.setEnabled(true);
		return registraction;
		
	}
	public class MyFilter implements Filter{

		@Override
		public void destroy() {
			// TODO Auto-generated method stub
			 System.out.println("Filter销毁中");
		}

		@Override
		public void doFilter(ServletRequest srequest, ServletResponse sresponse, FilterChain filterChain)
				throws IOException, ServletException {
			System.out.println("开始进行过滤处理");
			// TODO Auto-generated method stub
			HttpServletRequest request = (HttpServletRequest)srequest;
			System.out.println("this is MyFilter ,url:"+request.getRequestURL());
			filterChain.doFilter(srequest, sresponse);
		}

		@Override
		public void init(FilterConfig arg0) throws ServletException {
			// TODO Auto-generated method stub
			System.out.println("Filter初始化中");
		}
		
	}
}
