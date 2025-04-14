package CA_aula7;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = 0;
        int resultado = 0;

        System.out.println("Digite um número e descubra sua tabuada de 1 a 10: ");
        num = scn.nextInt();

        for(int i = 1; i <= 10; i++){
            resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    scn.close();
    }
}
