package com.hutchison.jpa.presentation.factory.pattern.divider;

import java.util.Arrays;
import java.util.List;

public class DividerWithFactory {
    private final Double dividend;
    private final Double divisor;

    private DividerWithFactory(Double dividend, Double divisor) {
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

    public static DividerWithFactory make(Double dividend, Double divisor) {
        if (divisor.equals(0.0)) throw new RuntimeException("Divisor can't be 0");
        return new DividerWithFactory(dividend, divisor);
    }

    // Example input: "6 / 2"
    public static DividerWithFactory makeFromEquationString(String s) {
        // Split string
        List<String> splitString = Arrays.asList(s.split(" "));
        if (splitString.size() != 3) throw new RuntimeException("Bad string.");

        // Extract dividend and divisor
        Double dividend = Double.valueOf(splitString.get(0));
        Double divisor = Double.valueOf(splitString.get(1));
        if (divisor.equals(0.0)) throw new RuntimeException("Divisor can't be 0");

        // Instantiate object
        return new DividerWithFactory(dividend, divisor);
    }
}

//    // Example input: "6 / 2"
//    public static DividerWithFactory makeFromEquationString(String s) {
//        // Split string
//        List<String> splitString = Arrays.asList(s.split(" "));
//        if (splitString.size() != 3) throw new RuntimeException("Bad string.");
//
//        // Extract dividend and divisor
//        Double dividend = Double.valueOf(splitString.get(0));
//        Double divisor = Double.valueOf(splitString.get(1));
//        if (divisor.equals(0.0)) throw new RuntimeException("Divisor can't be 0");
//
//        // Instantiate object
//        return new DividerWithFactory(dividend, divisor);
//    }

//    public DividerWithFactory(String s) {
//        // Split string
//        List<String> splitString = Arrays.asList(s.split(" "));
//        if (splitString.size() != 3) throw new RuntimeException("Bad string.");
//
//        // Extract dividend and divisor
//        Double dividend = Double.valueOf(splitString.get(0));
//        Double divisor = Double.valueOf(splitString.get(1));
//        if (divisor.equals(0.0)) throw new RuntimeException("Divisor can't be 0");
//
//        this.dividend = dividend;
//        this.divisor = divisor;
//    }
