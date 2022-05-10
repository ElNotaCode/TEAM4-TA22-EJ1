package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utils.ConnectionDB;

public class ClienteModel {

	ConnectionDB connexionMSQ = new ConnectionDB();

	// crear db

	public void createBD() {
		try {
			Connection conexion = connexionMSQ.conexion();
			String QueryDrop = "DROP DATABASE IF EXISTS clientevideo;";
			String Query = "CREATE DATABASE clientevideo;";
			Statement st = conexion.createStatement();
			st.executeUpdate(QueryDrop);
			st.executeUpdate(Query);
			conexion.close();
			System.out.println("Se a creado correctamente la BD clientevideo");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("No se a podido crear la bd clientevideo");

		}

	}
	
	//crear tabla cliente

	public void createTabe() {
		try {
			Connection conexion = connexionMSQ.conexion();
			String Querydb = "USE clientevideo;";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);
			String Query = "CREATE TABLE cliente(id int not null AUTO_INCREMENT PRIMARY KEY,nombre varchar(100) DEFAULT NULL,apellido varchar(250),direccion varchar(250) DEFAULT NULL, dni int DEFAULT NULL,fecha date DEFAULT NULL);";
			System.out.println(Query);
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);

			conexion.close();
			System.out.println("Tabla cliente creada con exito!");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("No se a podido crear la tabla cliente");
			System.out.println(e);
		}
	}

	// insert

	public void createInsert(String db, String tabla, String nombre, String apellido, String direccion, int dni,
			String fecha) {
		try {
			Connection conexion = connexionMSQ.conexion();
			String Querydb = "USE " + db + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);
			String Query = "INSERT INTO " + tabla + "(nombre,apellido,direccion,dni,fecha)VALUES('" + nombre + "','"
					+ apellido + "','" + direccion + "'," + dni + ",'" + fecha + "'";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);

			conexion.close();
			System.out.println("Inserts  creados  con exito!");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("No se a podido crear los inserts en la tabla ");
			System.out.println(e);
		}
	}

	// update
		
	public void createUpdate(String db, String tabla, String nombre, String apellido, String direccion, int dni,
			String fecha,int id) {
		try {
			Connection conexion = connexionMSQ.conexion();
			String Querydb = "USE " + db + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);
			String Query = "UPDATE " + tabla + "SET NOMBRE='"+nombre+"',APELLIDO='"+apellido+"',DIRECCION='"+direccion+"', DNI ="+dni+" , FECHA='"+fecha+"'WHERE ID="+id+"";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);

			conexion.close();
			System.out.println("Inserts  creados  con exito!");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("No se a podido crear los inserts en la tabla ");
			System.out.println(e);
		}
	}

	// Mostrar tabla
	
	public void selectDB(String db, String tabla) {
		try {
			Connection conexion = connexionMSQ.conexion();
			String Querydb = "USE "+db+";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);
			String Query = "SELECT * FROM "+tabla+";";
			System.out.println(Query);
			Statement st = conexion.createStatement();
			java.sql.ResultSet resultSet;
			resultSet  = st.executeQuery(Query);
			
			
			while (resultSet.next())
		      {
				System.out.println("ID:"+resultSet.getString("id") + " "
						+ "Nombre: " + resultSet.getString("nombre")+ " "
						+ "Apellido: " + resultSet.getString("apellido")+ " "
						+ "Direccion: " + resultSet.getString("direccion")+ " "
						+ "DNI: " + resultSet.getString("dni")+ " "
						+ "Fecha: " + resultSet.getString("fecha")+ " "
						);
		      }
			
			
		
			conexion.close();
			System.out.println("Select Correcto!");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Select Incorrecto!");
			System.out.println(e);
		}
	}
	
	
	
	// Borrar solo 1
	
		public void createdeleteone(String db, String tabla,int id) {
			try {
				Connection conexion = connexionMSQ.conexion();
				String Querydb = "USE " + db + ";";
				Statement stdb = conexion.createStatement();
				stdb.executeUpdate(Querydb);
				String Query = "DELETE FROM "+tabla+" WHERE id ="+id+";";
				Statement st = conexion.createStatement();
				st.executeUpdate(Query);

				conexion.close();
				System.out.println("Inserts  creados  con exito!");
			} catch (SQLException e) {
				// TODO: handle exception
				System.out.println("No se a podido crear los inserts en la tabla ");
				System.out.println(e);
			}
		}


	
	
	// Borrar toda la BD
	
	public void deletetDB(String db) {
		try {
			Connection conexion = connexionMSQ.conexion();
			String Query = "DROP DATABASE clientevideo;";
			System.out.println(Query);
			Statement st = conexion.createStatement();
			conexion.close();
			System.out.println("Delete Correcto!");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Delete Incorrecto!");
			System.out.println(e);
		}
	}
	
	
	
	
}
