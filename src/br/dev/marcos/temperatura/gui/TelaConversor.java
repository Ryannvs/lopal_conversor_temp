package br.dev.marcos.temperatura.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaConversor {
	
	public void criarTelaConversor() {

		JFrame tela = new JFrame();
		tela.setSize(700, 500);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Conversor de Temperatura");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);

		JLabel lblCelsius = new JLabel();
		lblCelsius.setText("Temperatura em graus celsius:");
		lblCelsius.setBounds(20, 10, 200, 60);

		JButton btnKelvin = new JButton();
		btnKelvin.setText("Kelvin");
		btnKelvin.setBounds(20, 110, 230, 30);

		JButton btnFahreinheit = new JButton();
		btnFahreinheit.setText("Fahreinheit");
		btnFahreinheit.setBounds(270, 110, 230, 30);;

		JLabel lblResultado = new JLabel();
		

		JLabel lblMensagemErro = new JLabel();

		JTextField textCelsius = new JTextField();
		textCelsius.setBounds(20, 60, 480, 30);
		
		tela.getContentPane().add(lblCelsius);
		tela.getContentPane().add(btnKelvin);
		tela.getContentPane().add(btnFahreinheit);
		
		tela.getContentPane().add(textCelsius);
		
		tela.setVisible(true);

	}

}
