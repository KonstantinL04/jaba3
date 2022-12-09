//package Laba2;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class ArraysInt {
//    public int InputSizeArray() {
//        Scanner scan = new Scanner(System.in);
//        int x, y;
//        System.out.println("Введите кол-во строк: ");
//        x = scan.nextInt();
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
//    }
//    public static void AverageValue(){
//        Map<Integer, Integer> map = new HashMap<>();
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
//    }
//}
