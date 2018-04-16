package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.demain.DictionBakOption;
import com.example.demo.demain.DnaDictionBak;

@RestController
public class DnaDictionBakController {
	@Autowired
	private DictionBakOption dictionBakOption;
	@RequestMapping("/getcode")
	public String getCode() {
		DnaDictionBak bak = dictionBakOption.findByCode("MER_CERT_PUB.SYSTEM");
		System.out.println("======"+bak);
		DnaDictionBak bak2 = dictionBakOption.findByCodeAndCodeNo("1111", "22222222");
		DnaDictionBak bak3 = dictionBakOption.findByCodeOrCodeNo("1111", "22222222");
		return "succee bak";
	}
}
