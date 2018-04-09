package pl.javaGda10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       // int[] tablica = {1,2,3,4,5,6,7,8,9,10};
        int[] tablica = {9,4,3,23,5,17,7,8,91,1};

        System.out.println("Przed "+ Arrays.toString(tablica));
        BubleSort.sort(tablica);
        System.out.println("Po "+Arrays.toString(tablica));
    }
}
