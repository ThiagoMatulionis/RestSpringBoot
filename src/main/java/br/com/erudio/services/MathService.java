package br.com.erudio.services;

import br.com.erudio.utils.MathUtils;

public class MathService {
	public static Double calculateExpression(String expression) {
		String[] strNumbers= expression.split("\\+|\\-|\\*|\\~");
		System.out.println("Found numbers: " + strNumbers);
		
		char operation = MathUtils.findOperationInString(expression);
		
		Double[] numbers = new Double[strNumbers.length];
		
		for (int i = 0; i < strNumbers.length; i++) {
			numbers[i] = MathUtils.convertToDouble(strNumbers[i]);
		}
		
		return MathUtils.calculate(operation, numbers);
	}
}
