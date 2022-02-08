package polimorfismo;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
        // Exemplos de polimorfismo:

        // Primeiro exemplo recebe dois parâmetros.
        JOptionPane.showMessageDialog(null, "Olá. \nEsse é o primeiro exemplo de método polimórfico");

        // Segundo exemplo recebe quatro parâmetros.
        JOptionPane.showMessageDialog(null, "Olá. \nEsse é o segundo exemplo de método polimórfico", "Métodos Polimórficos", JOptionPane.ERROR_MESSAGE);

        // O terceiro exemplo recebe cinco parâmetros.
        Icon icone = new javax.swing.ImageIcon("C:/Users/sandr/gpm/github.com/S-Rochel/estudo-senac-ads/orientacao_a_objeto/img/camaleao.png");
        JOptionPane.showMessageDialog(null, "Olá. \nEsse é o terceriro exemplo de método polimórfico", "Métodos Polimórficos", JOptionPane.ERROR_MESSAGE, icone);
    }
}
