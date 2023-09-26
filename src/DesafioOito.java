import java.util.Scanner;

public class DesafioOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();
        System.out.println("DIgite sua idade:");
        int idade = scanner.nextInt();
        System.out.println("Voce e estudante de Python?");
        int estudante = scanner.nextInt();

        System.out.println("Você é um estudante de Python? ");
        String resposta = scanner.nextLine();

        System.out.println("Quer escolher qual entrada? Digite 1 para padrao e 2 para VIP");
        int entrada = scanner.nextInt();

        if (entrada == 1){
            System.out.println("Sua entrada padrao e R$20" + entrada);
        }else {
            entrada == 2

        }

        if (idade >= 18){
            System.out.println("Voce e maior de idade, pode comprar ingressos da festa " + idade);
        }else {
            System.out.println("Voce é menor de idade " + idade);
        }
    }
}
