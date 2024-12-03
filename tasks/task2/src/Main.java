import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Введите вашу строку: ");
        String in = scan.nextLine();

        boolean isPalindrome = true;
        int i = 0;

        while (i < in.length() / 2) {
            char ch1 = in.charAt(i);
            char ch2 = in.charAt(in.length() - 1 - i);
            
            if (ch1 != ch2) {
                System.out.println("Ошибка! Строка не является палиндромом.");
                isPalindrome = false;
                break;
            }
            i++;
        }

        if (isPalindrome) {
            System.out.println("Строка является палиндромом.");
        }
        
        scan.close();
    }
}
