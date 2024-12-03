
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
       int x = scan.nextInt(), res;
       if (x < 10) {
       for (int i = 1; i <= 10; i++){
        res = x * i;
        System.out.println(x + " * " + i +" = " + res);
       }
    } else 
    System.out.println("Число до 10!");


    } 
}
