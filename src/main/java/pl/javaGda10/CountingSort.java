package pl.javaGda10;

public class CountingSort {
    public static void sort(int[] tablica){
        int licznikOperacji = 0;
        //odgórny zakres - >255
        int[] iloscLiczb = new int[256];
        for (int i = 0; i <tablica.length ; i++) {
            licznikOperacji++;
            int wartoscTablicy = tablica[i];
            iloscLiczb[wartoscTablicy]++;
        }
        int pozycjaWstawiania=0;
        //n operacji
        for (int j = 0; j <iloscLiczb.length ; j++) {
            for (int i = 0; i <iloscLiczb[j] ; i++) {
                licznikOperacji++;
                tablica[pozycjaWstawiania]=j;
                pozycjaWstawiania++;
            }
            System.out.println("Licznik: "+licznikOperacji);
        }
    }
}
