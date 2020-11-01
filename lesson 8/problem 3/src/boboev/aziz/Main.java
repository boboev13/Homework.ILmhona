package boboev.aziz;

public class Main {

    public static void main(String[] args) {
        int[] array = {15, 6, 1, 7, 3, 87, 2, 9, 43};
        int maxNumInArray = maxInArray(array);
        System.out.println(maxNumInArray);

    }
    public static int maxInArray(int[] array) {
        int counter = array[0];
        for (int i = 0; i < array.length; i++) {
            if (counter < array[i]) {
                counter = array[i];
            }
        }
        return counter;
    }
}
