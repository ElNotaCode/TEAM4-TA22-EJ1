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
		viewMain1.setVisible(true);
	}



	public void actionPerformed(ActionEvent evento) {
		
	}

}