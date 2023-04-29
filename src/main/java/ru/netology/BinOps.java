package ru.netology;

public class BinOps {
    public String sum(String a, String b) {
        int value1 = Integer.parseInt(a, 2);
        System.out.println("Значение 1 в 10-й системе " + value1);
        int value2 = Integer.parseInt(b, 2);
        System.out.println("Значение 2 в 10-й системе " + value2);
        int summa = value1 + value2;
        System.out.println("Сумма в 10-й системе " + summa);
        return Integer.toBinaryString(summa);
    }

    public String mult(String a, String b) {
        int value1 = Integer.parseInt(a, 2);
        System.out.println("Значение 1 в 10-й системе " + value1);
        int value2 = Integer.parseInt(b, 2);
        System.out.println("Значение 2 в 10-й системе " + value2);
        int multi = value1 * value2;
        System.out.println("Умножение в 10-й системе " + multi);
        return Integer.toBinaryString(multi);
    }
}
