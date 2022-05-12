package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class viewMain extends JFrame {
	
	// Instanciamos en public los botones para poder acceder a ellos desde cualquier otra clase
	public 	JButton btnCrearCliente = new JButton("Crear Cliente");
	public JButton btnCrearVideos = new JButton("Crear Video");
	public JButton btnVerClientes = new JButton("Ver Clientes/ Videos");
	public JButton btnEditarCliente = new JButton("Editar Cliente");
	public JButton btnEditarVideos = new JButton("Editar Videos");
	public JButton btnBorrarClientes = new JButton("Borrar Cliente");
	public JButton btnBorrarVideo = new JButton("Borrar Video");
	
	private JPanel contentPane;
	public  JTextField tfBorrarCliente = new JTextField();
	public  JTextField tfBorrarVideo = new JTextField();
	private final JLabel lblDNI = new JLabel("DNI:");
	private final JLabel lblID = new JLabel("ID:");

	/**
	 * Create the frame.
	 */
	public viewMain() {
		tfBorrarVideo.setBounds(176, 172, 96, 19);
		tfBorrarVideo.setColumns(10);
		tfBorrarCliente.setBounds(176, 139, 96, 19);
		tfBorrarCliente.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Menu Principal");
		lblTitulo.setBounds(10, 11, 90, 14);
		contentPane.add(lblTitulo);
		

		btnCrearCliente.setBounds(20, 36, 110, 23);
		contentPane.add(btnCrearCliente);
		
		
		btnCrearVideos.setBounds(140, 36, 110, 23);
		contentPane.add(btnCrearVideos);
		
		
		btnVerClientes.setBounds(20, 70, 230, 23);
		contentPane.add(btnVerClientes);
		
		
		btnEditarCliente.setBounds(20, 104, 110, 23);
		contentPane.add(btnEditarCliente);
		
		
		btnEditarVideos.setBounds(140, 104, 110, 23);
		contentPane.add(btnEditarVideos);
		
		
		btnBorrarClientes.setBounds(20, 137, 110, 23);
		contentPane.add(btnBorrarClientes);
		
		
		btnBorrarVideo.setBounds(20, 170, 110, 23);
		contentPane.add(btnBorrarVideo);
		
		contentPane.add(tfBorrarCliente);
		
		contentPane.add(tfBorrarVideo);
		lblDNI.setBounds(150, 142, 45, 13);
		
		contentPane.add(lblDNI);
		lblID.setBounds(150, 175, 45, 13);
		
		contentPane.add(lblID);
	}

}
