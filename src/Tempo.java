import java.util.Scanner;

public class Tempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite algo: ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("amanda")) {
            System.out.println("Não tenho tempo para nada!");
        } else {
            System.out.println("Sou uma pessoa normal que não reclamo de tempo e da vida");
        }
    }
}
