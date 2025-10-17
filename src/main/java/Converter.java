package main.java;


/*
  @author   savina daria
  @project   Int_Rom_Converter
  @class  Converter
  @version  1.0.0
  @since 17.10.25 - 22:52
*/

public class Converter {


    private static final int[] VALUES = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4,
            1
    };

    private static final String[] ROMANS = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV",
            "I"
    };

    public Converter() {
    }

    /**
     * Основний метод перетворення у римське число
     */
    public String convert(int num) {
        if (num <= 0 || num > 9999) {
            throw new IllegalArgumentException("Value must be in range 1..3999");
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < VALUES.length; i++) {
            int val = VALUES[i];
            String sym = ROMANS[i];
            while (num >= val) {
                sb.append(sym);
                num -= val;
            }
        }

        return sb.toString();
    }

}
