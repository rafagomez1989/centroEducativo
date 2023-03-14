package view;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ControllerCentroEducativo;
import controller.ControllerMateria;
import controller.ControllerNivel;
import model.CentroEducativo;
import model.Materia;
import model.Nivel;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ModuleLayer.Controller;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JComboBox<CentroEducativo> jcbcentroeducativo;
	private JButton btnCargarNiveles;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JComboBox<Nivel> jcbnivel;
	private JComboBox<Materia> jcbmateria;
	private JButton btnCargarMaterias;
	private JButton btnVerMateria;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JCheckBox chckbxNewCheckBox;
	private JButton btnGuardar;






	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 684);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
				GridBagLayout gbl_contentPane = new GridBagLayout();
				gbl_contentPane.columnWidths = new int[]{76, 50, 33, 330, 177, 0};
				gbl_contentPane.rowHeights = new int[]{37, 31, 31, 31, 22, 37, 39, 33, 31, 30, 0, 53, 0};
				gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
				gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				contentPane.setLayout(gbl_contentPane);
						
				lblNewLabel = new JLabel("Gestión de Materias");
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
				GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
				gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel.gridx = 3;
				gbc_lblNewLabel.gridy = 0;
				getContentPane().add(lblNewLabel, gbc_lblNewLabel);
						
				lblNewLabel_1 = new JLabel("Curso:");
				lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
				gbc_lblNewLabel_1.gridwidth = 2;
				gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
				gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_1.gridx = 0;
				gbc_lblNewLabel_1.gridy = 1;
				getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
				
				jcbcentroeducativo = new JComboBox<CentroEducativo>();
				jcbcentroeducativo.setFont(new Font("Tahoma", Font.PLAIN, 18));
				GridBagConstraints gbc_jcbcentroeducativo = new GridBagConstraints();
				gbc_jcbcentroeducativo.fill = GridBagConstraints.HORIZONTAL;
				gbc_jcbcentroeducativo.insets = new Insets(0, 0, 5, 5);
				gbc_jcbcentroeducativo.gridwidth = 2;
				gbc_jcbcentroeducativo.gridx = 2;
				gbc_jcbcentroeducativo.gridy = 1;
				getContentPane().add(jcbcentroeducativo, gbc_jcbcentroeducativo);
				
				btnNewButton = new JButton("Cargar niveles");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cargarNiveles();
					}
				});
				btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
				gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
				gbc_btnNewButton.gridx = 4;
				gbc_btnNewButton.gridy = 1;
				contentPane.add(btnNewButton, gbc_btnNewButton);
				
				lblNewLabel_2 = new JLabel("Nivel:");
				lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
				gbc_lblNewLabel_2.gridwidth = 2;
				gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
				gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_2.gridx = 0;
				gbc_lblNewLabel_2.gridy = 2;
				contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
				
				jcbnivel = new JComboBox<Nivel>();
				jcbnivel.setFont(new Font("Tahoma", Font.PLAIN, 18));
				GridBagConstraints gbc_jcbnivel = new GridBagConstraints();
				gbc_jcbnivel.fill = GridBagConstraints.HORIZONTAL;
				gbc_jcbnivel.insets = new Insets(0, 0, 5, 5);
				gbc_jcbnivel.gridwidth = 2;
				gbc_jcbnivel.gridx = 2;
				gbc_jcbnivel.gridy = 2;
				contentPane.add(jcbnivel, gbc_jcbnivel);
				
				btnCargarMaterias = new JButton("Cargar Materias");
				btnCargarMaterias.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cargarMaterias();
					}
				});
				btnCargarMaterias.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_btnCargarMaterias = new GridBagConstraints();
				gbc_btnCargarMaterias.insets = new Insets(0, 0, 5, 0);
				gbc_btnCargarMaterias.gridx = 4;
				gbc_btnCargarMaterias.gridy = 2;
				contentPane.add(btnCargarMaterias, gbc_btnCargarMaterias);
				
				lblNewLabel_3 = new JLabel("Materia:");
				lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
				gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
				gbc_lblNewLabel_3.gridwidth = 2;
				gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_3.gridx = 0;
				gbc_lblNewLabel_3.gridy = 3;
				contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
				
				jcbmateria = new JComboBox<Materia>();
				jcbmateria.setFont(new Font("Tahoma", Font.PLAIN, 18));
				GridBagConstraints gbc_jcbmateria = new GridBagConstraints();
				gbc_jcbmateria.fill = GridBagConstraints.HORIZONTAL;
				gbc_jcbmateria.insets = new Insets(0, 0, 5, 5);
				gbc_jcbmateria.gridwidth = 2;
				gbc_jcbmateria.gridx = 2;
				gbc_jcbmateria.gridy = 3;
				contentPane.add(jcbmateria, gbc_jcbmateria);
				
				btnVerMateria = new JButton("Ver materia");
				btnVerMateria.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_btnVerMateria = new GridBagConstraints();
				gbc_btnVerMateria.insets = new Insets(0, 0, 5, 0);
				gbc_btnVerMateria.gridx = 4;
				gbc_btnVerMateria.gridy = 3;
				contentPane.add(btnVerMateria, gbc_btnVerMateria);
				
				lblNewLabel_5 = new JLabel("Datos de la materia");
				lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
				gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_5.gridx = 3;
				gbc_lblNewLabel_5.gridy = 4;
				contentPane.add(lblNewLabel_5, gbc_lblNewLabel_5);
				
				lblNewLabel_6 = new JLabel("id:");
				lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
				gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
				gbc_lblNewLabel_6.gridwidth = 2;
				gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_6.gridx = 0;
				gbc_lblNewLabel_6.gridy = 5;
				contentPane.add(lblNewLabel_6, gbc_lblNewLabel_6);
				
				textField = new JTextField();
				textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
				GridBagConstraints gbc_textField = new GridBagConstraints();
				gbc_textField.gridwidth = 3;
				gbc_textField.insets = new Insets(0, 0, 5, 0);
				gbc_textField.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField.gridx = 2;
				gbc_textField.gridy = 5;
				contentPane.add(textField, gbc_textField);
				textField.setColumns(10);
				
				lblNewLabel_7 = new JLabel("Nombre:");
				lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
				gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
				gbc_lblNewLabel_7.gridwidth = 2;
				gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_7.gridx = 0;
				gbc_lblNewLabel_7.gridy = 6;
				contentPane.add(lblNewLabel_7, gbc_lblNewLabel_7);
				
				textField_1 = new JTextField();
				textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
				textField_1.setColumns(10);
				GridBagConstraints gbc_textField_1 = new GridBagConstraints();
				gbc_textField_1.gridwidth = 3;
				gbc_textField_1.insets = new Insets(0, 0, 5, 0);
				gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_1.gridx = 2;
				gbc_textField_1.gridy = 6;
				contentPane.add(textField_1, gbc_textField_1);
				
				lblNewLabel_8 = new JLabel("Código:");
				lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
				gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
				gbc_lblNewLabel_8.gridwidth = 2;
				gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_8.gridx = 0;
				gbc_lblNewLabel_8.gridy = 7;
				contentPane.add(lblNewLabel_8, gbc_lblNewLabel_8);
				
				textField_2 = new JTextField();
				textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
				textField_2.setColumns(10);
				GridBagConstraints gbc_textField_2 = new GridBagConstraints();
				gbc_textField_2.gridwidth = 3;
				gbc_textField_2.insets = new Insets(0, 0, 5, 0);
				gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_2.gridx = 2;
				gbc_textField_2.gridy = 7;
				contentPane.add(textField_2, gbc_textField_2);
				
				lblNewLabel_9 = new JLabel("URL Classroom:");
				lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
				gbc_lblNewLabel_9.gridwidth = 2;
				gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
				gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_9.gridx = 0;
				gbc_lblNewLabel_9.gridy = 8;
				contentPane.add(lblNewLabel_9, gbc_lblNewLabel_9);
				
				textField_3 = new JTextField();
				textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
				textField_3.setColumns(10);
				GridBagConstraints gbc_textField_3 = new GridBagConstraints();
				gbc_textField_3.gridwidth = 3;
				gbc_textField_3.insets = new Insets(0, 0, 5, 0);
				gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_3.gridx = 2;
				gbc_textField_3.gridy = 8;
				contentPane.add(textField_3, gbc_textField_3);
				
				lblNewLabel_10 = new JLabel("Fecha inicio:");
				lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
				gbc_lblNewLabel_10.anchor = GridBagConstraints.EAST;
				gbc_lblNewLabel_10.gridwidth = 2;
				gbc_lblNewLabel_10.fill = GridBagConstraints.VERTICAL;
				gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_10.gridx = 0;
				gbc_lblNewLabel_10.gridy = 9;
				contentPane.add(lblNewLabel_10, gbc_lblNewLabel_10);
				
				textField_4 = new JTextField();
				textField_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
				textField_4.setColumns(10);
				GridBagConstraints gbc_textField_4 = new GridBagConstraints();
				gbc_textField_4.insets = new Insets(0, 0, 5, 0);
				gbc_textField_4.gridwidth = 3;
				gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_4.gridx = 2;
				gbc_textField_4.gridy = 9;
				contentPane.add(textField_4, gbc_textField_4);
				
				chckbxNewCheckBox = new JCheckBox("Admite matrícula");
				chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
				gbc_chckbxNewCheckBox.anchor = GridBagConstraints.WEST;
				gbc_chckbxNewCheckBox.gridwidth = 2;
				gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
				gbc_chckbxNewCheckBox.gridx = 2;
				gbc_chckbxNewCheckBox.gridy = 10;
				contentPane.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
				
				btnGuardar = new JButton("Guardar");
				btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
				gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
				gbc_btnGuardar.gridx = 3;
				gbc_btnGuardar.gridy = 11;
				contentPane.add(btnGuardar, gbc_btnGuardar);

		btnCargarNiveles = new JButton("Seso");
		btnCargarNiveles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
	}
	
	
	/**
	 * 
	 */
	private void cargarCentroEducativo() {
		CentroEducativo c = (CentroEducativo) jcbcentroeducativo.getSelectedItem();
		List<CentroEducativo> lc = ControllerCentroEducativo.cargarCentroEducativos(c.getId());

		try {
			jcbcentroeducativo.removeAllItems();
		} catch (Exception e) {
			// TODO: handle exception
		}

		for (CentroEducativo centro : lc) {
			jcbcentroeducativo.addItem(centro);
		}

	}
	
	/**
	 * 
	 */
	private void cargarNiveles() {
		CentroEducativo ce = (CentroEducativo) jcbcentroeducativo.getSelectedItem();
		List<Nivel> niveles = ControllerNivel.cargarNiveles(ce.getId());

		try {
			jcbnivel.removeAllItems();
		} catch (Exception e) {
			// TODO: handle exception
		}

		for (Nivel nivel : niveles) {
			jcbnivel.addItem(nivel);
		}

	}
	
	/**
	 * 
	 */
	private void cargarMaterias() {
		Nivel ni = (Nivel) jcbnivel.getSelectedItem();
		List<Materia> lc = ControllerMateria.cargarMaterias(ni.getId());

		try {
			jcbmateria.removeAllItems();
		} catch (Exception e) {
			// TODO: handle exception
		}

		for (Materia materia : lc) {
			jcbmateria.addItem(materia);
		}
	
	
	
	
	}


}
