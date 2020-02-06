package com.hutchison.jpa.presentation.builder.pattern.bouquet;

public class Flower {
    private final int petalCount;
    private final boolean isRose;

    private Flower(int petalCount, boolean isRose) {
        this.petalCount = petalCount;
        this.isRose = isRose;
    }

    public static FlowerBuilder builder() {
        return new FlowerBuilder();
    }

    public FlowerBuilder toBuilder() {
        return new FlowerBuilder()
                .petalCount(this.petalCount)
                .isRose(this.isRose);
    }

    static class FlowerBuilder {
        private int petalCount;
        private boolean isRose;

        public FlowerBuilder petalCount(int petalCount) {
            this.petalCount = petalCount;
            return this;
        }

        public FlowerBuilder isRose(boolean isRose) {
            this.isRose = isRose;
            return this;
        }

        public Flower build() {
            return new Flower(petalCount, isRose);
        }
    }
}
