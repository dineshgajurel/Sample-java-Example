package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

import java.awt.Color;

import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class SwingComponents extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	private JCheckBox chckbxNewCheckBox;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JPanel panel;
	private JTable table;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingComponents frame = new SwingComponents();
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
	public SwingComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getComboBox());
		contentPane.add(getChckbxNewCheckBox());
		contentPane.add(getPanel());
		contentPane.add(getScrollPane());
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"--Select country--", "Nepal", "India", "China"}));
			comboBox.setBounds(25, 11, 152, 42);
		}
		return comboBox;
	}
	private JCheckBox getChckbxNewCheckBox() {
		if (chckbxNewCheckBox == null) {
			chckbxNewCheckBox = new JCheckBox("Like");
			chckbxNewCheckBox.setBounds(34, 87, 97, 23);
		}
		return chckbxNewCheckBox;
	}
	private JRadioButton getRdbtnMale() {
		if (rdbtnMale == null) {
			rdbtnMale = new JRadioButton("Male");
		}
		return rdbtnMale;
	}
	private JRadioButton getRdbtnFemale() {
		if (rdbtnFemale == null) {
			rdbtnFemale = new JRadioButton("Female");
		}
		return rdbtnFemale;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setForeground(Color.BLUE);
			panel.setBorder(new TitledBorder(null, "Sex", TitledBorder.CENTER, TitledBorder.TOP, null, null));
			panel.setBounds(135, 126, 184, 124);
			panel.add(getRdbtnFemale());
			panel.add(getRdbtnMale());
			ButtonGroup btngrp=new ButtonGroup();
			btngrp.add(getRdbtnFemale());
			btngrp.add(getRdbtnMale());
			
			
		}
		return panel;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{"1", "2", "1"},
					{"2", "4", "5"},
				},
				new String[] {
					"col2", "Col1", "New column"
				}
			));
		}
		return table;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(71, 268, 152, 49);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
}
