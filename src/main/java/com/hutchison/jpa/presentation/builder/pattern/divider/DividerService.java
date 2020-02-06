package com.hutchison.jpa.presentation.builder.pattern.divider;

import com.hutchison.jpa.presentation.factory.pattern.divider.DividerWithFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DividerService {

    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void divideInputFactory() {
        Double dividend = Double.parseDouble(request("Enter a dividend"));
        Double divisor = Double.parseDouble(request("Enter a divisor"));
        // Instantiate with factory
        DividerWithFactory divider = DividerWithFactory.make(dividend, divisor);
        System.out.print(divider.divide());
    }

    public void divideInputBuilder() {
        Double dividend = Double.parseDouble(request("Enter a dividend"));
        Double divisor = Double.parseDouble(request("Enter a divisor"));
        // Instantiate with builder
        Divider divider = Divider.builder()
                .dividend(dividend)
                .divisor(divisor)
                .build();
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
