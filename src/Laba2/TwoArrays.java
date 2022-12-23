package Laba2;
import java.util.*;
import java.util.stream.Stream;

final public class TwoArrays {
    private int[][] array;
    private int len;
    private int width;
    public TwoArrays (int row, int collumn) {
        this.len = row;
        this.width = collumn;
        this.array = new int[len][width];
    }
//    public TwoArrays(int size){
//        this.len = size;
//        this.width = size;
//        this.array = new int[len][width];
//    }
    public TwoArrays() {
        this(3,3);
        this.array = new int[len][width];
        this.setRandom();
    }
    public TwoArrays(int[][] array) {
        this.len = array.length;
        this.width = array.length;
        this.array = new int[array.length][array.length];
        setArray(array);
    }

    public TwoArrays(int readChoice) {
        this.len = readChoice;
        System.out.println("Введите высоту массива: ");
        this.width = Menu.readChoice();
        this.array = new int[len][width];
    }

    public void setArray(int[][] array) {
        for(int i = 0; i < len; ++i){
            for(int j = 0; j < width; ++j){
                this.array[i][j] = array[i][j];
            }
        }
    }
    public int[][] getArray() {
        return this.array;
    }
   public TwoArrays(TwoArrays givenObject) {

       this.len = givenObject.len;
       this.width = givenObject.width;
       this.array = new int[len][width];
   //    fillArray();
   }
    private void setRandom() {
        Random r = new Random();
        for (int i = 0; i < this.array.length; i++) {
            for(int j = 0; j < this.array[i].length; j++) {
                this.array[i][j] = r.nextInt(11) - 5;
            }
        }
    }
    public void fillArray() {
   //     Scanner in = new Scanner(System.in);
        for (int i = 0; i < this.len; ++i) {
            for(int j = 0; j < this.width; ++j) {
                System.out.print("[" + (i + 1) + "]" +"[" + (j + 1) + "]" + " элемент = ");
                this.array[i][j] = Menu.readChoice();
            }
        }
    }
    public void printArray() {
        for (int i = 0; i < this.len; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print("[" + (i + 1) + "]" + "[" + (j + 1) + "]" + " элемент = " + array[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public void averageOccurrOfInteger()
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                Integer count = map.getOrDefault(this.array[i][j], 0);
                map.put(this.array[i][j], count + 1);
            }
        }
        map.forEach((key, value) -> {
            System.out.println(key + " -> " + (float) value / (Stream.of(getArray()).mapToInt(m -> m.length).sum()));
        });
        System.out.println("\n");
    }
}
