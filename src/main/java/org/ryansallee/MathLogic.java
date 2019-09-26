package org.ryansallee;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class MathLogic {
    public static BigDecimal calculate(BigDecimal number1, BigDecimal number2, String operator)
    {
        switch(operator){
            case "+":
                return number1.add(number2);
            case "-":
                return number1.subtract(number2);
            case "*":
                return number1.multiply(number2);
            case "/":
                return number1.divide(number2, new MathContext(4));
        }
        System.out.println("Unrecognized operator");
        return new BigDecimal("0");
    }
}
