package ru.netology;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println("Сумма в 2-ой системе " + bins.sum("101100", "101101"));
        System.out.println();
        System.out.println("Умножение в 2-ой системе " + bins.mult("1010", "1101"));
    }
}