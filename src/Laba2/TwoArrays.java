package Laba2;
import java.util.*;
import java.util.stream.Stream;

final public class TwoArrays {
    private int[][] array;
    private int length;
    private int width;
    public TwoArrays (int length, int width) {
        this.length = length;
        this.width = width;
        this.array = new int[this.length][this.width];
    }
    public void setArray(int[][] array) {
        this.array = Arrays.copyOf(array, array.length);
        this.length = array.length;
    }
    public int[][] getArray() {return this.array;}
    public TwoArrays() {
        this(3,3);
        this.setRandom();
    }
    public TwoArrays(int[][] array) {this.setArray(array);}
    public TwoArrays(TwoArrays givenObject) {

        this.length = givenObject.length;
        this.width = givenObject.width;
        this.array = new int[this.length][this.width];
        fillArray();
    }
    public void setRandom() {
        Random r = new Random();
        for (int i = 0; i < this.length; i++) {
            for(int j = 0; j < this.width; j++) {
                this.array[i][j] = r.nextInt(11) - 5;
            }
        }
    }
    public void fillArray() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < this.length; i++) {
            for(int j = 0; j < this.width; j++) {
                System.out.print("[" + (i + 1) + "]" +"[" + (j + 1) + "]" + " элемент = ");
                this.array[i][j] = in.nextInt();
            }
        }
    }
    public void printArray() {
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.width; j++)
            System.out.print("["+(i+1)+"]"+"["+(j+1)+"]"+" элемент = " + array[i][j] + "\n");
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
