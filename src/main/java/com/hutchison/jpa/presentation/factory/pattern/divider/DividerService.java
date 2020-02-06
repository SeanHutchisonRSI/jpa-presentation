package com.hutchison.jpa.presentation.factory.pattern.divider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DividerService {

    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void divideInput1() {
        Double dividend = Double.parseDouble(request("Enter a dividend"));
        Double divisor = Double.parseDouble(request("Enter a divisor"));
        DividerWithFactory divider = DividerWithFactory.make(dividend, divisor);
        System.out.print(divider.divide());
    }

    public void divideInput2() {
        String input = request("Enter an equation to be divided in the format: n1 / n2");
        DividerWithFactory divider = DividerWithFactory.makeFromEquationString(input);
//        DividerWithFactory divider = new DividerWithFactory(input);
        System.out.print(divider.divide());
    }

    public String request(String question) {
        System.out.println(question);
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error reading line.");
        }
    }
}
