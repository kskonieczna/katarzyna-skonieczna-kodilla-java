    //Aby odróżnić stałe liczbowe typu long od stałych typu int
    // stosujemy w ich zapisie literę "L" na końcu liczby. Na przykład:
    //1016 - oznacza stałą typu int o wartości 1016
    //1016L - oznacza stałą typu long o wartości 1016

    //BigInteger dla liczb całkowitych oraz BigDecimal dla liczb zmiennoprzecinkowych

package com.kodilla.stream.sand;

import java.math.BigDecimal;

    public final class Europe implements SandStorage {
        @Override
        public BigDecimal getSandBeansQuantity() {
            BigDecimal sandQuantity = new BigDecimal("12345678901234567890");
            return sandQuantity;
        }
    }