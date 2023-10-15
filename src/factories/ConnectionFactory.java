package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	//Método para abrir conexão com banco de dados  PostGreSQL
	
	public Connection getConnection() throws Exception {
		
		//parametros de conexão em variaveis
		
		String driver = "org.postgresql.Driver";
		String host = "jdbc:postgresql://localhost:5432/bd_java_projeto03";
		String user = "postgres";
		String password = "root";
		
		
		Class.forName(driver);
		return DriverManager.getConnection(host, user,password);
	}
	

}
