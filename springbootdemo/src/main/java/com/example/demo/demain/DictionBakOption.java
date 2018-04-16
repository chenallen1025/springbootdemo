package com.example.demo.demain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DictionBakOption extends JpaRepository<DnaDictionBak, Long>{
	DnaDictionBak findByCode(String code);
	DnaDictionBak findByCodeAndCodeNo(String code,String CodeNo);
	DnaDictionBak findByCodeOrCodeNo(String code,String CodeNo);
}
