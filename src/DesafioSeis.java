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
        System.out.println("Digite um numero positivo ou negativo :");
        int num2 = scanner.nextInt();

        for (int x = 0; x <= num2; x++) {
            if (x > 0) {
                System.out.println(x + " é positivo");
            } else if (x < 0) {
                System.out.println(x + " é negativo");
            } else {
                System.out.println(x + " é zero");
            }
        }
    }
}
