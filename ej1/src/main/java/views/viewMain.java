package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class viewMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewMain frame = new viewMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public viewMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Menu Principal");
		lblTitulo.setBounds(10, 11, 90, 14);
		contentPane.add(lblTitulo);
		
		JButton btnCrearCliente = new JButton("Crear Cliente");
		btnCrearCliente.setBounds(20, 36, 110, 23);
		contentPane.add(btnCrearCliente);
		
		JButton btnCrearVideos = new JButton("Crear Video");
		btnCrearVideos.setBounds(140, 36, 110, 23);
		contentPane.add(btnCrearVideos);
		
		JButton btnVerClientes = new JButton("Ver Clientes");
		btnVerClientes.setBounds(20, 70, 110, 23);
		contentPane.add(btnVerClientes);
		
		JButton btnVerVideos = new JButton("Ver Videos");
		btnVerVideos.setBounds(140, 70, 110, 23);
		contentPane.add(btnVerVideos);
		
		JButton btnEditarCliente = new JButton("Editar Cliente");
		btnEditarCliente.setBounds(20, 104, 110, 23);
		contentPane.add(btnEditarCliente);
		
		JButton btnEditarVideos = new JButton("Editar Videos");
		btnEditarVideos.setBounds(140, 104, 110, 23);
		contentPane.add(btnEditarVideos);
		
		JButton btnBorrarClientes = new JButton("Borrar Cliente");
		btnBorrarClientes.setBounds(20, 138, 110, 23);
		contentPane.add(btnBorrarClientes);
		
		JButton btnBorrarVideo = new JButton("Borrar Video");
		btnBorrarVideo.setBounds(140, 138, 110, 23);
		contentPane.add(btnBorrarVideo);
	}

}
