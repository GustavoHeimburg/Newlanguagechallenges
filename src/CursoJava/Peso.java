package CursoJava;

import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
         int peso = scanner.nextint();

        System.out.println("Seu peso é " +peso);
    }
}
