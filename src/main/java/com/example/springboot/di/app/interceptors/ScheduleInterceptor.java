package com.example.springboot.di.app.interceptors;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("ScheduleInterceptor")
public class ScheduleInterceptor implements HandlerInterceptor {
	
	static final Logger logger = LoggerFactory.getLogger(ScheduleInterceptor.class);
	
	@Value("${config.schedule.start}")
	private Integer opening;
	
	@Value("${config.schedule.end}")
	private Integer closing;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Calendar calendar = Calendar.getInstance();
		int hour = calendar.get(calendar.HOUR_OF_DAY);
		
		if (hour >= opening && hour <= closing) {
			logger.info("Welcome to Shcedule");
			return true;
		}
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}
	
}
