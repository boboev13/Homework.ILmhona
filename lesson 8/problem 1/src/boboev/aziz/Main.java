package boboev.aziz;
        public class Main {
            public static void main(String[] args) {
                int maxNum = max(218, 43);
        System.out.println(maxNum);
    }

    public static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y; }
    }
}