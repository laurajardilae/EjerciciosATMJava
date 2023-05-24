import javax.swing.*;

public class Ej22SalarioExtra {
    public static void main(String[] args){
        int salario, horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas"));
        if (horas<=40){
            salario = horas*16;
        }
        else{
            salario = (40*16)+(horas-40)*20;

            }
        JOptionPane.showMessageDialog(null,"El salario es: " + salario);

    }
}
