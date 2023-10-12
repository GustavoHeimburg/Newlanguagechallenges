package CursoJava;

import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Piazinho, se tu for de menor te do um cascudo bosta ");
        System.out.println("Se tu for de maior e dos meus papai ");
        System.out.println("Vamos la agora digite e veremos");

        System.out.println("Selecione uma opcao 1- + 2- -");
        int opcao = scanner.nextInt();

        System.out.println("Digite um classic numero papai:");
        int num1 = scanner.nextInt();

        System.out.println("Digite mais um numerozinho home");
        int num2 = scanner.nextInt();

        if (opcao == 1){
            System.out.println("O resultado é " + (num1 + num2));
        } else if (opcao == 2) {
            System.out.println("O resultado é " + (num1 - num2));
        }

        System.out.println("Digite sua idade meu patrao: ");
        int idade = scanner.nextInt();

        if (idade >= 18){
            System.out.println("Tu e fera meu guri");
        }else {
            System.out.println("Vai ganha uns cascudo bosta");
        }

    }
}
