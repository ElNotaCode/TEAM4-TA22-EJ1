package models.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	
	private String ip = "192.168.1.140";
	private String ip2 = "192.168.1.29";
	private String ip3 = "localhost";
	private String user = "remote";
	private String password = "Reus_2022";
	private String userB = "borja";
	private String passwordB = "Facebook2!";
	
	public Connection conexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://" + ip3 + ":3306?useTimezone=true&serverTimezone=UTC", userB, passwordB);
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
