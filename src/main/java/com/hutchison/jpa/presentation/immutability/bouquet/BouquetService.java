package com.hutchison.jpa.presentation.immutability.bouquet;

import java.util.ArrayList;
import java.util.List;

public class BouquetService {

    public List<Bouquet> makeBouquets() {
        // build first bouquet
        Flower flower1 = new Flower();
        flower1.setPetalCount(6);
        flower1.setRose(true);

        Flower flower2 = new Flower();
        flower2.setPetalCount(9);
        flower2.setRose(false);

        List<Flower> flowers = new ArrayList<>();
        flowers.add(flower1);
        flowers.add(flower2);

        Bouquet bouquet1 = new Bouquet();
        bouquet1.setFlowers(flowers);

        // build second bouquet
        flower1.setPetalCount(4);
        flower2.setPetalCount(8);
        Bouquet bouquet2 = new Bouquet();
        bouquet2.setFlowers(flowers);

        List<Bouquet> bouquets = new ArrayList<>();
        bouquets.add(bouquet1);
        bouquets.add(bouquet2);
        return bouquets;
    }

}
