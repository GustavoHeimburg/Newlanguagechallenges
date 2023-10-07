package CursoJava;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma opcao: 1+ 2- 3* 4/" );
        float opcao = scanner.nextFloat();

        System.out.println("Digite o primeiro numero: ");
        float numeroUm = scanner.nextFloat();

        System.out.println("Digite o segundo numero");
        float numeroDois = scanner.nextFloat();


        if (opcao == 1){
            System.out.println("A opcao escolhida foi a de adicao. E o resultado é " + (numeroUm + numeroDois));
        } else if (opcao == 2) {
            System.out.println("A opcao foi de subtração. E o resultado é " +(numeroUm - numeroDois));
        } else if (opcao == 3) {
            System.out.println("A opcao foi de multiplicacao. E o resultado é " + (numeroUm * numeroDois));
        } else if (opcao == 4) {
            System.out.println("A opcao foi de divisao. E o resultado é " +(numeroUm / numeroDois));
        }else{
            System.out.println("Use uma opcao valida :) ");
        }
    }
}
