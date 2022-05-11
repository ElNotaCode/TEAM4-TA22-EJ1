package models.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import models.conexion.ConnectionDB;
import models.dto.ClienteDto;

public class ClienteModel {

	ConnectionDB connexionMSQ = new ConnectionDB();


	// insert

	public void createInsert(ClienteDto cliente) {
		try {
			Connection conexion = connexionMSQ.conexion();
			String Querydb = "USE clientevideo;";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);
			String Query = "INSERT INTO cliente (nombre,apellido,direccion,dni,fecha)VALUES('" + cliente.getNombre() + "','"
					+ cliente.getApellido() + "','" + cliente.getDireccion() + "'," + cliente.getDni() + ",'" + cliente.getFecha() + "'";
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

	
	//read
	
	
	
	// update
		
	public void createUpdate(ClienteDto cliente) {
		try {
			Connection conexion = connexionMSQ.conexion();
			String Querydb = "USE clientevieo;";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);
			String Query = "UPDATE cliente SET NOMBRE='"+cliente.getNombre()+"',APELLIDO='"+cliente.getApellido()+"',DIRECCION='"+cliente.getDireccion()+"', DNI ="+cliente.getDni()+" , FECHA="+cliente.getFecha()+" WHERE ID="+cliente.getDni()+"";
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

	// Mostrar solo 1
	
		public ClienteDto selectOne(int id) {
			ClienteDto cliente = new ClienteDto();

			try {
				Connection conexion = connexionMSQ.conexion();
				String Querydb = "USE clientevideo;";
				Statement stdb = conexion.createStatement();
				stdb.executeUpdate(Querydb);
				String Query = "SELECT *  FROM cliente WHERE id ="+id+";";;
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
					
					//Necesto recibir el resultado de la consulta.
				
					String nomSelect = resultSet.getString("nombre");
					String apellidoSelect = resultSet.getString("apellido");
					String direccionSelect = resultSet.getString("direccion");
					String dniSelect = resultSet.getString("dni");
					int fechaSelect = Integer.parseInt(resultSet.getString("fecha"));

					cliente = new ClienteDto(nomSelect,apellidoSelect,direccionSelect,dniSelect,fechaSelect);
			      }
				
				
			
				conexion.close();
				System.out.println("Select Correcto!");
				return cliente;

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
			Connection conexion = connexionMSQ.conexion();
			String Querydb = "USE clientevideo;";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);
			String Query = "SELECT * FROM cliente";
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
	
		public void deleteOne(int id) {
			try {
				Connection conexion = connexionMSQ.conexion();
				String Querydb = "USE clientevideo;";
				Statement stdb = conexion.createStatement();
				stdb.executeUpdate(Querydb);
				String Query = "DELETE FROM cliente WHERE id ="+id+";";
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


	
	
	
	
	
	
	
}
