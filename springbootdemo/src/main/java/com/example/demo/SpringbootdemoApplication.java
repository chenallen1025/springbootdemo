package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//默认类中的方法都会以json的格式返回

@RestController
public class SpringbootdemoApplication {
	@RequestMapping("/hello1")
    public String home()
    {
        return "Hello World! filter";
    }
	/*public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}*/
}
