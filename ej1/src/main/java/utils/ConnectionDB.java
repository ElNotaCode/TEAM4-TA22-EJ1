package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	
	
	public Connection conexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.1.29:3306?useTimezone=true&serverTimezone=UTC","remote","Reus_2022");
			System.out.println("Server Connected");
			return conexion;
		} catch (SQLException | ClassNotFoundException ex) {
			System.out.println("No se puede conectar");
			System.out.println(ex);
			return null;
			// TODO: handle exception
		}
		
	}

}
