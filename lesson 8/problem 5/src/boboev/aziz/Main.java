package boboev.aziz;

public class Main {

    public static void main(String[] args) {
        double x = Math
        int[] array2 = {12, 2, 1, 8, 3, 9, 6};
            int totalNumArray = total(array2);
            System.out.println(totalNumArray);
        }


    public static int total (int [] array){
            int counter = 0;
            for ( int i = 0; i < array.length; i++){
                counter += array[i];
            }
            return counter;
    }
}
