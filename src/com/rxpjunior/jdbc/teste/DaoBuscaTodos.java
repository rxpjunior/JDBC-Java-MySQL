package com.rxpjunior.jdbc.teste;

import java.util.List;
import com.rxpjunior.jdbc.dao.ContatoDao;
import com.rxpjunior.jdbc.modelo.Contato;

public class DaoBuscaTodos {

	public static void main(String[] args) {

		ContatoDao dao = new ContatoDao();
		List<Contato> contatos = dao.buscaTodos();

		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Data de Nascimento: " + contato.getDataNascimento().getTime() + "\n");
		}
	}

}
