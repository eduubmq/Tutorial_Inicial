package EntradaYSalidaDeDatosConJOptionPane;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String cadena;
        int entero;
        char letra;
        double decimal;

        cadena = JOptionPane.showInputDialog("Digita una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digita un entero: "));
        letra = JOptionPane.showInputDialog("Digita un caracter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digita un decimal: "));

        JOptionPane.showMessageDialog(null,"La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null,"El entero es: "+entero);
        JOptionPane.showMessageDialog(null,"La letra es: "+letra);
        JOptionPane.showMessageDialog(null,"El decimal es: "+decimal);

    }
}
