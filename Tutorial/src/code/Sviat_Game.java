package code;

import java.util.Random;

import javax.swing.JOptionPane;

public class Sviat_Game {

    public static void main(String[] args) {

        //����������
        int choose;
        int Mdaga = 0;
        int Pdaga = 0;
        int potions = 2;
        int Mhp = 0;
        int Php = 100;
        int Mattak = 0;
        int Dveri = 5;
        int Pattak = 18;
        Random random = new Random();
        //������                             

        JOptionPane.showMessageDialog(null, "��� ��� ����� ������� ���� ����� ��������� � ������...");
        JOptionPane.showMessageDialog(null, "������ ��� ������� ,"
                + "\n��� � ������ ��� ����� ��������� �������..."
                + "\n�� �� ����.");
        JOptionPane.showMessageDialog(null, "��������� ����� �� ��������� �������� ����� ������..."
                + "\n��..�  � ����������� ��� � ��������.");
        JOptionPane.showMessageDialog(null, "��,������ �������������...������� ������� � ����������� ."
                + "\n� ���� ������� � �����,�����,���... �����. ");
        JOptionPane.showMessageDialog(null, "������ ��������� �� ���� ,"
                + "\n��� ������� ��� � �������� ����� ����������! ");
        JOptionPane.showMessageDialog(null, "������ ����� � ������ ,"
                + "\n��� ��� �� � ������� ������ ������� � ���� ����� � "
                + "\n�������� ������.."
                + "\n��� ����� ������� ���� � ������� ��� � ��� ������ ��� ����."
                + "\n���������� � ����- ��� � ������� ������!");
        JOptionPane.showMessageDialog(null, "� ��� �� ������ � ������ �� ������. "
                + "\n���� ��������� ����� � ������ ������� �� �� � �������.."
                + "\n������ ������ ������ �� ���� ����� � ����� ������ ������ �� ������.");
        JOptionPane.showMessageDialog(null, "� ���� �� 6-� ����� ."
                + "\n������ 7,8,9 ���� � �� ���� ����� � ������� ������ � ����� ���� � ���."
                + "\n5,4,3,2 ���� �����.");
        JOptionPane.showMessageDialog(null, "���������� �� ������ ���� � ��������� ������  ������� ������,"
                + "\n� ������� � ����� ���� � ��� ��� ����� ������� ��� �� �����.");
        JOptionPane.showMessageDialog(null, "��������� ���� ����� ����� � �������� ������ ����� ,"
                + "\n� ������� ����� ����� ������ ������ �� �������� ,"
                + "\n����� ������� ����  ����������� ��."
                + "\n������, �� ������ �� ��� ��� ��� ����� �������� �� ���� ..."
                + "\n��� ��������� '� ����'");
        JOptionPane.showMessageDialog(null, "� ����������� ����� � ��������,"
                + "\n�������� ��� ���� ��������� �� ������ .");
        JOptionPane.showMessageDialog(null, "����� � ����� � �������� � ��� �������� ��� ��,"
                + "\n��� � ���� �������� ����.. "
                + "\n������ � ���� �������� ��� � ������� ������ ,"
                + "\n��� ���� ������ 'C����' ");
        JOptionPane.showMessageDialog(null, "� ������� '����.. ���' ������,"
                + "\n� ��� ����� �� ��������� ����� ������ � ���� � ����� ��� �������.. ");
        JOptionPane.showMessageDialog(null, "�� ����� ,��� � ��� ����� ��������� ������... "
                + "\n�� ���� ������.� ��� ���!");

//�������� ������� ���� ���� ����� � ��
        choose = Integer.parseInt(JOptionPane.showInputDialog(null, "�� �������� �������� �� ����!"
                + "\n�� ������������� �� �������� � ������ ��������."
                + "\n����� �������?"
                + "\n1)- �������"
                + "\n2)- ������ � �����"
                + "\n3)- �������"
                + "\n(P.S. ������ ���������� ����� ��������)"));
        if (choose == 1) {
            JOptionPane.showMessageDialog(null, "�������"
                    + "\n��� ����� ���� ����� ����� �������� �������?"
                    + "\n����� ��� ��������� ��������� ����� ��������� ���������!"
                    + "\n������� ����� ��� ���� ������� � ������ ���������.");
            Mattak = Mattak + 10;
            Mhp = Mhp + 110;
        } else if (choose == 2) {
            JOptionPane.showMessageDialog(null, "������ � �����."
                    + "\n������ ���������� ������."
                    + "\n���� ������ �� �������."
                    + "\n���� ������ �����! "
                    + "\n������ ��������� �� ������");
            Mattak = Mattak + 12;
            Mhp = Mhp + 108;
        } else if (choose == 3) {
            JOptionPane.showMessageDialog(null, "�������. ����� �� �����, ��� ���"
                    + "\n��� ������� ���������� ����� ����� ."
                    + "\n��� � ����������� ������ ����� ��� ���������� ��� � ��������."
                    + "\n�� � ����� ������� ��� ��� ������� ������� �� ����,"
                    + "\n(��������� ��� �� ����� ,�� ����� �� �� ������� �� ��� ����� ����� ����) ");
            Mattak = Mattak + 9;
            Mhp = Mhp + 120;
        }

        //���(�������)
        while (Mhp > 0 && Php > 0) {
            choose = Integer.parseInt(JOptionPane.showInputDialog(null, "������ ������ �������!"
                    + "\n�� �������� ������� ���� �����,"
                    + "\n��� ���� ���� �� ����� �� ���."
                    + "��� �������� ��� ��???"
                    + "\n1)- ��������"
                    + "\n2)- ������� ������ �� ���"
                    + "\n3)- ����� ����� � �����"
                    + "\n4)- �� ����� ��� �������� ����  (x" + potions + ")"
                    + "\n5)- ���������� ����� ������ ��� ��� ����!"
                    + "\nP.S. ������ ��� ������ ,"
                    + "\n����� ��������� ��� ��� ��������"));
//���������� ��� ����������� ������- ����� ���������������                                                       
//int choose;
//int Mdaga=0;
//int Pdaga = 0;
//int potions = 2;
//int Mhp = 0;
//int Php = 100;
//int Mattak = 0;
//int Pattak = 18; 
//int Dveri = 5;

            if (choose == 1) {
                Mdaga = Mattak + random.nextInt(9);
                Pdaga = Pattak + random.nextInt(4);
                Php = Php - Mdaga;
                Mhp=Mhp-Pdaga;
            }
            if (choose == 2) {
                Mdaga = Mattak + random.nextInt(14);
                Pdaga = Pattak + random.nextInt(7)+5;
                Php = Php - Mdaga;
                Mhp=Mhp-Pdaga;
                JOptionPane.showMessageDialog(null, "�� �� ��������� ���� � "
                		+ "\n����� ������������ ���� � ��� ."
                		+ "\n�� ������� �� " + Dveri + " HP ������");
            }
            if (choose == 3) {
            	Mdaga = Mattak + random.nextInt(9);
                Pdaga = Pattak + random.nextInt(4);
                Php = Php - Mdaga;
                Mhp=Mhp-Pdaga;
            }
            if (choose == 4) {
                Mhp = Mhp + 50;
            }
            if (choose == 5) {
            	Mdaga = Mattak - 8;
                Pdaga = Pattak + random.nextInt(8);
                Php = Php - Mdaga;
                Mhp=Mhp-Pdaga;
                JOptionPane.showMessageDialog(null, "�� ����� ��� ���� ."
                		+ "\n�� ������� ������ ���� ���� ���� �����."
                		+ "\n���������� !�� ��������� � ������� ������ ��."
                		+ "\n���� ������� ,�� ������� ������ ��,�� ������� �����,"
                		+ "\n�� � ������,�� ������."
                		+ "\n������ �� ������ ������ ������ ����� ������� �������. ");
            }
            JOptionPane.showMessageDialog(null, "�� ���� ������� ������� " + Mdaga + " �����,"
                    + "\n������ ���� ���� " + Pdaga+"�����"
                    + "\n������ � ������� " + Php + " �����,"
                    + "\n� ���� " + Mhp + " �����.");
        }
        if (Mhp > 0) {
            JOptionPane.showMessageDialog(null, "�� ������ ����� ������� ,"
                    + "\n����� ���� ������ ���� ������ ���� ����!"
                    + "\n � ���� ��� ���� ����!)");
        } else {
            JOptionPane.showMessageDialog(null, "������ ���� ������,�� ���..?"
                    + "\n��������� ���� �� ������� ��� ��� ������� ��� ����!");
        }
        choose = Integer.parseInt(JOptionPane.showInputDialog(null, "���� ���� ����������� ���� - ����� ����.(����� 1!)"
        		+ "\n���� ������ �����������-��� 2!(������ ����)"));
if(choose == 1){
JOptionPane.showMessageDialog(null,"����� ����� 1, �� ��� ��� ����� ,"
		+ "\n��� ���� ����� �� ��� ���� ,� ���� ����� ������ ����� ����"
		+ "\n�����!");
}
else if(choose == 2){
JOptionPane.showMessageDialog(null,"����������� �� �����."
		+ "\n� ���� ����� �� ��� �� � ��������� ����..."
		+ "\n���� ������� .�� ��������."
		+ "\n �� �� ��� �� �������� ���� �������,� ��� ���� �� �������� ����!"
		+ "\n ������� �� ��������� ����� � ������ � ���� � ����) ");

}
    }

}
