package br.fbrc.springboot.errorexception.handler.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {
	
	@ExceptionHandler(Exception.class)
	public String exceptionHandler(Exception exception, Model model) {
		model.addAttribute("exception", exception.getMessage());
		return "globalControllerHandler";
	}

}
