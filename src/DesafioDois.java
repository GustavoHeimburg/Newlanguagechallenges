package com.example.demo;

import java.util.Scanner;

public class DesafioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade:");
        int days = scanner.nextInt();

        int anos = days / 365;
        days = days % 365;
        int meses = days / 30;
        days = days % 365;

        System.out.println("A idade é: " + anos + " anos, " + meses + " meses e " + days + " dias.");
    }
}