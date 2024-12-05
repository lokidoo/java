
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        System.out.print("Количество чисел: ");
        Scanner scan = new Scanner(System.in);
        int[] fibo = new int[scan.nextInt()];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < fibo.length; i++)
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        for (int i = 0; i < fibo.length; i++)
            System.out.print(fibo[i] + " ");

    }
}
