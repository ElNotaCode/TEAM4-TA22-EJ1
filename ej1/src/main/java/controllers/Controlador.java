package controllers;

import java.awt.event.*;
import javax.swing.*;

import models.dao.ClienteModel;
import models.dao.VideoModel;
import models.dto.ClienteDto;
import models.dto.VideoDto;
import views.viewCreateClient;
import views.viewCreateVideos;
import views.viewMain;
import views.viewTable;
import views.viewUpdateCliente;
import views.viewUpdateVideos;


public class Controlador implements ActionListener {

	// Instanciamos los objetos de las clases:
	// Por Conventions, las clases suelen empezar por mayúscula
	 private viewMain viewMain1;
	 private viewCreateClient viewCreateClient1;
	 private viewCreateVideos viewCreateVideos1;
	 private viewTable viewTable1;
	 private viewUpdateCliente viewUpdateCliente1;
	 private viewUpdateVideos viewUpdateVideos1;
	 
	// Instanciamos los modelos DTO y DAO
	 private ClienteModel clienteModel;
	 private VideoModel videoModel;
	 private ClienteDto clienteDto;
	 private VideoDto videoDto;
	 
	 // Constructor
	 
	public Controlador(viewMain viewMain1, viewCreateClient viewCreateClient1, viewCreateVideos viewCreateVideos1,
			viewTable viewTable1, viewUpdateCliente viewUpdateCliente1, viewUpdateVideos viewUpdateVideos1,
			ClienteModel clienteModel, VideoModel videoModel) {
		super();
		this.viewMain1 = viewMain1;
		this.viewCreateClient1 = viewCreateClient1;
		this.viewCreateVideos1 = viewCreateVideos1;
		this.viewTable1 = viewTable1;
		this.viewUpdateCliente1 = viewUpdateCliente1;
		this.viewUpdateVideos1 = viewUpdateVideos1;
		this.clienteModel = clienteModel;
		this.videoModel = videoModel;
		
		// Con esto podremos acceder a los botones de la Vista viewMain
		this.viewMain1.btnCrearCliente.addActionListener(this);
		this.viewMain1.btnVerClientes.addActionListener(this);
		this.viewMain1.btnEditarCliente.addActionListener(this);
		this.viewMain1.btnBorrarClientes.addActionListener(this);
		this.viewMain1.btnCrearVideos.addActionListener(this);
		this.viewMain1.btnVerVideos.addActionListener(this);
		this.viewMain1.btnEditarVideos.addActionListener(this);
		this.viewMain1.btnBorrarClientes.addActionListener(this);
		
		// Para utilizar los botones de la vistas en actionPerformed los ponemos aqui asi
		this.viewCreateClient1.btnEnviar.addActionListener(this);
		this.viewTable1.btnSalir.addActionListener(this);
		this.viewUpdateCliente1.btnEnviar.addActionListener(this);
		
		
		viewMain1.setVisible(true);
	}



	public void actionPerformed(ActionEvent evento) {
		//Boton CrearCliente de ViewMain
		if(evento.getSource()== this.viewMain1.btnCrearCliente) {
			viewCreateClient1.setVisible(true);
			viewMain1.setVisible(false);
		}
		
		if(evento.getSource()== this.viewCreateClient1.btnEnviar) {
			System.out.println("Intentando crear Cliente");
			clienteDto = new ClienteDto(viewCreateClient1.tfNombre.getText(), viewCreateClient1.tfApellido.getText(), viewCreateClient1.tfDireccion.getText(), viewCreateClient1.tfDni.getText(), Integer.parseInt(viewCreateClient1.tfFecha.getText()));
			clienteModel.createInsert(clienteDto);
			System.out.println("Cliente Creado");
		}
		
	}

}
