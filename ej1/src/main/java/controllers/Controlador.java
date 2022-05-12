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
		this.viewMain1.btnEditarVideos.addActionListener(this);
		this.viewMain1.btnBorrarClientes.addActionListener(this);
		
		// Para utilizar los botones de la vistas en actionPerformed los ponemos aqui asi
		this.viewCreateClient1.btnEnviar.addActionListener(this);
		this.viewTable1.btnSalir.addActionListener(this);
		this.viewUpdateCliente1.btnEnviar.addActionListener(this);
		this.viewCreateVideos1.btnEnviar.addActionListener(this);
		this.viewUpdateVideos1.btnEnviar.addActionListener(this);
		this.viewTable1.btnBuscarDNI.addActionListener(this);
		this.viewTable1.btnBuscarID.addActionListener(this);
		this.viewMain1.btnBorrarVideo.addActionListener(this);
		
		this.viewUpdateCliente1.btnEditar.addActionListener(this);
		this.viewUpdateCliente1.buscarClienteDni.addActionListener(this);

		this.viewUpdateVideos1.textEditarId.addActionListener(this);
		this.viewUpdateVideos1.btnEditarVideo.addActionListener(this);
		
		

		viewMain1.setVisible(true);
	}



	public void actionPerformed(ActionEvent evento) {
		
		//Botones de ViewMain
		if(evento.getSource()== this.viewMain1.btnCrearCliente) {
			viewCreateClient1.setVisible(true);
			viewMain1.setVisible(false);
		}
		
		if(evento.getSource()== this.viewMain1.btnVerClientes) {
			viewTable1.setVisible(true);
			viewMain1.setVisible(false);
		}
		
		
		if(evento.getSource()== this.viewMain1.btnEditarCliente) {
			viewUpdateCliente1.setVisible(true);
			viewMain1.setVisible(false);
			
		}
		
		//borrar clientes
		if(evento.getSource()== this.viewMain1.btnBorrarClientes) {
			clienteModel.deleteOne(viewMain1.tfBorrarCliente.getText());
			viewMain1.tfBorrarCliente.setText("");
		}
		
		
		
		
		if(evento.getSource()== this.viewMain1.btnCrearVideos) {
			viewCreateVideos1.setVisible(true);
			viewMain1.setVisible(false);
		}
		
		
		if(evento.getSource()== this.viewMain1.btnEditarVideos) {
			viewUpdateVideos1.setVisible(true);
			viewMain1.setVisible(false);
		}
		
		if(evento.getSource()== this.viewMain1.btnBorrarVideo) {
			videoModel.createdeleteone(Integer.parseInt(viewMain1.tfBorrarVideo.getText()));
			viewMain1.tfBorrarVideo.setText("");
			// de momento nada
		}

		// Botones de ViewTable
		if (evento.getSource() == this.viewTable1.btnBuscarDNI) {
			viewTable1.setVisible(true);
			viewMain1.setVisible(false);
			ClienteDto clienteDto = clienteModel.selectOne(viewTable1.tfBuscarDNI.getText());
			String cliente = "";
			cliente += clienteDto.getNombre();
			cliente += clienteDto.getApellido();
			cliente += clienteDto.getDireccion();
			cliente += clienteDto.getDni();
			viewTable1.table.setText(cliente);
		}
		
		
		// Botones mostrar Videos
				if (evento.getSource() == this.viewTable1.btnBuscarID) {
					viewTable1.setVisible(true);
					viewMain1.setVisible(false);
					VideoDto videoDto = videoModel.selectOne(Integer.parseInt(viewTable1.tfBuscarID.getText()));
					String video = "";
					video += videoDto.getTitle();
					video += videoDto.getDirector();
					video += videoDto.getCli_id();
					viewTable1.table.setText(video);
				}

		
		
		//mostrar cliente
		if (evento.getSource() == this.viewTable1.btnBuscarID) {
			viewTable1.setVisible(true);
			viewMain1.setVisible(false);
			VideoDto videoDto = videoModel.selectOne(Integer.parseInt(viewTable1.tfBuscarID.getText()));
		}
		
		//mostrar proyecto
		if (evento.getSource() == this.viewTable1.btnBuscarID) {
			viewTable1.setVisible(true);
			viewMain1.setVisible(false);
			VideoDto videoDto = videoModel.selectOne(Integer.parseInt(viewTable1.tfBuscarID.getText()));
		}

		//crear cliente
		if(evento.getSource()== this.viewCreateClient1.btnEnviar) {
			System.out.println("Intentando crear Cliente");
			clienteDto = new ClienteDto(viewCreateClient1.tfNombre.getText(), viewCreateClient1.tfApellido.getText(), viewCreateClient1.tfDireccion.getText(), viewCreateClient1.tfDni.getText(), Integer.parseInt(viewCreateClient1.tfFecha.getText()));
			clienteModel.createInsert(clienteDto);
		}
		
		//crear proyecto 
		if(evento.getSource()== this.viewCreateVideos1.btnEnviar) {
			System.out.println("Intentando crear Proyecto");
			videoDto = new VideoDto(viewCreateVideos1.tfTitle.getText(), viewCreateVideos1.tfDirector.getText(), Integer.parseInt(viewCreateVideos1.tfClientId.getText()));
			videoModel.createInsert(videoDto);
		}
		
		
		
		//EditarCliente
		if(evento.getSource()== this.viewUpdateCliente1.btnEditar) {
			
			String dnimandado = "";
			String textNomApels = "";
			
			System.out.println("Dentro de editar");


			ClienteDto cliente =  clienteModel.selectOne(viewUpdateCliente1.buscarClienteDni.getText());
			
			

			viewUpdateCliente1.tfNombre.setText(cliente.getNombre());
			viewUpdateCliente1.tfApellido.setText(cliente.getApellido());
			viewUpdateCliente1.tfDireccion.setText(cliente.getDireccion());
			viewUpdateCliente1.tfDni.setText(cliente.getDni());


			
		}
		
		
		//Guardar el objeto editado
		
		if(evento.getSource()== this.viewUpdateCliente1.btnEnviar) {
			
			ClienteDto cliente = new ClienteDto(viewUpdateCliente1.tfNombre.getText(),viewUpdateCliente1.tfApellido.getText(),viewUpdateCliente1.tfDireccion.getText(),viewUpdateCliente1.tfDni.getText(),23);

			clienteModel.createUpdate(cliente);
			
		}
		
		
		
		
		
		
		
		//EditarVideo
		if(evento.getSource()== this.viewUpdateVideos1.btnEditarVideo) {
	
			
			System.out.println("Dentro de editar");


			VideoDto video =  videoModel.selectOne(Integer.parseInt(viewUpdateVideos1.textEditarId.getText()));
			
			

			viewUpdateVideos1.tfTitle.setText(video.getTitle());
			viewUpdateVideos1.tfDirector.setText(video.getDirector());
			viewUpdateVideos1.tfClientId.setText(String.valueOf(video.getCli_id()));
			
			
			
		}
		
		
		//Guardar el objeto editado
		
		
		if(evento.getSource()== this.viewUpdateVideos1.btnEnviar) {
			
			VideoDto video = new VideoDto(viewUpdateVideos1.tfTitle.getText(),viewUpdateVideos1.tfDirector.getText(),Integer.parseInt(viewUpdateVideos1.tfClientId.getText()));

			videoModel.createUpdate(video,Integer.parseInt(viewUpdateVideos1.textEditarId.getText()));
			
		}
		

		
		
	}

}
