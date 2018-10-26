package com.rxpjunior.jdbc.teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import com.rxpjunior.jdbc.ConnectionFactory;

public class JDBCInsere {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
			// conectando
			con = new ConnectionFactory().getConnection();

			// cria um preparedStatement
			String sql = "insert into contatos" + " (nome,email,endereco,dataNascimento)" + " values (?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);

			// preenche os valores
			stmt.setString(1, "roberto");
			stmt.setString(2, "roberto@rx.com");
			stmt.setString(3, "R. Santa Clara, 31");
			stmt.setDate(4, new java.sql.Date(Calendar.getInstance().getTimeInMillis()));

			// executa
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			System.out.println("Erro na inserção");
		} finally {
			con.close();
		}

		System.out.println("Gravado!");

		con.close();
	}
}