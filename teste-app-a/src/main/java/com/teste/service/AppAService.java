package com.teste.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.teste.domain.Funcionario;

@Service
public class AppAService {

	public List<Funcionario> getAllFuncionarios() {
		return Arrays.asList(new Funcionario("Tunicu", "Programador"),new Funcionario("Licão", "DBA"));
	}
	
}
