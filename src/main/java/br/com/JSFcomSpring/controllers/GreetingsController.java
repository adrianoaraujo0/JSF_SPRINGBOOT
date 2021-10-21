package br.com.JSFcomSpring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.JSFcomSpring.model.Empresa;
import br.com.JSFcomSpring.repository.EmpresaRepository;

@RestController
public class GreetingsController {

	@Autowired
	EmpresaRepository empresaRepository;

	@RequestMapping("/OlaMundo")
	public String OlaMundo() {
		return "Hello World!";
	}

	// ****METODO PARA PERSISTIR****
	@PutMapping(value = "cadastrar")
	@ResponseBody
	public ResponseEntity<Empresa> cadastrar(@RequestBody Empresa empresa) {

		Empresa emp = empresaRepository.save(empresa);

		return new ResponseEntity<Empresa>(emp, HttpStatus.CREATED);

	}

	@GetMapping(value = "mostrarListar")
	@ResponseBody
	public ResponseEntity<List<Empresa>> listar() {

		List<Empresa> ListaEmpresa = empresaRepository.findAll();

		return new ResponseEntity<List<Empresa>>(ListaEmpresa, HttpStatus.OK);
	}

}
