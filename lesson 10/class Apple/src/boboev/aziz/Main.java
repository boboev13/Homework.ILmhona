package boboev.aziz;

public class Main {

    public static void main(String[] args) {
Apple apple=new Apple();
apple.kind = "Абориген";
apple.color = "красное";
apple.sweet = "да";
        System.out.println("сорт:" + apple.kind);
        System.out.println("цвет:" + apple.color);
        System.out.println("вкусное:" + apple.sweet);


        Apple apple2 = new Apple();
        apple2.kind= "апорт";
        apple2.color= "зеленый";
        apple2.sweet= "нет";


        System.out.println("сорт:" + apple.kind);
        System.out.println("цвет:" + apple.color);
        System.out.println("вкусное:" + apple.sweet);
    }
}
class  Apple {
    String kind;
    String color;
    String sweet;
}