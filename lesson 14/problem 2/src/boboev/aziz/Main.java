package boboev.aziz;

public class Main {
    // Дана строка. Показать номера символов,
    //совпадающих с последним символом строки.
    public static void main(String[] args) {
        String myStr = new String("I like java");

        for (int i = 0; i < myStr.length(); i++) {
            if (myStr.charAt(i) == 'a') {
                System.out.println(myStr.indexOf('a'));
            }
        }
    }
}
