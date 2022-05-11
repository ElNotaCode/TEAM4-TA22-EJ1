package AppMain;

import controllers.Controlador;
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

/**
 * Hello world!
 *
 */
public class MainApp {
	public static void main(String[] args) {
		// Instanciamos todos los objetos de MVC en el main
		// para utilizarlos en el constructor del Controller
		viewMain viewMain1 = new viewMain();
		viewCreateClient viewCreateClient1 = new viewCreateClient();
		viewCreateVideos viewCreateVideos1 = new viewCreateVideos();
		viewTable viewTable1 = new viewTable();
		viewUpdateCliente viewUpdateCliente1 = new viewUpdateCliente();
		viewUpdateVideos viewUpdateVideos1 = new viewUpdateVideos();

		// Instanciamos los modelos DAO [¿Tenemos que pasarle al constructor los modelos DTO/DAO? O solo las vistas?]
		ClienteModel clienteModel = new ClienteModel();
		VideoModel videoModel = new VideoModel();
		
		// Instanciamos un objeto Controlador donde podremos utilizar todos los atributos de los siguentes views
		Controlador controlador = new Controlador(viewMain1, viewCreateClient1, viewCreateVideos1, viewTable1, viewUpdateCliente1, viewUpdateVideos1, clienteModel, videoModel);
	}
}
