public class UsuarioInfo {

    public static void main (String[] args ){
        String nome = "gabriel";
        int idade = 19;
        float peso = 120F;
        double altura = 1.78;
        boolean estudante = true;
        boolean programador = true;
        char genero = 'M'; 
        //função
        float imc = calcularImc(peso, altura);
        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Nome: " + nome);
        System.out.println("idade:" + idade );
        System.out.println("Altura: " + altura + "m");
        System.out.println("Peso:" + peso + "kg");
        System.out.println("Estudante? " + estudante);
        System.out.println("Programador? " + programador);
        System.out.println("Gênero: " + genero);
    }
    public static float calcularImc(float peso, double altura){
        return peso /(float)(altura*altura);
    }
}
