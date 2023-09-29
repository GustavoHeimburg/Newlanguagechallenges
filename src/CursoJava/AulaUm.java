package CursoJava;

import java.util.Scanner;

public class AulaUm {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        System.out.println("Ola, digite seu nome:- ");
        String nome = var.nextLine();
        System.out.println("Seja bem vindo " +nome);

        System.out.println("Digite a opcao:");
        System.out.println("1-Adicao \n 2-Subtracao");

        System.out.println("Qual é a sua idade?");
        int idade = var.nextInt();

        int opcao = var.nextInt();
        var.nextLine();

        System.out.println("Digite o primeiro numero");
        float num1 = var.nextFloat();
        var.nextLine();

        System.out.println("Digite o sugundo numero");
        float num2 = var.nextFloat();
        var.nextLine();



        if (idade >=18){
            System.out.println("Voce é maior de idade e tem " +idade+ " anos de idade");
        }else {
            System.out.println("Voce e menor de idade, com " +idade+ " anos. Apenas maiores de 18 anos podem participar");
        }if (opcao == 1){
            System.out.println("Result. soma" + (num1 + num2));
        } else if (opcao == 2) {
            System.out.println("Result. soma" + (num1 + num2));
        }
        int operacao = 2;
        switch (operacao){
            case '+':
                System.out.println("Operação de adicao");
                break;
            case '-':
                System.out.println("Opcao de subtracao");
        }
    }

}
