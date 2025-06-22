public class Media {
    public static void main(String[] args) {
        float nota01 = 8.10F;
        float nota02 = 2.90F;
        float nota03 = 5.94F;
        float mediafinal = calcularmedia(nota01, nota02, nota03);

        System.out.printf("A média final é: %.2f\n", mediafinal);

        if (mediafinal >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
    public static float calcularmedia(float nota01, float nota02, float nota03) {
        return (nota01 + nota02 + nota03) / 3;
    }
}

