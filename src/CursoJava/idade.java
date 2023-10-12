package CursoJava;

import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Piazinho, se tu for de menor te do um cascudo bosta ");
        System.out.println("Se tu for de maior e dos meus papai ");
        System.out.println("Vamos la agora digite e veremos");

        System.out.println("Digite sua idade meu patrao: ");
        int idade = scanner.nextInt();



        if (idade >= 18){
            System.out.println("Tu e fera meu guri");
        }else {
            System.out.println("Vai ganha uns cascudo bosta");
        }

    }
}
