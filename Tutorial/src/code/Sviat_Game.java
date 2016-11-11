package code;

import java.util.Random;

import javax.swing.JOptionPane;

public class Sviat_Game {

    public static void main(String[] args) {

        //Переменные
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
        //Пролог                             

        JOptionPane.showMessageDialog(null, "Это был самый обычный день после бухаловки в общаге...");
        JOptionPane.showMessageDialog(null, "Точнее под общагой ,"
                + "\nибо в общаге нас могла отпиздить коменда..."
                + "\nНо не суть.");
        JOptionPane.showMessageDialog(null, "Вчерашний вечер мы посветили успешной сдачи Сессии..."
                + "\nну..и  с провожанием тян с колледжа.");
        JOptionPane.showMessageDialog(null, "Эх,Голова Раскалывается...хочется поспать и похмелиться ."
                + "\nЯ взял бутылку с водой,попил,иии... уснул. ");
        JOptionPane.showMessageDialog(null, "Однако проснулся от того ,"
                + "\nчто услышал шум и хотелось снова похмелится! ");
        JOptionPane.showMessageDialog(null, "Открыв глаза я увидил ,"
                + "\nчто кто то в красной куртке убегает с моей водой и "
                + "\nдовольно быстро.."
                + "\nМне очень хочется пить и понимая это я иду искать мою воду."
                + "\nИнформация о воре- чел в красной куртке!");
        JOptionPane.showMessageDialog(null, "Я иду по общаге и смотрю на куртки. "
                + "\nВижу различных людей в разных куртках но не в красной.."
                + "\nСпустя минуты ходьбы на моем этаже я решил начать ходить по этажам.");
        JOptionPane.showMessageDialog(null, "Я живу на 6-м этаже ."
                + "\nПрошел 7,8,9 этаж и не удив челов в красной куртке я начал идти в низ."
                + "\n5,4,3,2 таже фигня.");
        JOptionPane.showMessageDialog(null, "Спустивших на первый этаж я мгновенно увидил  красную куртку,"
                + "\nи подошев к этому челу я уже был готов пиздить его по ебалу.");
        JOptionPane.showMessageDialog(null, "Развернув чела левой рукой и замахнув правой рукой ,"
                + "\nя немного охуел когда увидил училку по русскому ,"
                + "\nрезко опустил руку  улыбнувшись ей."
                + "\nОднако, не смотря на это она все равно смотрела на меня ..."
                + "\nкак говорится 'в ахуе'");
        JOptionPane.showMessageDialog(null, "Я Извинившись пошел в столовку,"
                + "\nЧувствуя как меня провожает ее взгляд .");
        JOptionPane.showMessageDialog(null, "Когда я зашел в столовку я уже подзабыл про то,"
                + "\nчто у меня спиздили воду.. "
                + "\nОднако в меня врезался чел в красной куртке ,"
                + "\nпри этом сказав 'Cсори' ");
        JOptionPane.showMessageDialog(null, "Я ответил 'Ниче.. иди' однако,"
                + "\nя его сразу же остановил когда увидил у него в руках мою бутылку.. ");
        JOptionPane.showMessageDialog(null, "Он поняв ,что я его нашел попытался бежать... "
                + "\nно было поздно.я был зол!");

//Предметы которые дают тебе атаку и хп
        choose = Integer.parseInt(JOptionPane.showInputDialog(null, "Да начнется пиздилка за воду!"
                + "\nТы оглядываешься по сторонам и видишь предметы."
                + "\nКакой выбрать?"
                + "\n1)- Маккофе"
                + "\n2)- Чайник с водой"
                + "\n3)- Булочка"
                + "\n(P.S. напиши порядковый номер предмета)"));
        if (choose == 1) {
            JOptionPane.showMessageDialog(null, "Маккофе"
                    + "\nЧто может быть утром лучше горячего Маккофе?"
                    + "\nРазве что бутылочка миниралки после вчерашней бухаловки!"
                    + "\nПоэтому облей его этим маккофе и забери миниралку.");
            Mattak = Mattak + 10;
            Mhp = Mhp + 110;
        } else if (choose == 2) {
            JOptionPane.showMessageDialog(null, "Чайник с водой."
                    + "\nЧайник необычайно красив."
                    + "\nЭтот чайник не обычный."
                    + "\nЭтот чайник новый! "
                    + "\nТолько купленный из магаза");
            Mattak = Mattak + 12;
            Mhp = Mhp + 108;
        } else if (choose == 3) {
            JOptionPane.showMessageDialog(null, "Булочка. Никто не знает, что это"
                    + "\nэто булочка появляется очень редко ."
                    + "\nОна в неизвестный момент может как появляться так и исчезать."
                    + "\nНу а самое главное что эта булочка состоит из воды,"
                    + "\n(визуально это не видно ,но когда ты ее кушаешь ты как будто пьешь воду) ");
            Mattak = Mattak + 9;
            Mhp = Mhp + 120;
        }

        //Бой(процесс)
        while (Mhp > 0 && Php > 0) {
            choose = Integer.parseInt(JOptionPane.showInputDialog(null, "Мелкий песдюк атакует!"
                    + "\nОн пытается ударить тебя ногой,"
                    + "\nпри этом чуть не падая на пол."
                    + "Чем ответишь ему ты???"
                    + "\n1)- Пощечина"
                    + "\n2)- Ударить дверью по лбу"
                    + "\n3)- Пнуть ногой в грудь"
                    + "\n4)- Во время боя глотнуть воды  (x" + potions + ")"
                    + "\n5)- Выепнуться перед дамами дав ему леща!"
                    + "\nP.S. Ударив его дверью ,"
                    + "\nможет произойти кое что забавное"));
//переменные для составления боевки- легче ориентироваться                                                       
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
                JOptionPane.showMessageDialog(null, "Ты не рассчитал силы и "
                		+ "\nдверь отрикошетила тебе в хет ."
                		+ "\nТы теряешь на " + Dveri + " HP больше");
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
                JOptionPane.showMessageDialog(null, "Ты даешь ему леща ."
                		+ "\nОн получив слабый удар дает тебе сдачи."
                		+ "\nПоздровляю !Ты лоханулся и потерял дофига хп."
                		+ "\nБабы смеются ,ты потерял дофига хп,ты потерял время,"
                		+ "\nты в минусе,ты унижен."
                		+ "\nТеперь ты просто обязан уепать этого мелкого песдюка. ");
            }
            JOptionPane.showMessageDialog(null, "Ты нанёс мелкому песдюку " + Mdaga + " урона,"
                    + "\nПесдюк нанёс тебе " + Pdaga+"урона"
                    + "\nТеперь у песдюка " + Php + " жизни,"
                    + "\nУ тебя " + Mhp + " жизни.");
        }
        if (Mhp > 0) {
            JOptionPane.showMessageDialog(null, "Ты порвал этого песдюка ,"
                    + "\nПосле чего эпично ушел хлебая свою воду!"
                    + "\n и бабы все терь твои!)");
        } else {
            JOptionPane.showMessageDialog(null, "Песдюк тебя одолел,но как..?"
                    + "\nпроиграть ведь не реально ибо это перввый акт сука!");
        }
        choose = Integer.parseInt(JOptionPane.showInputDialog(null, "Если тебе понравилась игра - ставь лайк.(цифра 1!)"
        		+ "\nЕсли хочешь продолжения-жми 2!(точнее пиши)"));
if(choose == 1){
JOptionPane.showMessageDialog(null,"Нажав цифру 1, ты дал мне знать ,"
		+ "\nчто игра вышла то что надо ,и бабы точно теперь будут твои"
		+ "\nУдачи!");
}
else if(choose == 2){
JOptionPane.showMessageDialog(null,"Продолжения не будет."
		+ "\nА если будет то уже не в текстовом виде..."
		+ "\nТебя наепали .Ты опозорен."
		+ "\n Но ты все же отпиздил того песдюка,и все бабы по прежнему твои!"
		+ "\n Поэтому ты довольный идешь с бабами к себе в блок) ");

}
    }

}
