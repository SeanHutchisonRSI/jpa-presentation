package com.hutchison.jpa.presentation.builder.pattern.divider;

public class Divider {
    private final Double dividend;
    private final Double divisor;

    private Divider(Double dividend, Double divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public Double divide() {
        return dividend / divisor;
    }

    public Double getDividend() {
        return dividend;
    }

    public Double getDivisor() {
        return divisor;
    }

    public static DividerBuilder builder() {
        return new DividerBuilder();
    }

    static class DividerBuilder {
        private Double dividend;
        private Double divisor;

        public DividerBuilder dividend(Double dividend) {
            this.dividend = dividend;
            return this;
        }

        public DividerBuilder divisor(Double divisor) {
            this.divisor = divisor;
            return this;
        }

        public Divider build() {
            if (divisor.equals(0.0)) throw new RuntimeException("Divisor can't be 0");
            return new Divider(dividend, divisor);
        }
    }
}
