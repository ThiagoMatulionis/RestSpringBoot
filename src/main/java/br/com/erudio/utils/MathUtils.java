package br.com.erudio.utils;

import br.com.erudio.exception.UnsupportedMathOperationException;

public class MathUtils {
	public static Double convertToDouble(String n) throws NumberFormatException {
		if(n == null) return 0D;
		
		n = n.replaceAll(",", ".");
		if(n.matches("[-+]?\\d+(\\.\\d+)?")) return Double.parseDouble(n);
		
		throw new UnsupportedMathOperationException("Please, send 2 numeric values");
	}
	
}
