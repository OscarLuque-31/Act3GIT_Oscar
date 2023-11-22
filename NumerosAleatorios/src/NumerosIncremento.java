import java.util.Scanner;

public class NumerosIncremento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introducir el primer número y validar
        System.out.print("Introduce el primer número: ");
        int primerNumero = scanner.nextInt();

        // Introducir el segundo número y validar (debe ser distinto al primer número)
        int segundoNumero;
        do {
            System.out.print("Introduce el segundo número (distinto al primero): ");
            segundoNumero = scanner.nextInt();
        } while (segundoNumero == primerNumero);

        // Introducir el tercer número
        System.out.print("Introduce el tercer número: ");
        int tercerNumero = scanner.nextInt();

        scanner.close();

        // Asegurar que primerNumero es el menor
        if (segundoNumero < primerNumero) {
            int temp = primerNumero;
            primerNumero = segundoNumero;
            segundoNumero = temp;
        }

        // Mostrar los números comprendidos e incrementar de 7 en 7
        System.out.println("Números comprendidos entre " + primerNumero + " y " + segundoNumero + " (incrementando de 7 en 7):");

        for (int i = primerNumero; i <= segundoNumero; i += 7) {
            System.out.print(i + " ");
        }

        // Mostrar el tercer número si se encuentra entre el primero y el segundo
        if (tercerNumero > primerNumero && tercerNumero < segundoNumero) {
            System.out.println("\nEl tercer número " + tercerNumero + " se encuentra entre " + primerNumero + " y " + segundoNumero);
        }
    }
}

