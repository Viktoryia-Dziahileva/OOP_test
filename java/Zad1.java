import java.util.Scanner;

public class Zad1 {
    public static void main (String args []){
        Scanner in=new Scanner (System.in);
        System.out.println("Podaj cyfre");
        int index=in.nextInt();

        if (index==1){
            System.out.println("To jest liczba pierwsza");
        }
        else System.out.println("To nie jest liczba pierwsza");

        for (int i=1; i<5; i++){
            System.out.println(index+ "x" + i+ "=" + (index*i));
        }
    }
}
