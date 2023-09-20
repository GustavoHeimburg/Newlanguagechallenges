import java.util.Scanner;

public class DesafioQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota A: ");
        double notaA = scanner.nextDouble();
        System.out.println("Digite a nota B: ");
        double notaB = scanner.nextDouble();
        System.out.println("Digite a nota C: ");
        double notaC = scanner.nextDouble();

        double mediaCalc = (notaA * 2 + notaB * 3 + notaC * 5) / 10;

        if (mediaCalc >= 6){
            System.out.println("A sua media final é: " +mediaCalc+ " Parabens por sua media!");
        }else {
            System.out.println("A sua media final é " +mediaCalc+ " Talvez na proxima voce se da melhor ;) ");
        }
    }
}
