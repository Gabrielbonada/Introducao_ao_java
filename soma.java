import java.util.Scanner;

public class soma {
    public static void main (String[] args ){

        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite um número inteiro:");
        int numeroInteiro = leitor.nextInt();
        System.out.println("voce digitou: " + numeroInteiro); 

        System.out.println("digite seu segundo número inteiro:");
        int segundoNumeroInteiro = leitor.nextInt();
        System.out.println("o segundo número digitado foi:" + segundoNumeroInteiro );

        leitor.close();

        int somatorio = numeroInteiro + segundoNumeroInteiro;
        System.out.println("A soma entre os dois número escolhidos é:" + somatorio );
    }
    public static int somatorio ( int numeroInteiro, int segundoNumeroInteiro ){
        return numeroInteiro + segundoNumeroInteiro ;
    }
}
