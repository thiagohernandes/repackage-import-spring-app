package com.teste.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-b")
public class TesteControllerB {

	@RequestMapping("/call-b")
	public String callB() {
		return "Chamada call b do serviço B";
	}
	
}
