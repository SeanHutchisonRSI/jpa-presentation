package com.hutchison.jpa.presentation.immutability.bouquet;

public class Flower {
    private int petalCount;
    private boolean isRose;

    public void setPetalCount(int petalCount) {
        this.petalCount = petalCount;
    }

    public void setRose(boolean isRose) {
        this.isRose = isRose;
    }
}
