public class FormatosNumericos {
    public static void main(String[] args) {
        int decimal = 100;
        int octal = 0100;
        int hexa = 0x100;

        System.out.println("===VALORES EM DIFERENTES BASES===");
        System.out.println("Numero Original:");
        System.out.printf("Decimal:    %4d\n", decimal);
        System.out.printf("Octal:      %4d\n", octal);
        System.out.printf("Hexa:       %4d\n", hexa);
        
        System.out.println("\nEm Octal (base 8):");
        System.out.printf("Decimal:    %4o\n", decimal);
        System.out.printf("Octal:      %4o\n", octal);
        System.out.printf("Hexa:       %4o\n", hexa);

        System.out.println("\nEm Hexadecimal (base 16)");
        System.out.printf("Decimal:    %4x\n", decimal);
        System.out.printf("Octal:      %4x\n", octal);
        System.out.printf("Hexa:       %4x\n", hexa);


    }
}
