package boboev.aziz;

import javax.swing.plaf.IconUIResource;

public class Main {
    //  Замените в строке все вхождения 'word' на
//'letter'.
    public static void main(String[] args) {
String string = "this word and that word was written by me ";
string= string.replace("word", "letter");
        System.out.println(string);
        }

           }