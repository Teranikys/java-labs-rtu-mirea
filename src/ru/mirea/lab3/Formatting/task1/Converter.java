package ru.mirea.lab3.Formatting.task1;

import java.text.NumberFormat;
import java.util.Locale;

public class Converter {
    public static String toDollar(double number) {
        Locale.setDefault(Locale.US);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        return numberFormat.format(number);
    }
    public static String toEuro(double number) {
        Locale.setDefault(Locale.FRANCE);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        return numberFormat.format(number);
    }
    public static String toYuan(double number) {
        Locale.setDefault(Locale.CHINA);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        return numberFormat.format(number);
    }
    public static String toPound(double number) {
        Locale.setDefault(Locale.UK);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        return numberFormat.format(number);
    }
}
