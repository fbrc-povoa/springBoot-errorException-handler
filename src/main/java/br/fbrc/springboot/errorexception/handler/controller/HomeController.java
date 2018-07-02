package br.fbrc.springboot.errorexception.handler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.fbrc.springboot.errorexception.handler.domain.Foo;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/foo")
	public String getFoo(Model model) throws Exception {
		Foo foo = null;
		if(foo == null) throw new Exception("Foo is null");
		
		return "foo";
	}
}
