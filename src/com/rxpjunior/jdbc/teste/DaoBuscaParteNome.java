package com.rxpjunior.jdbc.teste;

import java.util.List;

import javax.swing.JOptionPane;

import com.rxpjunior.jdbc.dao.ContatoDao;
import com.rxpjunior.jdbc.modelo.Contato;

public class DaoBuscaParteNome {

	public static void main(String[] args) {
		String aux = JOptionPane.showInputDialog("Entre com a parte de um nome para testar a pesquisa");
		ContatoDao dao = new ContatoDao();
		List<Contato> contatos = dao.buscaParteNome(aux);
		for (Contato contato : contatos) {
			System.out.println(contato.getNome());
			System.out.println(contato.getEmail());
			System.out.println("");
		}

	}

}
