package com.hutchison.jpa.presentation.builder.pattern.bouquet;

import java.util.Arrays;
import java.util.List;

public class BouquetService {

    public List<Bouquet> makeBouquetsWithBuilder() {
        // build first bouquet
        Flower flower1 = Flower.builder()
                .petalCount(6)
                .isRose(true)
                .build();

        Flower flower2 = Flower.builder()
                .petalCount(9)
                .isRose(false)
                .build();

        Bouquet bouquet1 = Bouquet.builder()
                .flowers(Arrays.asList(flower1, flower2))
                .build();

        // build second bouquet
        Flower flower3 = flower1.toBuilder()
                .petalCount(4)
                .build();
        Flower flower4 = flower2.toBuilder()
                .petalCount(8)
                .build();
        Bouquet bouquet2 = Bouquet.builder()
                .flowers(Arrays.asList(flower3, flower4))
                .build();

        return Arrays.asList(bouquet1, bouquet2);
    }

}
