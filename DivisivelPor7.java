import java.util.Scanner;

public class DivisivelPor7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int inicio, fim;

        System.out.println("Digite onde o range começa:");
        inicio = scn.nextInt();
        System.out.println("E onde termina:");
        fim = scn.nextInt();

        for(int i = inicio; i <= fim; i++){
            if(i % 7 == 0){
                System.out.println("Neste range o primeiro número divisível por 7 é: " + i);
                break;
            }else{
                System.out.println(i + " não é divisíveis por 7");
            }
        }
    }
}