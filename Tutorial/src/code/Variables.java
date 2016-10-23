package code;

public class Variables{
public static void main(String[] args){
//int - целое число
int variable_name;
//String - строка
String text;
//Логический тип, бывает правда/неправда - т.е. true или false
boolean bool;
//Это - символ. Он должен заключаться в одинарные(!) ковычки
char symb;
//float - число с плавающей точкой. Один из дух типов, поддерживающий дробные числа
float fl;
text = "Это содержимое текстовой переменной";
variable_name = 10;
bool = true;
symb = 'a';
//В конце надо писать символ f
fl = 2.5f;
System.out.println(text);
System.out.println("А число равно = " + variable_name);
System.out.println("И это " + bool + "!");
System.out.println("Наш символ - " + symb);
System.out.println("Число с плавающей точкой - " + fl);
}	
}
