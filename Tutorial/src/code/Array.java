package code;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Array {

	public static void main(String[] args) {
		int choose = 0;
		choose = Integer.parseInt(JOptionPane.showInputDialog(null, "Выбери действие: "
										  + "\n1)Начать игру"
										  + "\n2)Сохранить"
										  + "\n3)Загрузить"
										  + "\n4)Выйти"));
		switch(choose){
			case 1: JOptionPane.showMessageDialog(null, "Игра начинается!");
			new TutorialClass();
				break;
			case 2: JOptionPane.showMessageDialog(null, "Сохраняем...");
				break;
			case 3:	 JOptionPane.showMessageDialog(null, "Загружаем...");
				break;
			case 4: System.exit(0);
				break;
				default:  JOptionPane.showMessageDialog(null, "Ошибка!");
			}
		JOptionPane.showMessageDialog(null, "Какой-то рандомный текст #1");
		JOptionPane.showMessageDialog(null, "Какой-то рандомный текст #2");
		JOptionPane.showMessageDialog(null, "Какой-то рандомный текст #3");
	}
	}
