package pl.javaGda10;

public class InsertionSort {
    public static void sort(int[] tablica){
        int licznikOperacji = 0;
        for (int i = 1; i < tablica.length; i++) {
            int key=tablica[i];

            int j=i-1;
            while (j>=0&& tablica[j]<key){
              tablica[j+1]=tablica[j];
              j--;
                 licznikOperacji++;
            }
            tablica[j+1]=key;
        }
        System.out.println("Licznik: "+licznikOperacji);
    }
}
