import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Введите строку: ");
        String input = scan.nextLine();
        
        input = input.trim();
        
        if (input.isEmpty()) {
            System.out.println("Количество слов: 0");
        } else {
            String[] words = input.split("\\s+"); 
            System.out.println("Количество слов: " + words.length);
        }

        scan.close();
    }
}
