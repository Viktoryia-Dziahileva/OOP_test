import java.util.*;

public class CreatTab  {
    static int[] tab = new int[3];
      public static void crTab() {
            Scanner in = new Scanner(System.in);
            System.out.println("Wpisz 3 liczby");

            for (int i = 0; i < tab.length; i++) {
                tab[i] = in.nextInt();
            }
            System.out.println("Zadana tablica: " + Arrays.toString(tab));
        }
    }