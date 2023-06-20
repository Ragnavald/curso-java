package Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 200);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null);//CENTRALIZAR TELA
		
		
		JButton botao = new JButton("Click!");
		janela.add(botao);
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Evento Ocorreu :)");
				
			}
		});
		janela.setVisible(true);
		
	}
	
}
