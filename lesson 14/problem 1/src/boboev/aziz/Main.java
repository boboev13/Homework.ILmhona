package boboev.aziz;


// Дана строка. Вывести первые три символа и
//последний три символа, если длина строки больше 5.
//Иначе вывести первый символ столько раз, какова
//длина строки.


public class Main {

    public static void main(String[] args) {
        String mystring = new String("hello world");
        String resultStr = mystring.substring(0, 3);
        String Str = mystring.substring(8,11);
        String symbol = "//";
        System.out.println(resultStr);
        System.out.println(      );
        System.out.println(Str);
                for ( int i=0; i<mystring.length();i++){
                    if (mystring.charAt(i) > 5) {
                        System.out.println(mystring.charAt(0));
                    }
                    System.out.println(mystring.charAt(0));
                }
            }
}
