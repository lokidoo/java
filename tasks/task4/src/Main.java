
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int random = (int) (Math.random() * 100) + 1;
        
        System.out.println("Угадайте число! ");

        boolean guessed = false;

        while (!guessed){

            int num = scan.nextInt();
            int dif = num - random;

           // System.out.println(dif + " " + random); написано исключительно для сверки результатов 

            if (dif == 0){
                System.out.println("Вы угадали! ");
                guessed = true;
            } 
            else if (dif < 0 && dif >= -20)
                System.out.println("Чуточку больше! ");
            else if (dif < 0 && dif < -20 && dif >= -100) 
                System.out.println("Больше! ");         
            
            else if (dif > 0 && dif < 20)
                System.out.println("Чуточку меньше! ");
            else if (dif > 0 && dif > 20 && dif < 100) 
            System.out.println("Меньше ");       

        }
        
    }
}
