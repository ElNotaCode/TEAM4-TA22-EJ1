package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class viewCreateClient extends JFrame {

	private JPanel contentPane;
	private JTextField tfNombre;
	private JTextField tfApellido;
	private JTextField tfDireccion;
	private JTextField tfDni;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewCreateClient frame = new viewCreateClient();
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
	public viewCreateClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Crear Cliente");
		lblTitulo.setBounds(10, 11, 72, 14);
		contentPane.add(lblTitulo);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(125, 36, 86, 20);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		tfApellido = new JTextField();
		tfApellido.setBounds(125, 67, 86, 20);
		contentPane.add(tfApellido);
		tfApellido.setColumns(10);
		
		tfDireccion = new JTextField();
		tfDireccion.setBounds(125, 98, 86, 20);
		contentPane.add(tfDireccion);
		tfDireccion.setColumns(10);
		
		tfDni = new JTextField();
		tfDni.setBounds(125, 129, 86, 20);
		contentPane.add(tfDni);
		tfDni.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(20, 39, 95, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(20, 70, 95, 14);
		contentPane.add(lblApellido);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(20, 101, 95, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(20, 132, 95, 14);
		contentPane.add(lblDni);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(125, 160, 86, 23);
		contentPane.add(btnEnviar);
	}
}
