package br.com.caelum.contas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class olaMundoController {
	
	@RequestMapping("/olaMundoSpring")
	public String execute(){
		System.out.println("exec logica Spring-mvc");
		
		return "ok";
	}

}
