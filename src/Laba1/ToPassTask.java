package Laba1;

import Laba1.FirstLab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ToPassTask {
    public static void TaskA() //a.	Отсортируйте слова в предложении по длине слов, если слов с одинаковой длины несколько, то по алфавиту
    {
//        Scanner scan = new Scanner(System.in);
//        String line = scan.nextLine();
        String line = "let's celebrate and drink some tea"; //подаём заданную строку
        String formatLine = line.replaceAll("\\W", " "); // заменяем символы по типу ". , :" на пробел
        List<String> words = Arrays.asList(formatLine.split("\\s+")); //представляем массив в виде списка с параметром разделения в виде одного или более пробелов
        words.sort(new FirstLab.LengthFirstComparator()); //сортируем слова по длине слова или по алфавиту
        System.out.println(String.format("До: %s\nПосле: %s", line, String.join(" ", words))); //сначала выводим непреобразованную строку, а далее преобразованную с помощью метода образования новой строки с разделителем пробел
    }
    public static void TaskB() //b.	Удалите из предложения слова, у которых первая буква совпадает с последней
    {
//        Scanner scan = new Scanner(System.in);
//        String line = scan.nextLine();
        String line = "Leathel cluc is two blocks behind. I do weew";
        List<String> words = Arrays.asList((line.replaceAll("\\W", " ")).split("\\s+")); // заменяем символы по типу ". , :" на пробел и //представляем массив в виде списка с параметром разделения в виде одного или более пробелов
        for (String word : words){
            //substring() возвращает подстроку строки между двумя индексами, или от одного индекса и до конца строки.
            //если первая буква слова и ее нижний регистр равен последней букве этого слова в нижнем регистре, то
            if((word.substring(0,1).toLowerCase()).equals(word.substring(word.length() - 1).toLowerCase())){
                words.set(words.indexOf(word), ""); //удаляем это слово
            }
        }
        String message = String.join(" ", words).replaceAll("\\s+", " "); //объединяем в новую строку и заменяем 1 и более пробелов на 1 пробел
        System.out.println(String.format("До: %s\nПосле: %s", line, message)); //сначала выводим непреобразованную строку, а далее преобразованную
    }
    public static void TaskC() //c.	Определить среднее число встречаемости элементов в двумерном целочисленном массиве
    {
//        Scanner scan = new Scanner(System.in);
//        String line = scan.nextLine();
        String[][] arr = {{"1", "2", "3", "4"}, {"8", "1", "1", "8"}, {"4", "4", "1","8"}}; //заданный массив
        String[] toSearch = {"1", "8", "3"}; //массив, для нахождения в двумерном массиве определенного элемента
        //запускаем цикл, до количества элементов, заданным массивом
        for (int i = 0; i < toSearch.length; i++){
            List <String> asList = Arrays.asList(arr[i]);//
            System.out.println(String.format(
                    "Средняя встречаемость элемента %s в массиве %d: %.4f",
                    toSearch[i], i+1, (float)(Collections.frequency(asList, toSearch[i])) / arr[i].length
            ));
        }
    }

    public static void TaskD()//d.	Определить среднее число встречаемости буквы в предложении
    {
//        Scanner scan = new Scanner(System.in);
//        String line = scan.nextLine();
        String line = "As we can";
        String formatLine = line.replaceAll("\\W", "").toLowerCase(); // заменяем символы по типу ". , :" на пробел и меняем на нидний регист
        List <String> letters = Arrays.asList(formatLine.split("")); //разделяем слова по буквам
        String letterToFind = "s";
        int occurrences = Collections.frequency(letters, letterToFind);//находим, сколько раз встречается заданная буква в строке
        System.out.println(String.format(
                "Строка: %s\nВстречено совпадений: %d\nДлина строки без пробелов: %d\nСредняя встречаемость: %.4f",
                line, occurrences, formatLine.length(), (float)occurrences / letters.size())
        );
    }
}
