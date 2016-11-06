package code;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class SimpleUI {
	static ImageIcon ico = new ImageIcon("sourse/ico.jpg");
	static ImageIcon ico1 = new ImageIcon("sourse/ico1.jpg");
	static JLabel player1 = new JLabel(ico);
	static JLabel player2 = new JLabel(ico1);
	static JTextArea log = new JTextArea();
	static JFrame frame = new JFrame("Урок#4");
	static Random rand = new Random();
	static int p1_hp = 100;
	static int p2_hp = 100;
	static int buffer1;
	static int buffer2;
	static int p1_damage;
	static int p2_damage;
	
	public static void main(String[] args) {
		JButton exit = new JButton("Атаковать");
		/*
		 * 1)Положение на эране по горизонтали
		 * 2)Положение на эране по вертикали
		 * 3)Ширина
		 * 4)Высота
		 * */
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(p1_hp>0&&p2_hp>0){
				buffer1 = 5+rand.nextInt(20);
				buffer2 =  rand.nextInt(20);
				p2_hp -= buffer1;
				p1_hp -= buffer2;
				log.setText("Ты нанёс "+buffer1+" урона"
						  + "\nПротивник нанёс "+buffer2+" урона"
						  + "\nУ тебя "+p1_hp+" жизни"
						  + "\nУ противника "+p2_hp+" жизни");
		    }else{
		    	if(p1_hp<=0){
		    	JOptionPane.showMessageDialog(null, "Ты проиграл, лалка");
		    	p1_hp=100;
		    	p2_hp=100;
		    }else{
		      	JOptionPane.showMessageDialog(null, "Ты выиграл, молодец");  	
		     	p1_hp=100;
		    	p2_hp=100;
		    }
		    	}
				}
		});
		log.setEditable(false);
		log.setBounds(120,30,170,200);
		exit.setBounds(150,420,120,30);
		player1.setBounds(10,30,100,200);
		player2.setBounds(300,30,100,200);
		frame.setBounds(200,200,450,500);
		frame.add(player1);
		frame.add(player2);
		frame.add(exit);
		frame.add(log);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
