package com.hutchison.jpa.presentation.lombok;

import lombok.Builder;
import lombok.Value;

//@ToString
//@EqualsAndHashCode
//@AllArgsConstructor
//@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
//@Getter

@Value
@Builder
public class Divider {
    private Double dividend;
    private Double divisor;

    public Double divide() {
        return dividend / divisor;
    }

    static class DividerBuilder {
        public Divider build() {
            if (divisor.equals(0.0)) throw new RuntimeException("Divisor can't be 0");
            return new Divider(dividend, divisor);
        }
    }
}

//static class DividerBuilder {
//    public Divider build() {
//        if (divisor.equals(0.0)) throw new RuntimeException("Divisor can't be 0");
//        return new Divider(dividend, divisor);
//    }
//}
