package com.hutchison.jpa.presentation.immutability.divider;

public class MutableDivider {
    private double dividend;
    private double divisor;

    public MutableDivider(double dividend, double divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public double divide() {
        if (divisor == 0.0) throw new RuntimeException("Divisor can't be 0");
        return dividend / divisor;
    }

    // Getters / Setters
    public double getDividend() {
        return dividend;
    }

    public void setDividend(double dividend) {
        this.dividend = dividend;
    }

    public double getDivisor() {
        return divisor;
    }

    public void setDivisor(double divisor) {
        this.divisor = divisor;
    }
}


//        if (divisor.equals(0.0)) throw new RuntimeException("Divisor can't be 0");
