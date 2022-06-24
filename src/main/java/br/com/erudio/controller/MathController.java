package br.com.erudio.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.services.MathService;
import br.com.erudio.utils.MathUtils;

@RestController
public class MathController {
	
	@RequestMapping(value = "/sum/{x}/{y}", method = RequestMethod.GET)
	public Double sum(@PathVariable("x") String x, @PathVariable("y") String y) {
		return MathUtils.convertToDouble(x) + MathUtils.convertToDouble(y);
	}
	
	@RequestMapping(value = "/subtract/{x}/{y}", method = RequestMethod.GET)
	public Double subtract(@PathVariable("x") String x, @PathVariable("y") String y) {
		return MathUtils.convertToDouble(x) - MathUtils.convertToDouble(y);
	}
	
	@RequestMapping(value = "/multiply/{x}/{y}", method = RequestMethod.GET)
	public Double multiply(@PathVariable("x") String x, @PathVariable("y") String y) {
		return MathUtils.convertToDouble(x) * MathUtils.convertToDouble(y);
	}
	
	@RequestMapping(value = "/divide/{x}/{y}", method = RequestMethod.GET)
	public Double divide(@PathVariable("x") String x, @PathVariable("y") String y) {
		return MathUtils.convertToDouble(x) / MathUtils.convertToDouble(y);
	}
	
	@RequestMapping(value = "/expression/{x}", method = RequestMethod.GET)
	public Double expression(@PathVariable("x") String x) {
		System.out.println("Received a request to calculate " + x);
		
		Double result = MathService.calculateExpression(x);
		
		return result;
	}
	
}
