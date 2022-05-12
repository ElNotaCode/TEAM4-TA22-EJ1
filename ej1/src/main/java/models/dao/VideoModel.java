package models.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import models.conexion.ConnectionDB;
import models.dto.ClienteDto;
import models.dto.VideoDto;

public class VideoModel {
	
	ConnectionDB connexionMSQ = new ConnectionDB();

	//modificar todo
	
	
	// insert

	public void createInsert(VideoDto video) {
		try {
			Connection conexion = connexionMSQ.crearConexion();
			String Querydb = "USE clientevideo;";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);
			String Querys = "INSERT INTO videos (title,director,cli_id)VALUES('" + video.getTitle() + "','"
					+ video.getDirector() + "'," + video.getCli_id() + ");";
			System.out.println(Querys);

			Statement st = conexion.createStatement();

			st.executeUpdate(Querys);
			conexion.close();
			System.out.println("Inserts  creados  con exito!");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("No se a podido crear los inserts en la tabla ");
			System.out.println(e);
		}
	}

	// update
		
	public void createUpdate(VideoDto video,int id) {
		try {
			Connection conexion = connexionMSQ.crearConexion();
			String Querydb = "USE clientevideo;";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);
			String Query = "UPDATE videos SET TITLE='"+video.getTitle()+"',DIRECTOR='"+video.getDirector()+"',CLI_ID='"+video.getCli_id()+"' WHERE ID="+id+"";
			Statement st = conexion.createStatement();
			System.out.println(Querydb);

			st.executeUpdate(Query);

			conexion.close();
			System.out.println("Inserts  creados  con exito!");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("No se a podido crear los inserts en la tabla ");
			System.out.println(e);
		}
	}
	
	
	

	// Mostrar solo 1
	
		public VideoDto selectOne(int id) {
			VideoDto video = new VideoDto();

			try {
				Connection conexion = connexionMSQ.crearConexion();
				String Querydb = "USE clientevideo;";
				Statement stdb = conexion.createStatement();
				stdb.executeUpdate(Querydb);
				String Query = "SELECT *  FROM videos WHERE id ="+id+";";;
				System.out.println(Query);
				Statement st = conexion.createStatement();
				java.sql.ResultSet resultSet;
				System.out.println(Querydb);

				resultSet  = st.executeQuery(Query);
				
				
				while (resultSet.next())
			      {
					
					
					//Necesto recibir el resultado de la consulta.
				
					String titleSelect = resultSet.getString("title");
					String directorSelect = resultSet.getString("director");
					int cli_idSelect = Integer.parseInt(resultSet.getString("cli_id"));
					video = new VideoDto(titleSelect,directorSelect,cli_idSelect);

			      }
				
				
				conexion.close();
				System.out.println("Select Correcto!");
				return video;

			} catch (SQLException e) {
				// TODO: handle exception
				System.out.println("Select Incorrecto!");
				System.out.println(e);
				return null;

			}
		}
	
	
	
	
	

	// Mostrar tabla
	
	public void selectDB() {
		try {
			Connection conexion = connexionMSQ.crearConexion();
			String Querydb = "USE clientevideo;";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);
			String Query = "SELECT * FROM video;";
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
	
		public void createdeleteone(int id) {
			try {
				Connection conexion = connexionMSQ.crearConexion();
				String Querydb = "USE clientevideo;";
				Statement stdb = conexion.createStatement();
				stdb.executeUpdate(Querydb);
				String Query = "DELETE FROM videos WHERE id ="+id+";";
				Statement st = conexion.createStatement();
				System.out.println(Query);
				st.executeUpdate(Query);
				conexion.close();
				System.out.println("se a podido borrar!");
			} catch (SQLException e) {
				// TODO: handle exception
				System.out.println("No se a podido borrar! ");
				System.out.println(e);
			}
		}


	
	
	

}
