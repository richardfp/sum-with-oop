package somaDeDoisValores;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		Soma soma = new Soma();
		soma.somaValores();
		JOptionPane.showInternalMessageDialog(null, "A soma dos Valores é : " + soma.getResultado());

	}

}
