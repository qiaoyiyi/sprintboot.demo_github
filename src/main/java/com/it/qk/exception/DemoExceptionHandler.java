package com.it.qk.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it.qk.pojo.DemoJSONResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

/* 当系统出现异常时会被这个类捕获 */
//@ControllerAdvice
@RestControllerAdvice
public class DemoExceptionHandler {

	public static final String DEMO_ERROR_VIEW ="error" ;
	
	@ExceptionHandler(value =Exception.class)
	public Object errorHandler (HttpServletRequest reqest,
			HttpServletResponse response,Exception e) throws Exception {
		e.printStackTrace();
		if(isAjax(reqest)) {
			
			return DemoJSONResult.errorException(e.getMessage());
		}else {
		ModelAndView mav = new ModelAndView() ;
		mav.addObject("exception",e);
		mav.addObject("url", reqest.getRequestURI());
		mav.setViewName(DEMO_ERROR_VIEW);
		return mav ;
		}
	}
	
	/**
	 * 判断请求是否是ajax请求
	 * @param httpRequest
	 * @return
	 */
	public static boolean isAjax(HttpServletRequest httpRequest) {
		
		return (httpRequest.getHeader("X-Requested-With")!=null
				&& "XMLHttpRequest".equals(httpRequest.getHeader("X-Requested-With").toString()));
	}
	
	
	
}
