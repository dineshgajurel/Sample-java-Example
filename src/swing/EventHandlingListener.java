package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JEditorPane;
import java.awt.Toolkit;
import javax.swing.JList;
import javax.swing.JSlider;
import javax.swing.JTree;
import javax.swing.JScrollBar;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;

public class EventHandlingListener extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField username;
	private JLabel lblPassword;
	private JPasswordField pass;
	private JButton login;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmMenu;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JSlider slider;
	private JButton btnCloseProgram;
	private JLabel lblStatus;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					EventHandlingListener frame = new EventHandlingListener();
					
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
	public EventHandlingListener() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DELL\\Desktop\\d.jpg"));
		setTitle("Demo @Chelsea Nepal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getUsername());
		contentPane.add(getLblPassword());
		contentPane.add(getPass());
		contentPane.add(getLogin());
		contentPane.add(getMntmNewMenuItem());
		contentPane.add(getMntmMenu());
		contentPane.add(getMntmNewMenuItem_1());
		contentPane.add(getMntmNewMenuItem_2());
		contentPane.add(getBtnNewButton());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getSlider());
		contentPane.add(getBtnCloseProgram());
		contentPane.add(getLblStatus());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Username");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel.setForeground(Color.BLUE);
			lblNewLabel.setBounds(31, 134, 79, 34);
		}
		return lblNewLabel;
	}
	private JTextField getUsername() {
		if (username == null) {
			username = new JTextField();
			username.setBackground(Color.CYAN);
			username.setBounds(105, 134, 161, 34);
			username.setColumns(10);
			username.addFocusListener(new FocusListener() {
				
				@Override
				public void focusLost(FocusEvent e) {
					lblStatus.setText("Focus lost:  " +username.getText());
				}
				
				@Override
				public void focusGained(FocusEvent e) {
					lblStatus.setText("focus gained:  " +			username.getText());		
				}
			});
		}
		return username;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblPassword.setForeground(Color.BLUE);
			lblPassword.setBounds(31, 198, 79, 32);
		}
		return lblPassword;
	}
	private JPasswordField getPass() {
		if (pass == null) {
			pass = new JPasswordField();
			pass.setBackground(Color.CYAN);
			pass.setBounds(105, 197, 161, 34);
		}
		return pass;
	}
	private JButton getLogin() {
		if (login == null) {
			login = new JButton("Log In");
			login.setBounds(134, 262, 89, 23);
			login.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(contentPane, "Is your username right?  " +username.getText());					
				}
			});
			
		}
		return login;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("Menu 1");
			mntmNewMenuItem.setForeground(Color.BLUE);
			mntmNewMenuItem.setBounds(10, 11, 79, 17);
			mntmNewMenuItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
//JOptionPane.showMessageDialog(contentPane, "This is menu 1 ");	
ExtendedFrame f = new ExtendedFrame();
f.setVisible(true);


				}
			});
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmMenu() {
		if (mntmMenu == null) {
			mntmMenu = new JMenuItem("Menu 2");
			mntmMenu.setForeground(Color.BLUE);
			mntmMenu.setBounds(91, 11, 79, 17);
			mntmMenu.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
//JOptionPane.showMessageDialog(contentPane, "This is menu 2 ");	
		SwingWindowEx f2=new SwingWindowEx();
		f2.setVisible(true);
		
				}
			});
		}
		return mntmMenu;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("Menu 3");
			mntmNewMenuItem_1.setForeground(Color.BLUE);
			mntmNewMenuItem_1.setBounds(179, 11, 97, 22);
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(contentPane, "This is menu 3");
				}
			});
		}
		return mntmNewMenuItem_1;
	}
	private JMenuItem getMntmNewMenuItem_2() {
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("menu 4");
			mntmNewMenuItem_2.setForeground(Color.BLUE);
			mntmNewMenuItem_2.setBounds(278, 11, 129, 22);
			mntmNewMenuItem_2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(contentPane, "Don't u have manner??");					
				}
			});
		}
		return mntmNewMenuItem_2;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("New button");
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\d.jpg"));
			btnNewButton.setBounds(276, 103, 298, 371);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Welcome To Chelsea Nepal");
			lblNewLabel_1.setForeground(Color.ORANGE);
			lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 20));
			lblNewLabel_1.setBounds(63, 60, 344, 32);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Sign In your account for further details");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_2.setForeground(Color.MAGENTA);
			lblNewLabel_2.setBounds(31, 88, 237, 38);
		}
		return lblNewLabel_2;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.setBounds(39, 39, 298, 23);
		}
		return slider;
	}
	private JButton getBtnCloseProgram() {
		if (btnCloseProgram == null) {
			btnCloseProgram = new JButton("Close Program");
			btnCloseProgram.setBounds(396, 24, 140, 23);
			btnCloseProgram.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
System.exit(0);					
				}
			});
		}
		return btnCloseProgram;
	}
	private JLabel getLblStatus() {
		if (lblStatus == null) {
			lblStatus = new JLabel("Status");
			lblStatus.setFont(new Font("Times New Roman", Font.BOLD, 12));
			lblStatus.setForeground(Color.MAGENTA);
			lblStatus.setBounds(64, 341, 188, 23);
		}
		return lblStatus;
	}
}
