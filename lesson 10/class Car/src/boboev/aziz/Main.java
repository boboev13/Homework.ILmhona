package boboev.aziz;

public class Main {

    public static void main(String[] args) {
Car car1= new Car();
car1.name= "Ваз-2106";
car1.color = "серый";
car1.yearoffundation=2006;
        System.out.println("название:" + car1.name);
        System.out.println("цвет:" + car1.color);
        System.out.println("год производства:" + car1.yearoffundation);

        Car car2 = new Car();
        car2.name = "opel";
        car2.color = "красный";
        car2.yearoffundation= 1996;


        Car car3 = new Car();
        car3.name = "porsche";
        car3.color = "чёрный";
        car3.yearoffundation = 2017;

        Car car4 = new Car();
        car4.name="toyota";
        car4.color= "мокрый асфальт";
        car4.yearoffundation= 2019;

    }
}
class Car {
    String name;
    String color;
    int yearoffundation;
}