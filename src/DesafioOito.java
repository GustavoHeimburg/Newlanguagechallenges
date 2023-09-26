import java.util.Scanner;

public class DesafioOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Seja bem-vindo " + nome);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Você é um estudante de Python? Digite 1 para Sim e 2 para Não:");
        int estudante = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Quer escolher qual entrada? Digite 1 para padrão e 2 para VIP:");
        int entrada = scanner.nextInt();
        scanner.nextLine();

        double valorEntrada = 0;
        if (entrada == 1) {
            valorEntrada = 20;
            System.out.println("Sua entrada padrão é R$" + valorEntrada);
        } else if (entrada == 2) {
            valorEntrada = 50;
            if (estudante == 1) {
                valorEntrada *= 0.50;
                System.out.println("Parabéns! Você é um estudante de Python, você ganhou 50% de desconto na entrada VIP.");
            }
            System.out.println("Sua entrada VIP é R$" + valorEntrada);
        } else {
            System.out.println("Desculpe, não entendi o tipo de entrada que você deseja comprar.");
        }

        if (idade >= 18) {
            System.out.println("Você é maior de idade, pode comprar ingressos da festa.");
        } else {
            System.out.println("Você é menor de idade, nao pode comprar o ingresso. a festa e permitida apenas para maiores de 18 anos.");
        }
    }
}
