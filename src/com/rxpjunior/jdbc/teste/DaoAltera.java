package com.rxpjunior.jdbc.teste;

import java.util.List;
import com.rxpjunior.jdbc.dao.ContatoDao;
import com.rxpjunior.jdbc.modelo.Contato;

public class DaoAltera {

	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		List<Contato> contatos = dao.buscaTodos();
		for (Contato contato : contatos) {
			if (contato.getId() == 1) {
				dao.altera(contato);
			}
		}

	}

}
