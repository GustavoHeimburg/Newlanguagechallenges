import java.util.Scanner;

public class DesafioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero par ou impar:");
        int num = scanner.nextInt();

        for (int x = 0; x <= num; x++) {
            if (x % 2 == 0) {
                System.out.println(x + " é par");
            } else {
                System.out.println(x + " é impar");
            }
        }

        System.out.println("Digite um numero positivo ou negativo:");
        int num2 = scanner.nextInt();

        if (num2 > 0) {
            System.out.println(num2 + " é positivo");
        } else if (num2 < 0) {
            System.out.println(num2 + " é negativo");
        } else {
            System.out.println("Você digitou zero");
        }
    }
}
