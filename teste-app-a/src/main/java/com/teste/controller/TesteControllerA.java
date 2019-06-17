package com.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.domain.Funcionario;
import com.teste.service.AppAService;

@RestController
@RequestMapping("/api-a")
public class TesteControllerA {
	
	@Autowired
	private AppAService appAService;
	
	@RequestMapping("/call-a")
	public String callA() {
		return "Chamada call a do serviço A";
	}
	
	@RequestMapping("/call-b-funcionarios")
	public List<Funcionario> callB() {
		return 	appAService.getAllFuncionarios();
	}
	
	
}
