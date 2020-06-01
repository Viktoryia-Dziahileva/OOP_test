public class Zad2 {
    public static void main (String args[]){
        sumLiczb(2,5);

    }
public static void sumLiczb(int x, int y){
        int sum=0;
        for (int i=x; i<=y; i++){
            sum=sum+i;
        }
    System.out.println(sum);
}
}