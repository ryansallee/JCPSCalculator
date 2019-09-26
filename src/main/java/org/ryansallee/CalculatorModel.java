package org.ryansallee;

import java.math.BigDecimal;

public class CalculatorModel {
    public BigDecimal getNumber1() {
        return number1;
    }

    public void setNumber1(BigDecimal number1) {
        this.number1 = number1;
    }

    public BigDecimal getNumber2() {
        return number2;
    }

    public void setNumber2(BigDecimal number2) {
        this.number2 = number2;
    }

    private BigDecimal number1;
    private BigDecimal number2;

}
