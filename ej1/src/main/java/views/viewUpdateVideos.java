package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class viewUpdateVideos extends JFrame {

	private JPanel contentPane;
	public JTextField tfVideoId = new JTextField();
	public JTextField tfTitle = new JTextField();
	public JTextField tfDirector = new JTextField();
	public JTextField tfClientId = new JTextField();
	public JButton btnEnviar = new JButton("Enviar");

	/**
	 * Create the frame.
	 */
	public viewUpdateVideos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Crear Video");
		lblTitulo.setBounds(10, 11, 65, 14);
		contentPane.add(lblTitulo);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBounds(10, 80, 46, 14);
		contentPane.add(lblTitle);
		
		
		tfTitle.setBounds(84, 77, 86, 20);
		contentPane.add(tfTitle);
		tfTitle.setColumns(10);
		
		JLabel lblDirector = new JLabel("Director");
		lblDirector.setBounds(10, 120, 46, 14);
		contentPane.add(lblDirector);
		
		
		tfDirector.setColumns(10);
		tfDirector.setBounds(84, 117, 86, 20);
		contentPane.add(tfDirector);
		
		JLabel lblClientId = new JLabel("Client Id");
		lblClientId.setBounds(10, 164, 46, 14);
		contentPane.add(lblClientId);
		
		tfClientId.setColumns(10);
		tfClientId.setBounds(84, 161, 86, 20);
		contentPane.add(tfClientId);
		
		JLabel lblVideosId = new JLabel("Title");
		lblVideosId.setBounds(10, 36, 46, 14);
		contentPane.add(lblVideosId);
		
		
		tfVideoId.setColumns(10);
		tfVideoId.setBounds(84, 33, 86, 20);
		contentPane.add(tfVideoId);
		
		
		btnEnviar.setBounds(85, 191, 85, 21);
		contentPane.add(btnEnviar);
	}

}
