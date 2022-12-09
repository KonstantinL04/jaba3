package Laba1;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Strings {
    static List<String> TransformString(String line) {
        List<String> words = Arrays.asList((line.replaceAll("\\W", " ")).split("\\s+"));
        return words;
    }

    public static String ScanningStr() {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        return line;
    }

//  substring() возвращает подстроку строки между двумя индексами, или от одного индекса и до конца строки.
//  если первая буква слова и ее нижний регистр равен последней букве этого слова в нижнем регистре, то
    public static List<String> FirstLetterEqualLast(List<String> words){
        for (String word : words){
            if((word.substring(0,1).toLowerCase()).equals(word.substring(word.length() - 1).toLowerCase())){
                words.set(words.indexOf(word), ""); //удаляем это слово
            }
        }
        return words;
    }
}
