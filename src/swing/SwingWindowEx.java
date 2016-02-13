package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingWindowEx  extends JFrame{
	public static void main(String[] args) {
		SwingWindowEx frame = new SwingWindowEx();
		frame.setSize(400, 450);
		frame.setLayout(null);
		frame.setTitle("The frame");
		
		frame.setLocation(50, 50);

		JPanel contentpane = new JPanel();
		contentpane.setSize(400, 450);
		contentpane.setLayout(null);
		JButton button = new JButton("Click");
		int i=100;
		
			do{
		button.setLocation(i, (i + 30));
			button.setSize(100, 100);

//			Thread t = new Thread();
//			t.start();
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			i=i+30;
		
			}while(i<500);
		
		JLabel label = new JLabel("This is from tab 2");
		label.setLocation(30, 30);
		label.setSize(200, 200);

		contentpane.add(button);
		contentpane.add(label);
		frame.add(contentpane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);

	}
}
