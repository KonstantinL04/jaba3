package Laba2;
import java.util.stream.Stream;
final public class Main {
    public static void main(String[] args) {
        Menu.start();
    }
}
//    public static void main(String[] args) {
//        Sentence sentence1 = new Sentence();
//        Sentence sentence2 = new Sentence();
//        TwoArrays sentence3 = new TwoArrays();
//        Sentence sentence4 = new Sentence();
//
//        System.out.println(sentence1.Print1());
//        System.out.println(sentence2.Print2());
//        System.out.println("c) Среднее значение в массиве: ");
//        sentence3.TaskC().forEach((key, value) -> {
//            System.out.println(key + " -> " + (float) value / (Stream.of(sentence3.getArray()).mapToInt(m -> m.length).sum()));
//        });
//        System.out.println("\n");
//        System.out.println(sentence4.Print4());
//    }
//}
//        Scanner scan = new Scanner(System.in);
//        int x = 0;
//        String s ="";
//        while (!"5".equals(s)){
//            Menu.MenuRun();
//            s = scan.next();
//            x = Integer.parseInt(s);
//            switch (x){
//                case 1:
//                    TaskA();
//                    break;
//                case 2:
//                    TaskB();
//                    break;
//                case 3:
//                    TaskC();
//                    break;
//                case 4:
//                    TaskD();
//                    break;
//                case 5:
//                    break;
//                default:
//                    System.out.println("Неверный ввод");
//                    break;
//            }
//        }
//        System.out.println("До свидания!");
//    }


//    public static void TaskB()
//    {
//        String line = Strings.ScanningStr();
//        List<String> words = TransformString(line);// заменяем символы по типу ". , :" на пробел и //представляем массив в виде списка с параметром разделения в виде одного или более пробелов
//        words = Strings.FirstLetterEqualLast(words);
//        String message = String.join(" ", words).replaceAll("\\s+", " "); //объединяем в новую строку и заменяем 1 и более пробелов на 1 пробел
//        System.out.println(String.format("До: %s\nПосле: %s", line, message)); //сначала выводим непреобразованную строку, а далее преобразованную
//    }
//    public void TaskC()
//    {
//        ArraysInt.InputSizeArray();
//        ArraysInt.AverageValue();
////        Map<Integer, Integer> map = new HashMap<>();
////        Scanner scan = new Scanner(System.in);
////        int x, y;
////        System.out.println("Введите кол-во строк: ");
////        x = scan.nextInt();
//        System.out.println("Введите кол-во столбцов: ");
//        y = scan.nextInt();
//        int[][] arr = new int[x][y]; //заданный массив
//        //запускаем цикл, ввода чисел
//        for (int  i = 0; i < x; i++){
//            for(int j = 0; j < y; j++){
//                System.out.print("arr["+ (i+1) + "][" + (j+1) + "]" + " = ");
//                arr[i][j] = scan.nextInt();
//            }
//        }
//
//        System.out.println ("Средняя стречаемость чисел:");
//        for (int  i = 0; i < x; i++){
//            for(int j = 0; j < y; j++){
//                Integer count = map.getOrDefault(arr[i][j], 0);
//                map.put(arr[i][j], count + 1);
//            }
//        }
//        map.forEach((key, value) -> {
//            System.out.println(key + " -> " + (float)value/(x*y));
//        });
//   }


//    public static void TaskD()
//    {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите строку:");
//        String line = scan.nextLine();
//        String formatLine = line.replaceAll("\\W", "").toLowerCase(); // заменяем символы по типу ". , :" на пробел и меняем на нидний регист
//        List <String> letters = Arrays.asList(formatLine.split("")); //разделяем слова по буквам
//        System.out.println("Введите букву:");
//        String letterToFind = scan.nextLine();
//        int occurrences = Collections.frequency(letters, letterToFind);//находим, сколько раз встречается заданная буква в строке
//        System.out.println(String.format(
//                "Строка: %s\nВстречено совпадений: %d\nДлина строки без пробелов: %d\nСредняя встречаемость: %.4f",
//                line, occurrences, formatLine.length(), (float)occurrences / letters.size())
//        );
//    }
//    public static class LengthFirstComparator implements Comparator<String> {
//        @Override
//        public int compare(String o1, String o2) {
//            if (o1.length()!=o2.length()) {
//                return o1.length()-o2.length();
//            }
//            return o1.compareTo(o2);
//        }
//    }
//}
