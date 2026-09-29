class CalculadoraMetodos {
    public static double calcularMedia(double n1, double n2, double n3){
        return (n1+n2+n3)/3;
    }

    public static boolean aprovadoStatus(double media) {
        return media >= 7;
    }
    public static void main(String[] args) {
        double n1 = 8.0;
        double n2 = 7.5;
        double n3 = 4.3;

        double media = calcularMedia(n1, n2, n3);
        boolean aprovado = aprovadoStatus(media);

        System.out.printf("Suas notas foram: %.1f %.1f %.1f\n", n1, n2, n3);
        System.out.printf("Sua média foi: %.1f\n", media);
        System.out.printf(aprovado?"Aprovado":"Reprovado");
    }
}