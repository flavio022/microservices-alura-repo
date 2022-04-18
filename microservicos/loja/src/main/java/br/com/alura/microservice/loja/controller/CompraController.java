package br.com.alura.microservice.loja.controller;

import br.com.alura.microservice.loja.model.Compra;
import br.com.alura.microservice.loja.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.loja.controller.dto.CompraDTO;

@RestController
@RequestMapping("/compra")
public class CompraController {

	@Autowired
	private CompraService compraService;
	@RequestMapping(method = RequestMethod.POST)
	public Compra realizaCompra(@RequestBody CompraDTO compra) {
		System.out.println(compra.getEndereco().getEstado());
		return  compraService.realizaCompra(compra);
	}
}
