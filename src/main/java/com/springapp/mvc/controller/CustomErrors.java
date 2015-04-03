package com.springapp.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *   Replaces the custom error configuration in xeb.xml
 *
 *   <error-page>
 *       <error-code>404</error-code>
 *       <location>/WEB-INF/pages/error.jsp</location>
 *   </error-page>
 */

@Controller
@RequestMapping("/")
public class CustomErrors {

    @RequestMapping("**")
    @ExceptionHandler(NoSuchRequestHandlingMethodException.class)
    public String handle404(ModelMap model, HttpServletRequest request, HttpServletResponse response, Object handler) {
        model.addAttribute("message", request.getRequestURI());
        return "error";
    }
}
