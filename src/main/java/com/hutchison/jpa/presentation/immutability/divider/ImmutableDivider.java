package com.hutchison.jpa.presentation.immutability.divider;

public class ImmutableDivider {
    private final double dividend;
    private final double divisor;

    public ImmutableDivider(double dividend, double divisor) {
        if (divisor == 0.0) throw new RuntimeException("Divisor can't be 0");
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public double divide() {
        return dividend / divisor;
    }

    public double getDividend() {
        return dividend;
    }

    public double getDivisor() {
        return divisor;
    }
}
