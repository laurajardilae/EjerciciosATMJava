import java.util.Scanner;

public class Ej16Notas {
    public static void main(String[] args){
        float participacion,parcial1, parcial2, examenFinal, total;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese en orden las calificaciones: Participación, primer parcial, segundo parcial, examen final");
        participacion = entrada.nextFloat();
        parcial1 = entrada.nextFloat();
        parcial2 = entrada.nextFloat();
        examenFinal = entrada.nextFloat();
        total = (participacion * 0.1f) + (parcial1 * 0.25f) + (parcial2*0.25f) + (examenFinal * 0.4f);
        System.out.println("La nota final es " + total);

    }
}
