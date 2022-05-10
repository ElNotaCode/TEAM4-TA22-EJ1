package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class viewCreateVideos extends JFrame {

	private JPanel contentPane;
	private JTextField tfTitle;
	private JTextField tfDirector;
	private JTextField tfClientId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewCreateVideos frame = new viewCreateVideos();
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
		
		tfTitle = new JTextField();
		tfTitle.setBounds(94, 36, 86, 20);
		contentPane.add(tfTitle);
		tfTitle.setColumns(10);
		
		JLabel lblDirector = new JLabel("Director");
		lblDirector.setBounds(20, 79, 46, 14);
		contentPane.add(lblDirector);
		
		tfDirector = new JTextField();
		tfDirector.setColumns(10);
		tfDirector.setBounds(94, 76, 86, 20);
		contentPane.add(tfDirector);
		
		JLabel lblClientId = new JLabel("Client Id");
		lblClientId.setBounds(20, 123, 46, 14);
		contentPane.add(lblClientId);
		
		tfClientId = new JTextField();
		tfClientId.setColumns(10);
		tfClientId.setBounds(94, 120, 86, 20);
		contentPane.add(tfClientId);
	}

}
