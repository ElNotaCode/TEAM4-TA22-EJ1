package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class viewUpdateCliente extends JFrame {

	private JPanel contentPane;
	public JTextField tfNombre = new JTextField();
	public JTextField tfApellido = new JTextField();
	public JTextField tfDireccion = new JTextField();
	public JTextField tfDni = new JTextField();
	public JButton btnEnviar = new JButton("Enviar");
	public JTextField 	buscarClienteDni = new JTextField();

	public JButton btnEditar = new JButton("Buscar");


	/**
	 * Create the frame.
	 */
	public viewUpdateCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Crear Cliente");
		lblTitulo.setBounds(10, 11, 72, 14);
		contentPane.add(lblTitulo);
		
		
		tfNombre.setBounds(125, 67, 86, 20);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		
		tfApellido.setBounds(125, 98, 86, 20);
		contentPane.add(tfApellido);
		tfApellido.setColumns(10);
		
		
		tfDireccion.setBounds(125, 129, 86, 20);
		contentPane.add(tfDireccion);
		tfDireccion.setColumns(10);
		
		
		tfDni.setBounds(125, 160, 86, 20);
		contentPane.add(tfDni);
		tfDni.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(20, 70, 95, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(20, 101, 95, 14);
		contentPane.add(lblApellido);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(20, 132, 95, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(20, 163, 95, 14);
		contentPane.add(lblDni);
		
		
		btnEnviar.setBounds(125, 191, 86, 23);
		contentPane.add(btnEnviar);
		
		buscarClienteDni.setColumns(10);
		buscarClienteDni.setBounds(289, 157, 86, 20);
		contentPane.add(buscarClienteDni);
		
		btnEditar.setBounds(289, 188, 86, 23);
		contentPane.add(btnEditar);
		
		JLabel lblDni_1 = new JLabel("DNI");
		lblDni_1.setBounds(312, 132, 95, 14);
		contentPane.add(lblDni_1);
		
		
	}
}
