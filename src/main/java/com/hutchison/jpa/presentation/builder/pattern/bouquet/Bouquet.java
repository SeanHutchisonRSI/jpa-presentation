package com.hutchison.jpa.presentation.builder.pattern.bouquet;

import java.util.Collections;
import java.util.List;

public class Bouquet {
    private final List<Flower> flowers;

    private Bouquet(List<Flower> flowers) {
        this.flowers = Collections.unmodifiableList(flowers);
    }

    public static BouquetBuilder builder() {
        return new BouquetBuilder();
    }

    public BouquetBuilder toBuilder() {
        return new BouquetBuilder()
                .flowers(flowers);
    }

    static class BouquetBuilder {
        private List<Flower> flowers;

        public BouquetBuilder flowers(List<Flower> flowers) {
            this.flowers = flowers;
            return this;
        }

        public Bouquet build() {
            return new Bouquet(flowers);
        }
    }
}
