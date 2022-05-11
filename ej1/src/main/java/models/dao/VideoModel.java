package models.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import models.conexion.ConnectionDB;

public class VideoModel {
	
	ConnectionDB connexionMSQ = new ConnectionDB();

	//modificar todo
	
	
	// insert

	public void createInsert(String db, String tabla, String title, String director, int cli_id) {
		try {
			Connection conexion = connexionMSQ.conexion();
			String Querydb = "USE " + db + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);
			String Query = "INSERT INTO " + tabla + "(nombre,apellido,direccion,dni,fecha)VALUES('" + title + "','"
					+ director + "','" + cli_id + ";'";
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
		
	public void createUpdate(String db, String tabla, String title, String director,  int cli_id,int id) {
		try {
			Connection conexion = connexionMSQ.conexion();
			String Querydb = "USE " + db + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);
			String Query = "UPDATE " + tabla + "SET TITLE='"+title+"',DIRECTOR='"+director+"',CLI_ID='"+cli_id+"' WHERE ID="+id+"";
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
				System.out.println("id:"+resultSet.getString("id") + " "
						+ "Title: " + resultSet.getString("title")+ " "
						+ "Director: " + resultSet.getString("director")+ " "
						+ "Cli_id: " + resultSet.getString("cli_id")+ " "
						
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
