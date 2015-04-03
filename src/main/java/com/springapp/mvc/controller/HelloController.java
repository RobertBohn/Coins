package com.springapp.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
        List<String> names = new ArrayList<String>();
        names.add("Bob");
        names.add("Brian");
        names.add("Shawn");

        model.addAttribute("message", "Hello world!");
        model.addAttribute("names", names);

        return "hello";
	}
}