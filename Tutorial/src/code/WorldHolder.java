package code;

import javax.swing.JOptionPane;

public class WorldHolder{
public static void main(String[] args){
	String name = JOptionPane.showInputDialog("Введите имя!");
	String age = JOptionPane.showInputDialog("Введите возраст!");	
JOptionPane.showMessageDialog(null, "Имя: " +  name
								  + "\nВозраст: " + age
								  + "\nДолжность: Владыка мира");
}	
}
