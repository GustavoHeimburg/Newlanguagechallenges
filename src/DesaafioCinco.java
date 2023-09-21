import java.util.Scanner;

public class DesaafioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numeros de horas que trabalhou");
        float horastrabalhadas = scanner.nextFloat();
        System.out.println("Digite o valor da hora trabalhada");
        float valorHora = scanner.nextFloat();
        System.out.println("DIgite o numero das horas extras");
        float valorHoraEx = scanner.nextFloat();
        System.out.println("Digite o valor das horas extras");
        float valorHoraExd = scanner.nextFloat();

        double remuneracao = (horastrabalhadas + valorHora + valorHoraEx + valorHoraExd);
        System.out.println("O valor do salario é: " +remuneracao);

    }
    }


