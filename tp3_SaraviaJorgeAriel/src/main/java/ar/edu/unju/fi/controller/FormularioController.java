package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormularioController {
	@GetMapping("/formulario")
    public String mostrarIndex() {
        return "form-cliente.html";
    }
}
