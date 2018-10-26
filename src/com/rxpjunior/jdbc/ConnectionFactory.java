package com.rxpjunior.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	// Retorna uma conexao ao Banco de Dados
	public Connection getConnection() {
		try {
			String url = "jdbc:mysql://localhost:3306/teste"; // Nome da base de dados
			String user = "root"; // nome do usuário do MySQL
			String password = "root"; // senha do MySQL
			Connection conexao = null;
			conexao = DriverManager.getConnection(url, user, password);
			return conexao;

		} catch (Exception e) {
			System.out.println("ConectionFactory - Não pôde conectar ao BD");
			return null;
		}

	}
}