import java.util.Scanner;

public class triangulo {
    public static void main ( String[] args ){
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite a base do seu triangulo");
        float base = leitor.nextFloat();
        System.out.println("A base do seu triangulo é:" + base );

        System.out.println("digite a base do seu triangulo");
        float altura = leitor.nextFloat();
        System.out.println("A altura do seu triangulo é:" + altura );
        leitor.close();

        float area = calculoAreaTriangulo(base, altura);
        System.out.println("o area do seu triangulo é:" + area);
    }
    public static float calculoAreaTriangulo ( float base, float altura ){
        return ( base * altura) / 2;
    }
    
}
