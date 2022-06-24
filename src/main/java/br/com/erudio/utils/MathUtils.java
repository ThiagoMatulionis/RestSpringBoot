package br.com.erudio.utils;

import br.com.erudio.exception.UnsupportedMathOperationException;

public class MathUtils {
	
	private MathUtils() {}
	
	public static Double convertToDouble(String n) throws NumberFormatException {
		if(n == null) return 0D;
		
		n = n.replaceAll(",", ".");
		if(n.matches("[-+]?\\d+(\\.\\d+)?")) return Double.parseDouble(n);
		
		throw new UnsupportedMathOperationException("Please, send 2 numeric values");
	}
	
	public static Double calculate(char operation, Double[] numbers) {
		if(numbers.length != 2) throw new UnsupportedMathOperationException("Expected exactly 2 numbers");
		
		switch (operation) {
			case '+':
				return numbers[0] + numbers[1];
			case '-':
				return numbers[0] - numbers[1];
			case '*':
				return numbers[0] * numbers[1];				
			case '~':
				return numbers[0] / numbers[1];		
	
			default:
				throw new UnsupportedMathOperationException("Unsupported math operator");
		}
	}
	
	public static char findOperationInString(String expression) {
		char[] listExpression = expression.toCharArray();
		
		for (char c : listExpression) {
			if(c == '+' || c == '-' || c == '*' || c == '~') return c;
		}
		
		throw new UnsupportedMathOperationException("Unable to detect one supported operator");
	}
}
