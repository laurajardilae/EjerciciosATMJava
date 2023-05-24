import java.util.Scanner;

public class Ej17Semanas {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de horas");
        int horas = entrada.nextInt();
        int semanas = horas/168;
        int dias = horas%168;
        int hora = dias%24;
        System.out.println("Semanas: " + semanas + " Días: " + dias + " Horas: " + hora);

    }
}
