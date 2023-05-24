import javax.swing.*;

public class Ej21EsMayuscula {
    public static void main(String[] args){
        char letra;
        letra = JOptionPane.showInputDialog("Ingrese una letra").charAt(0);
        if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "Es mayuscula");
        }else{
            JOptionPane.showMessageDialog(null,"Es minuscula");
        }
    }

}
