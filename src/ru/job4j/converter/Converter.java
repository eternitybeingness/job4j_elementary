package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70; /* формула перевода рублей в евры. */
    }

    public static int rubleToDollar(int value) {
        return value / 60; /* формула перевода рублей в доллары. */
    }

    public static void main(String[] args) {
        int ineuro = 140;
        int expectedeuro = 2;
        int outeuro = Converter.rubleToEuro(ineuro);
        boolean passedeuro = expectedeuro == outeuro;
        System.out.println("140 rubles are 2 euro. Test result : " + passedeuro);

        int indollar = 180;
        int expecteddollar = 3;
        int outdollar = Converter.rubleToDollar(indollar);
        boolean passeddollar = expecteddollar == outdollar;
        System.out.println("180 rubles are 3 dollars. Test result : " + passeddollar);
    }
}
