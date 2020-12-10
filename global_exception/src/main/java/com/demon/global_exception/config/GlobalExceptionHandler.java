package com.demon.global_exception.config;

import com.demon.global_exception.entity.ErrorInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
//通过使用@ControllerAdvice定义统一的异常处理类
@ControllerAdvice
public class GlobalExceptionHandler {
//用来定义函数针对的异常类型，最后将Exception对象和请求URL映射到error.html中
    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName("error");
        return mav;
    }
    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ErrorInfo myException(HttpServletRequest request,MyException myException){
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setCode(ErrorInfo.ERROR);
        errorInfo.setData("data");
        errorInfo.setUrl(request.getRequestURL().toString());
        String message=myException.getMessage();
        errorInfo.setMessage(myException.getMessage());
        return errorInfo;
    }
}
