package pl.javaGda10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       // int[] tablica = {1,2,3,4,5,6,7,8,9,10};
        int[] tablica = {10,9,8,23,5,17,7,8,91,1};
       // int[] tablica = new int[256];

        System.out.println("Przed "+ Arrays.toString(tablica));
        InsertionSort.sort(tablica);
        System.out.println("Po "+Arrays.toString(tablica));
    }
}
