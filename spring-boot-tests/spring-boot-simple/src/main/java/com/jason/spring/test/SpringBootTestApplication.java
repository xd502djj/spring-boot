package com.jason.spring.test;

import com.ke.utopia.scm.wenger.message.service.QwMsgService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class SpringBootTestApplication {
	@Resource
	private QwMsgService qwMsgService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestApplication.class, args);
	}
}