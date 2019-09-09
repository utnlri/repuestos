package edu.utn.frro.ds.repuestos.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//ControladorHome --> Este controlador está fuera del alcance del C.U. del enunciado de Repuestos.
//Se usa para poder devolver una view con el menu principal utilizado en la implementación del caso Repuestos
//[LRI 11/8/19]


@Controller
public class ControladorHome {
	
	@RequestMapping("/") // indica el path en la url web
	public String home(Model model) {
		return "home"; // nombre de la vista que se debe cargar --> cargará la página resources/templates/home.html
	}

}
