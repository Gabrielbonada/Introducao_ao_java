import java.util.Scanner;

public class temperatura {
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("escolha a temperatura em clecius: ");
        float temperatura = leitor.nextFloat();
        System.out.println("A temperatura escolhida é: " + temperatura );
        float fahrenheit =  transformartemperatura(temperatura);
        System.out.println("sua temperatura em fahrenheit é:" + fahrenheit );
    }
    public static float transformartemperatura ( float temperatura){
        return (5/9) + 32;
    }
}
