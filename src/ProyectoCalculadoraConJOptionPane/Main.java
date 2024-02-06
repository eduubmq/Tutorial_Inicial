package ProyectoCalculadoraConJOptionPane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        float numero1,numero2,suma,resta,mult,div,resto;

        numero1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el primer número: "));
        numero2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el segundo número: "));

        suma = numero1+numero2;
        resta = numero1-numero2;
        mult = numero1 * numero2;
        div = numero1/numero2;
        resto = numero1%numero2;

        JOptionPane.showMessageDialog(null,"La suma es: "+suma);
        JOptionPane.showMessageDialog(null,"La resta es: "+resta);
        JOptionPane.showMessageDialog(null,"La multiplicación es: "+mult);
        JOptionPane.showMessageDialog(null,"La división es: "+div);
        JOptionPane.showMessageDialog(null,"El resto es: "+resto);



    }
}
