package cat.itacademy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cat.itacademy.entidad.Fruita;
import cat.itacademy.service.FruitaService;

@Controller
public class FruitaControles {

	@Autowired
	private FruitaService servicio;
	
	@GetMapping({"/fruita/getAll","/frutas"})
	public String listarFrutas(Model model) {
		model.addAttribute("fruites", servicio.listarFruites());
		return "index"; // te devueve el html
	}
	
	@GetMapping({"/fruita/update","/update"})
	public String editarFruta(Model model) {
		Fruita fruita = new Fruita();
		model.addAttribute("fruita",fruita);
		return "update"; // te devueve el html
	}
	
	
	
}
//http://localhost:8080/fruita/add
//
//http://localhost:8080/fruita/update
//
//http://localhost:8080/fruita/delete/{id}
//
//http://localhost:8080/fruita/getOne/{id}
//
