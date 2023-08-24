package com.example.springboot.di.app.interceptors;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("TimeElapsedInterceptor")
public class TimeElapsedInterceptor implements HandlerInterceptor {
	
	private static final Logger logger = LoggerFactory.getLogger(TimeElapsedInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		long timeStart = System.currentTimeMillis();
		logger.info("TimeElapsedInterceptor: PreHandler Start...");
		request.setAttribute("TimeStart", timeStart);
		
		Random random = new Random();
		Integer demora = random.nextInt(500);
		Thread.sleep(demora);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		long timeEnd = System.currentTimeMillis();
		long timeStart = (long) request.getAttribute("TimeStart");
		long timeTotal = timeEnd - timeStart;
		logger.info("TimeElapsedInterceptor: PostHandle End... " + timeTotal + "ms");
	}
	
	

}
