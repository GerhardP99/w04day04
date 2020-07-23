import java.util.Scanner;

public class UserInterface {
    public static int menu(){
        int selection;
        Scanner input = new Scanner(System.in);
        System.out.println("+------------------+");
        System.out.println("|\t\t\t\t   |");
        System.out.println("|\t  Welcome\t   |");
        System.out.println("|\t\t\t\t   |");
        System.out.println("+------------------+");
        System.out.println("1) Create a file in C:\\temp");
        System.out.println("2) Write something into the file.");
        System.out.println("3) Duplicate the file.");
        System.out.println("4) Move the file to ");
        System.out.println("5) Delete the file");
        System.out.println("6) Delete the copy of the file");
        System.out.println("7) Exit.");

        selection = input.nextInt();
        return selection;
    }
}
