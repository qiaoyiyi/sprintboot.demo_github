package com.sinosoft.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sinosoft.pojo.DemoJSONResult;
//@RestControllerAdvice
public class DemoAjaxExceptionHandler {

//	@ExceptionHandler(value =Exception.class)
	public DemoJSONResult defaultErrorHandler (HttpServletRequest req,
		Exception e) throws Exception
	{
		e.printStackTrace();
		return DemoJSONResult.errorException(e.getMessage());
	}
}
