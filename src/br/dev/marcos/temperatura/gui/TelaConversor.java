package br.dev.marcos.temperatura.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaConversor {
	
	public void criarTelaConversor() {

		JFrame tela = new JFrame();
		tela.setSize(700, 700);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Conversor de Temperatura");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);

		JLabel lblCelsius = new JLabel();

		JButton btnKelvin = new JButton();

		JButton btnFahreinheit = new JButton();

		JLabel lblResultado = new JLabel();

		JLabel lblMensagemErro = new JLabel();

		JTextField textCelsius = new JTextField();

		tela.setVisible(true);

	}

}
