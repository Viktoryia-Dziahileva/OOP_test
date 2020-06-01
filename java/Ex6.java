import java.util.Arrays;

public class Ex6 {
    public static void main(String args[]) {
        CreatTab.crTab();
        liczUjem();
    }

    public static void liczUjem() {
        int[] tab1 = CreatTab.tab;
        int number = 0;
        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] < 0) {
                number++;
            }
        }
        System.out.println("Ilość ujemnych = " + number);
        int[] tab2 = new int[number];
        int j = 0;
        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] < 0) {
                tab2[j] = tab1[i];
                j++;
            }
        }
        System.out.println("Tablica ujemnych: " + Arrays.toString(tab2));
    }
}