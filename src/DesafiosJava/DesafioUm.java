package DesafiosJava;

import java.util.Scanner;

public class DesafioUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a nota " + (i + 1));
            double nota = scanner.nextDouble();
            total += nota * 2;
        }
            double media = total / 10;

        System.out.println("A media do aluno é " +media);

        if (media >= 6){
            System.out.println("O aluno foi aprovado com sucesso!");
        }else {
            System.out.println("O aluno foi reprovado!");
        }
    }
}


