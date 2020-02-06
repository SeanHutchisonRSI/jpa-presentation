package com.hutchison.jpa.presentation.immutability.bouquet;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private List<Flower> flowers;

    public Bouquet() {
        flowers = new ArrayList<>();
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }
}
