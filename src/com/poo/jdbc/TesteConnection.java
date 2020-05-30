// Nome: Michael Nascimento de Souza 
// Matricula : 0050015719
// Email: michael.souza@soulasalle.com.br
// Nome: Mona-Lee Antunes Braga
// Matricual : 0050015709
// Email: monalee.braga@soulasalle.com.br

package com.poo.jdbc;

import java.sql.Connection;

public class TesteConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = ConnectionFactory.getConnection();
		
		System.out.println("Conexão Estabelecida com Sucesso !");		
	}

}
