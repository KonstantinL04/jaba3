package Laba1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class LengthSort {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("cdf");
        list.add("bcd");
        list.add("abc");
        Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length()){
                    return 1;
                }else{
                    return o1.compareTo(o2);
                }
            }
        });

        System.out.println(list);
    }
}


