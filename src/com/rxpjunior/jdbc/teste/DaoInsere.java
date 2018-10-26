package com.rxpjunior.jdbc.teste;

import java.util.Calendar;

import javax.swing.JOptionPane;

import com.rxpjunior.jdbc.dao.ContatoDao;
import com.rxpjunior.jdbc.modelo.Contato;

public class DaoInsere {

	public static void main(String[] args) {
		String nome, email, endereco;
		int cont;
		
		for(cont=0;cont<3;cont++) {
			nome=JOptionPane.showInputDialog("Entre com o " + (cont+1) + "° nome:");
			email=JOptionPane.showInputDialog("Entre com o " + (cont+1) + "° email:");
			endereco=JOptionPane.showInputDialog("Entre com o " + (cont+1) + "° endereco:");
			
			// pronto para gravar
			Contato contato = new Contato();
			contato.setNome(nome);
			contato.setEmail(email);
			contato.setEndereco(endereco);
			contato.setDataNascimento(Calendar.getInstance());
			// grave nessa conexão!!!
			ContatoDao dao = new ContatoDao();
			// método elegante
			dao.adiciona(contato);
		}
	}

}
