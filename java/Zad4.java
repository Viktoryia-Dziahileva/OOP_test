import java.util.*;
public class Zad4 {
    public static void main (String args []){
        Scanner in = new Scanner(System.in);
        System.out.println("Wpisz 3 liczby");
        int[] tab = new int[3];

        for (int i=0; i<tab.length; i++){
            tab[i] = in.nextInt();

        }
        int max = tab[0];
        int min = tab[0];
        for (int i=0; i<tab.length; i++) {
            if (max < tab[i]) {
                max = tab[i];
            }
            if (min > tab[i]) {
                min = tab[i];
            }
        }
        System.out.println("Zadana tablica: "+ Arrays.toString(tab));
        System.out.println("Minimum: "+ min);
        System.out.println("Maksimum: "+ max);
        int y=tab[0];
        tab[0]=tab[2];
        tab [2]=y;
        System.out.println("Wynik: "+ Arrays.toString(tab));
    }
}
