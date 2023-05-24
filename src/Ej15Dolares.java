import java.util.Scanner;

public class Ej15Dolares {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuantos dolares tiene Guillermo?");
        float N = entrada.nextFloat();
        System.out.println("Guillermo tiene " + N + " dolares");
        float N2 = N/2;
        System.out.println("Luis tiene " + N2 + " dolares");
        float N3 = (N+N2)/2;
        System.out.println("Luis tiene " + N3 + " dolares");
        float total = N+N2+N3;
        System.out.println("Juntos tienen " + total + " dolares");
    }
}
