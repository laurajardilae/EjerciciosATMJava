import javax.swing.*;

public class Ej20Condicionales {
    public static void main(String[] args){
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if (num%10 == 0) {

            JOptionPane.showMessageDialog(null,"El numero es multiplo de 10");
        }
            else{
            JOptionPane.showMessageDialog(null,"El numero NO es multiplo de 10");
        }

    }
}
