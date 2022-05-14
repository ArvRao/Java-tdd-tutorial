import java.util.Scanner;

public class TakeInput {
public static void main(String[] args) {
        // Scanner class allows to take input from console
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Favourite number: ");
        int favNumber= sc.nextInt();
        System.out.println("Programming language: ");
        String favLang = sc.nextLine();
        sc.close();
        System.out.println(favNumber);
        System.out.println(favLang);
    }
}
