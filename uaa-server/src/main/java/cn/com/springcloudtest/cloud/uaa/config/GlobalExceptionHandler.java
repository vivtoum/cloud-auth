package cn.com.springcloudtest.cloud.uaa.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice  

public class GlobalExceptionHandler {  
  //添加全局异常处理流程，根据需要设置需要处理的异常，本文以MethodArgumentNotValidException为例  
  @ExceptionHandler(value=BadCredentialsException.class)  
  public Object MethodArgumentNotValidHandler(HttpServletRequest request,  
		  BadCredentialsException exception) throws Exception  
  {  
      System.out.println(exception);
        
      
      return null;  
  }  
}  
