package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;

public class viewTable extends JFrame {

	private JPanel contentPane;
	public JTextField table = new JTextField();
	public JButton btnBuscarDNI = new JButton("Buscar DNI");
	public JTextField tfBuscarDNI = new JTextField();
	public JButton btnBuscarID = new JButton("Buscar ID");
	public JTextField tfBuscarID = new JTextField();
	public JButton btnSalir = new JButton("Salir");

	

	/**
	 * Create the frame.
	 */
	public viewTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		btnSalir.setBounds(337, 305, 89, 23);
		contentPane.add(btnSalir);
		
		tfBuscarDNI = new JTextField();
		tfBuscarDNI.setBounds(105, 246, 96, 19);
		contentPane.add(tfBuscarDNI);
		tfBuscarDNI.setColumns(10);
		
		
		btnBuscarDNI.setBounds(10, 245, 85, 21);
		contentPane.add(btnBuscarDNI);
		
		
		table.setBounds(10, 10, 416, 207);
		contentPane.add(table);
		table.setColumns(10);
		
		
		btnBuscarID.setBounds(10, 306, 85, 21);
		contentPane.add(btnBuscarID);
		
		
		tfBuscarID.setBounds(105, 307, 96, 19);
		contentPane.add(tfBuscarID);
		tfBuscarID.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 275, 191, 3);
		contentPane.add(separator);
		
		JLabel lblPersona = new JLabel("Persona");
		lblPersona.setBounds(10, 222, 45, 13);
		contentPane.add(lblPersona);
		
		JLabel lblVideo = new JLabel("Video");
		lblVideo.setBounds(10, 283, 45, 13);
		contentPane.add(lblVideo);
	}
}
