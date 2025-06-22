import java.util.Scanner;

public class numeromaior {

    public static void main (String[]args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("seu primeiro número é:");
        int numero = leitor.nextInt();
        System.out.println("seu segundo número é:");  
        int numero2 =   leitor.nextInt();
        
        int maior = maiorNumero(numero, numero2);
        System.out.println("O maior número é: " + maior);

        leitor.close();
    }

    public static int maiorNumero(int a, int b) {
        return (a >= b) ? a : b;
    }
}