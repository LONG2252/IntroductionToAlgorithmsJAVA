package chapter2;

import java.util.Comparator;  

public class InsertionSort {  
    public static <T> void insertionSort(T[] t, Comparator<? super T> comparator) {  
        for (int j = 1; j < t.length; j++) {  
            T key = t[j];  
            int i = j - 1;  
            while (i > -1 && comparator.compare(t[i], key) > 0) {  
                t[i + 1] = t[i];  
                i--;  
            }  
            t[i + 1] = key;  
        }  
    }  
    public static void main(String[] args) {  
        Integer[] ints = new Integer[] { 31, 41, 59, 26, 41, 58 };  
        System.out.println("before InsertionSort:");  
        for (int i : ints)  
            System.out.print(i + " ");  
        System.out.println();  
        insertionSort(ints, new Comparator<Integer>() {  
            public int compare(Integer o1, Integer o2) {  
                return o1.intValue() - o2.intValue();  
            }  
        });  
        System.out.println("result:");  
        for (int i : ints)  
            System.out.print(i + " ");  
        System.out.println();  
    }  
}  
