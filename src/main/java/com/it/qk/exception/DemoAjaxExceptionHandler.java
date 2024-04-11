package com.it.qk.exception;

import javax.servlet.http.HttpServletRequest;

import com.it.qk.pojo.DemoJSONResult;

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
