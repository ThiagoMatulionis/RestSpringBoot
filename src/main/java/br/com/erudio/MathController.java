package br.com.erudio;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exception.UnsupportedMathOperationException;
import br.com.erudio.utils.MathUtils;

@RestController
public class MathController {
	
	@RequestMapping(value = "/sum/{x}/{y}", method = RequestMethod.GET)
	public Double sum(@PathVariable("x") String x, @PathVariable("y") String y) {
		return MathUtils.convertToDouble(x) + MathUtils.convertToDouble(y);
	}
	
}
