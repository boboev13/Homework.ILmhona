package boboev.aziz;
 //  Дана строка. Если ее длина больше 10, то оставить
 //в строке только первые 6 символов, иначе дополнить
 //строку символами 'o' до длины 12.
public class Main {

    public static void main(String[] args) {
String string = "i lile";
if (string.length() > 10) {
    string = string.substring(0, 6);
} else {
    while (string.length() != 12) {
        string += 'o';
    }
}
        System.out.println(string);
    }
}
