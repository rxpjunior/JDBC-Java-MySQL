package com.rxpjunior.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import com.rxpjunior.jdbc.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		if (connection != null) {
			System.out.println("Conexão aberta!");
			connection.close();
		} else
			System.out.println("Erro no teste da conexão");

	}

}
