package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class viewCreateVideos extends JFrame {

	private JPanel contentPane;
	public JTextField tfTitle = new JTextField();
	public JTextField tfDirector = new JTextField();
	public JTextField tfClientId = new JTextField();

	/**
	 * Create the frame.
	 */
	public viewCreateVideos() {
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
		lblTitle.setBounds(20, 39, 46, 14);
		contentPane.add(lblTitle);
		
		
		tfTitle.setBounds(94, 36, 86, 20);
		contentPane.add(tfTitle);
		tfTitle.setColumns(10);
		
		JLabel lblDirector = new JLabel("Director");
		lblDirector.setBounds(20, 79, 46, 14);
		contentPane.add(lblDirector);
		
		
		tfDirector.setColumns(10);
		tfDirector.setBounds(94, 76, 86, 20);
		contentPane.add(tfDirector);
		
		JLabel lblClientId = new JLabel("Client Id");
		lblClientId.setBounds(20, 123, 46, 14);
		contentPane.add(lblClientId);
		
		
		tfClientId.setColumns(10);
		tfClientId.setBounds(94, 120, 86, 20);
		contentPane.add(tfClientId);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(94, 159, 85, 21);
		contentPane.add(btnEnviar);
	}
}
