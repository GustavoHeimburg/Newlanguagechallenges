import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma opcao: 1+ 2- 3* 4/" );
        int opcao = scanner.nextInt();

        System.out.println("Digite o primeiro numero: ");
        int numeroUm = scanner.nextInt();

        System.out.println("Digite o segundo numero");
        int numeroDois = scanner.nextInt();


        if (opcao == 1){
            System.out.println("A opcao escolhida foi a de adicao " + (numeroUm + numeroDois));
        } else if (opcao == 2) {
            System.out.println("A opcao foi de subtração " +(numeroUm - numeroDois));
        } else if (opcao == 3) {
            System.out.println("A opcao foi de multiplicacao " + (numeroUm * numeroDois));
        } else if (opcao == 4) {
            System.out.println("A opcao foi de divisao " +(numeroUm / numeroDois));
        }else{
            System.out.println("Use uma opcao valida :) ");
        }
    }
}
