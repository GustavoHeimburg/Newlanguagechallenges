import java.util.*;

public class DesafioSeis {
    public static void main(String[] args) {
        int[] values = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};
        int positivo = 0;
        int negativo = 0;
        int par = 0;
        int impar = 0;

        System.out.println("Whole Values Table:");
        for (int value : values) {
            System.out.println(value);
            if (value > 0) {
                positivo++;
            } else if (value < 0) {
                negativo++;
            }if (par >0){
                par++;
            } else if (impar <0) {
                impar--;
            }
        }

        System.out.println("Positivo: " + positivo);
        System.out.println("Negativo: " + negativo);
    }
}