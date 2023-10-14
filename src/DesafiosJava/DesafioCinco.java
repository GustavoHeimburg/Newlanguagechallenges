package DesafiosJava;

import java.util.Scanner;

public class DesafioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de horas que trabalhou");
        float horasTrabalhadas = scanner.nextFloat();
        System.out.println("Digite o valor da hora trabalhada");
        float valorHoraTrabalhada = scanner.nextFloat();
        System.out.println("Digite o número de horas extras");
        float horasExtras = scanner.nextFloat();
        System.out.println("Digite o valor das horas extras");
        float valorHoraExtras = scanner.nextFloat();

        double remuneracao = (horasTrabalhadas * valorHoraTrabalhada) + (horasExtras * valorHoraExtras);
        System.out.println("O valor do salário é: " + remuneracao);

    }
    }


