package CA_aula7;
import java.util.Scanner;

public class NumeroN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = 0;
        int result = 0;

        System.out.println("Digite um número inteiro");
        num = scn.nextInt();

        for(int i = 2; i <= num; i+= 2){
                result += i;
        }
    
        System.out.println("A soma dos números pares de 1 até " + num + " é: " + result);
        scn.close();
    }
}