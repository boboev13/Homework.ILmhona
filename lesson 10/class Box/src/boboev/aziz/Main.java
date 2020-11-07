package boboev.aziz;

public class Main {

    public static void main(String[] args) {
       Box box = new Box();
       box.height = 45;
       box.width = 35;
       box.material = "прастик";
       box.weight = 90;

        System.out.println("высота:"+ box.height);
        System.out.println("ширина:"+ box.width);
        System.out.println("материал:"+ box.material);
        System.out.println("вес:"+ box.weight);

        Box box2 = new Box();
        box2.height = 78;
        box2.width= 56;
        box2.material = "дерево";
        box2.width = 120;


        Box box3 = new Box();
        box3.height = 20;
        box3.weight = 20;
        box3.material = "сталь";
        box3.weight = 100;
    }
}
class Box{
    int height;
    int width;
    String material;
    int  weight;
}