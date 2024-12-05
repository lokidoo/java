
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите вашу строку: ");

        String line = scan.nextLine();

        for (int i = line.length() - 1; i >= 0; i--)
            System.out.print(line.charAt(i));

    }
}
