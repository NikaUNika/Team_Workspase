package code;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UI {
	static JTextField first = new JTextField();
	static JTextField second = new JTextField();
	static JTextField therd = new JTextField();
	static int one;
	static int two;
	static int answer;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Урок#4");
		JLabel text = new JLabel("+");
		JLabel equality = new JLabel("=");
		JButton exit = new JButton("сложить");
		/*
		 * 1)Положение на эране по горизонтали
		 * 2)Положение на эране по вертикали
		 * 3)Ширина
		 * 4)Высота
		 * */
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				one = Integer.parseInt(first.getText());
				two = Integer.parseInt(second.getText());
				answer = one+two;
				therd.setText(""+answer);
			}
		});
		first.setBounds(10, 20, 80, 20);
		second.setBounds(120, 20, 80, 20);
		therd.setBounds(220, 20, 80, 20);
		exit.setBounds(150,120,120,30);
		text.setBounds(100,15,200,20);
		equality.setBounds(205,15,200,20);
		frame.setBounds(200,200,400,200);
		frame.add(text);
		frame.add(equality);
		frame.add(first);
		frame.add(second);
		frame.add(therd);
		frame.add(exit);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
