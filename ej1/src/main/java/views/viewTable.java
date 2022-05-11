package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;

public class viewTable extends JFrame {

	private JPanel contentPane;
	public JTable table;
	public JButton btnSalir = new JButton("Salir");

	/**
	 * Create the frame.
	 */
	public viewTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 11, 414, 205);
		contentPane.add(table);
		
		
		btnSalir.setBounds(10, 227, 89, 23);
		contentPane.add(btnSalir);
	}
}
