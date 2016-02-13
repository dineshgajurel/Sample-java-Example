package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExtendedFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton button = null;
	private JLabel label = null;

	public ExtendedFrame() {
		setTitle("Demo @Dinesh");
		setSize(400, 450);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		componentinit();
	}

	public void componentinit() {
		JPanel component = new JPanel();
		component.setLayout(null);
		component.setSize(400, 450);
		component.add(getLabel());
		component.add(getButton());
		getContentPane().add(component);
	}

	public JButton getButton() {
		if (button == null) {
			button = new JButton("Return to main program");
			button.setBounds(150, 100, 200, 50);
			button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
			EventHandlingListener ev=new EventHandlingListener();
			ev.setVisible(true);
				}
			});
		}
		return button;
	}

	public JLabel getLabel() {
		if (label == null) {

			label = new JLabel("This is from Menu 1");
			label.setBounds(10, 100, 150, 25);
		
		}
		return label;
	}

	public static void main(String[] args) {

		ExtendedFrame f = new ExtendedFrame();
		f.setVisible(true);

	}

}
