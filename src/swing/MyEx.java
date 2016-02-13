package swing;

//import javax.swing.ImageIcon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyEx {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setLayout(null);
		f.setTitle("Demo @Dinesh");
		f.setLocation(50, 50);
		ImageIcon img = new ImageIcon("resource/d.jpg");
		f.setIconImage(img.getImage());

		JPanel panel = new JPanel();
		panel.setSize(500, 500);
		panel.setLayout(null);

		JLabel label = new JLabel("Login Here!!!! ");
		label.setLocation(230, 50);
		label.setSize(100, 10);
		JLabel label1 = new JLabel("Give Username and Password ");
		label1.setLocation(150, 70);
		label1.setSize(250, 10);
		JLabel labeluser = new JLabel("UserName:");
		labeluser.setLocation(50, 200);
		labeluser.setSize(200, 10);
		JLabel labelpass = new JLabel("Password:");
		labelpass.setLocation(50, 250);
		labelpass.setSize(200, 20);

		JTextField textuser = new JTextField();
		textuser.setBounds(130, 200, 150, 30);

		JPasswordField textpass = new JPasswordField();
		textpass.setBounds(130, 250, 150, 30);

		JButton loginbutton = new JButton("Login!");
		loginbutton.setBounds(150, 300, 70, 20);
		JButton forgetbutton = new JButton("Forgot Password?");
		forgetbutton.setBounds(230, 300, 150, 20);

		JCheckBox remcheck = new JCheckBox();
		remcheck.setBounds(120, 280, 20, 20);
		JLabel remlabel = new JLabel("Remember me");
		remlabel.setBounds(140, 280, 100, 20);

		//JButton button = new JButton("LOGO");
		 JButton button = new JButton(img);
		button.setBounds(350, 70, 100, 200);

		panel.add(button);
		panel.add(label1);
		panel.add(remlabel);
		panel.add(remcheck);
		panel.add(forgetbutton);
		panel.add(loginbutton);
		panel.add(textpass);
		panel.add(textuser);
		panel.add(labelpass);
		panel.add(labeluser);
		panel.add(label);

		f.add(panel);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
