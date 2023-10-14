package DesafiosJava;

import java.util.Scanner;

public class DesafioSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Responda com 1 para pedestre e 2 para motorista");
        System.out.println("Você é pedestre ou motorista?.");
        int tipoUsuario = scanner.nextInt();
        if (tipoUsuario == 1) {
            System.out.println("Você é um pedestre.");
            System.out.println("Você está na faixa de pedestres? Responda com 1 para sim e 2 para não.");
            int naFaixa = scanner.nextInt();
            System.out.println("O sinal esta vermelho?  Responda com 1 para sim e 2 para não.");
            int sinal = scanner.nextInt();

            if (naFaixa == 1 && sinal == 1) {
                System.out.println("Você pode atravessar a rua.");
            } else {
                System.out.println("Você não pode atravessar a rua.");
            }
        } else if (tipoUsuario == 2 ) {
            System.out.println("Você é um motorista.");
            System.out.println("Você está usando o cinto de segurança? Responda com 1 para sim e 2 para não.");
            int cinto = scanner.nextInt();
            System.out.println("Voce ingeriu bebida alcolica? Responda com 1 para sim e 2 para não.");
            int beber = scanner.nextInt();
            System.out.println("O sinal está verde? Responda com 1 para sim e 2 para não.");
            int sinal = scanner.nextInt();

            if(cinto == 1 && beber == 2 && sinal == 1){
                System.out.println("Você pode dirigir com segurança");
            } else {
                System.out.println("Você não pode dirigir");
            }
        } else {
            System.out.println("Resposta não reconhecida.");
        }
    }
}