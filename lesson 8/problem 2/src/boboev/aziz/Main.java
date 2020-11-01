package boboev.aziz;

public class Main {

            public static void main(String[] args) {
            int total = SumOfSquares(1, 4);
                System.out.println(total);
        }
        public static int SumOfSquares(int a, int b) {
            int sum = 0;
            for (int i = a; i <= b; i++) {
                sum = sum + i * i;
            }
            return sum;
    }
}
