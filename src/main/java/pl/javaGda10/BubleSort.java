package pl.javaGda10;

public class BubleSort {
    public static void sort(int[] tablica){
/*
* procedure bubbleSort( A : lista elementów do posortowania )
  n = liczba_elementów(A)
   do
    for (i = 0; i < n-1; i++) do:
      if A[i] > A[i+1] then
        swap(A[i], A[i+1])
      end if
    end for
    n = n-1
  while n > 1
end procedure*/
int n = tablica.length;
do {
    for (int i = 0; i <n-1; i++) {
        if (tablica[i]>tablica[i+1]){
            int tymczasowaZmienna = tablica[i];
            tablica[i]= tablica[i+1];
            tablica[i+1] = tymczasowaZmienna;
        }
    }
     n--;
}while (n>1);

    }
}
