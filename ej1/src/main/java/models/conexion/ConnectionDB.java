package models.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDB {
	
	private String ip = "192.168.1.140";
	private String ip2 = "192.168.1.29";
	private String ip3 = "localhost";
	private String user = "remote";
	private String password = "Reus_2022";
	private String userB = "borja";
	private String passwordB = "Facebook2!";
	private Connection conexion = null;
	private Statement statement = null;
	private String bd = "clientevideo";

	
	//crear conexiones
			public Connection crearConexion() {
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					conexion = DriverManager.getConnection("jdbc:mysql://" + ip3 + ":3306/"+ bd +"?useTimezone=true&serverTimezone=UTC", userB, passwordB);
					System.out.println("Conexion establecida.");
				
					return conexion;
				} catch (SQLException |ClassNotFoundException e) {
					System.out.println("No se ha podido conectar.");
					System.out.println(e);
					return null;
				}
				
			}

}
