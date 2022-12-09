package Laba2;
import java.util.Scanner;

public class Menu {
    private static TwoArrays array;
    private static Sentence sentence;

    public static void start() {
        mainMenu();
    }

    private static int readChoice() {
        Scanner in = new Scanner(System.in);
        int readed;
        try {
            readed = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println("Ошибка! Допустим только ввод значений пунктов меню");
            readed = readChoice();
        }
        return readed;
    }

    private static void inputArrayMenu() {
        int choice;
        do {
            System.out.println("Меню ввода массива");
            System.out.println("1 - Заполнить случайными элементами");
            System.out.println("2 - Ввести в ручную");
            System.out.println("0 - Выход\n");

            choice = readChoice();

            switch(choice) {
                case 1:
                    array = new TwoArrays();
                    break;
                case 2:
                    Scanner in = new Scanner(System.in);
                    System.out.println("Введите длину массива: ");
                  //  array = new TwoArrays(readChoice());
                    System.out.println("Введите ширину массива: ");
                    array.fillArray();
                    break;
                case 0:
                    break;
                default: System.out.println("Такой комадны не существует!");
            }
        } while (choice != 0);
    }

    private static void showArrayMenu() {
        int choice = -1;
        do {
            try {
                System.out.println("\nМеню работы с массивом");
                System.out.println("1 - Создать новый массив");
                System.out.println("2 - Вывести массив");
                System.out.println("3 - Сохранить массив в файл");
                System.out.println("4 - Прочитать массив из файла");
                System.out.println("5 - Средняя встречаемость целого числа в 2-ом массиве");
                System.out.println("0 - Выход\n");

                choice = readChoice();

                switch (choice) {
                    case 1:
                        inputArrayMenu();
                        break;
                    case 2:
                        array.printArray();
                        break;
                    case 3:
                        StorageManager.shared.arrayToFile(array.getArray(), "data.bin");

                        break;
                    case 4:
                        int[][] readedArray = StorageManager.shared.arrayFromFile("data.bin");
                        array = new TwoArrays(readedArray);
                        break;
                    case 5:
                        System.out.println("Средняя встречаемость:");
                        array.averageOccurrOfInteger();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Такой комадны не существует!");
                }
            } catch (NullPointerException e) {
                System.out.println("\nСначала необходимо заполнить массив!\n");
            }

        }while (choice != 0);
    }

    private static void mainMenu() {
        int choice;
        do {
            System.out.println("\nГлавное меню");
            System.out.println("1 - Задача на работу с массивами");
            System.out.println("2 - Задача на работу со строки");
            System.out.println("0 - Выход\n");

            choice = readChoice();

            switch(choice) {
                case 1: showArrayMenu();
                case 2: showSentenceMenu();
                case 0:
                    System.out.println("Штатный выход из программы...");
                    break;
                default: System.out.println("Такой комадны не существует!");
            }
        } while (choice != 0);
    }

    private static void showSentenceMenu() {
      //  Scanner in = new Scanner(System.in);
        int choice = -1;
        do {
            try {


                System.out.println("\nМеню работы со строками");
                System.out.println("1 - Создать новую строку");
                System.out.println("2 - Вывести строку");
                System.out.println("3 - Сохранить строку в файл");
                System.out.println("4 - Прочитать строку из файла");
                System.out.println("5 - Отсортировать строку по длине или по алфавиту, если слов одинаковой длины несколько");
                System.out.println("6 - Удалить слова, у которых первая буква совпадает с последней");
                System.out.println("7 - Подсчитать среднее число встречаемости буквы в предложении");
                System.out.println("0 - Выход\n");

                choice = readChoice();

                switch (choice) {
                    case 1:
                        inputSentenceMenu();
                        break;
                    case 2:
                        System.out.println("Полученная строка: " + sentence.getLine());
                        break;
                    case 3:
                        StorageManager.shared.sentenceToTextFile(sentence.getLine(), "data.txt");
                        break;
                    case 4:
                        String readedSentence = StorageManager.shared.sentenceFromTextFile("data.txt");
                        sentence = new Sentence(readedSentence);
                        break;
                    case 5:
                        System.out.println("Полученная строка: ");
                        sentence.sortingSensForLenOrlAphabet();
//                        System.out.print("Введите слово, которое хотите развернуть: ");
//                        sentence.setReversingWord(in.nextLine());
                        break;
                    case 6:
                        System.out.println("Полученная строка: ");
                        sentence.delFirstAndLast();
//                        System.out.print("Введите слово, которое хотите вставить в строку: ");
//                        sentence.setAddingLetters(in.nextLine());
//                        System.out.print("Введите слово, в которое хотите поместить в строку: ");
//                        sentence.setChangingWord(in.nextLine());
//                        sentence.appendLetters();
                        break;
                    case 7:
                        Scanner in = new Scanner(System.in);
                        System.out.println("Введите нужную букву: ");
                        sentence.setLetter(in.nextLine());
                        System.out.println("Полученная строка: ");
                        sentence.averageOccurOfLetter();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Такой комадны не существует!");
                }
            } catch (NullPointerException e) {
                System.out.println("\nСначала введите строку!\n");
            }
        } while (choice != 0);
    }

    private static void inputSentenceMenu() {
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Меню ввода  строки\n");
            System.out.println("1 - Заполнить случайными элементами");
            System.out.println("2 - Ввести в ручную");
            System.out.println("0 - Выход\n");

            choice = readChoice();

            switch(choice) {
                case 1:
                    sentence = new Sentence();
                    break;
                case 2:
                    System.out.print("Введите строку: ");
                    sentence = new Sentence(in.nextLine());
                    break;
                case 0:
                    break;
                default: System.out.println("Такой комадны не существует!");
            }
        } while (choice != 0);
    }
}
