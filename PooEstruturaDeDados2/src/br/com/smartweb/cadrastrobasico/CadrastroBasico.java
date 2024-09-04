package br.com.smartweb.cadrastrobasico;

import javax.swing.JOptionPane;

public class CadrastroBasico {

	public static void main(String[] args) {
		String nome =JOptionPane.showInputDialog("Qual é o seu nome?");
		String idade =JOptionPane.showInputDialog("Qual sua idade?");
		String sexo =JOptionPane.showInputDialog("Qual é o seu sexo?");
		
		JOptionPane.showMessageDialog(null,nome.toString());
		JOptionPane.showMessageDialog(null,idade.toString());
		JOptionPane.showMessageDialog(null,sexo.toString());
		
		
		
		// TODO Auto-generated method stub

	}

}
