package boboev.aziz;

import javax.swing.*;

public class Main {
//Дана строка. Определите, какой символ в ней
//встречается раньше: 'x' или 'w'. Если какого-то
//из символов нет, вывести сообщение об этом.

    public static void main(String[] args) {
        String string = "the same exercise or word";
        String x = "x";
        String w = "w";
        if (!string.contains(x)) {
            System.out.println("строка не содержит Х");

        if (!string.contains(w)) {
            System.out.println("ни одного символа нет");

        } else {
            check(string);
        }
    }  else {
        check(string);
        if (!string.contains(w)) {
            System.out.println("символа w нет");
        }
    }
    }

    private static void check(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'x' || string.charAt(i) == 'w') {
                System.out.println(string.charAt(i));
            }
        }
    }
}