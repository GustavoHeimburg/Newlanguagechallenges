package DesafiosJava;

import java.util.Scanner;

public class DesafioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();

        for (int x = 0; x<= num; x++) {
            if (x % 2 == 0) {
                System.out.println(x + " é par");
            }
        }
    }
}
