package com.example.web;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.util.NeoProperties;

@RestController
public class HelloController {
	@Autowired
	private NeoProperties properties;
	 @RequestMapping("/hello")
		public String hello(Locale locale, Model model) {
		 	System.out.println(properties.getTitle());
			return "hello world";
		}
}
