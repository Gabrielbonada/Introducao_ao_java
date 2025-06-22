import java.util.Scanner;

public class imparoupar {
    public static void main (String[] args ) {
        Scanner leitor =  new Scanner(System.in);
        System.out.println("Escolha um número:");
        int numero = leitor.nextInt();
           String parouimpar;
        if (numero % 2 == 0) {
            parouimpar = "par";
        } else {
            parouimpar = "ímpar";
        }
        System.out.println("O número escolhido foi: " + numero + " e ele é " + parouimpar );
    }
}
