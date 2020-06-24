package desafio5.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author troll
 */
public class Desafio52 {
    public static void main(String[] args) {
        int numero, soma;
        
        numero = 1;
        soma = 0;
        while (numero != 0) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número ou zero para parar."));
            soma += numero;
        }
        JOptionPane.showMessageDialog(null, "A soma é: "+soma);
    }
    
}
