import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;

public class Main extends UserInterface {

    public static void main(String[] args) throws InterruptedException, IOException {
        int userChoice;
        userChoice = menu();
        String filePath = "c://temp//gerhardsTestFile.txt";
        String filePathCopy = "c://temp//gerhardsTestFile-Copy.txt";
        int timeOut = 0; // seconds

        /*Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();*/


        switch (userChoice) {
            case 1:
                System.out.println("You chose action 1.");
                TimeUnit.SECONDS.sleep(timeOut);
                System.out.print("\nCreating a file for you because you are too lazy to do it yourself");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".\n");
                try {
                    File file = new File(filePath); // Create file
                    if (file.createNewFile()) { // Use createNewFile() method
                        System.out.println("File created: " + file.getName());
                    } else {
                        System.out.println("File already exists");
                    }
                } catch (Exception e) {
                    System.out.println("An error occured");
                    e.printStackTrace();
                }
                break;
            case 2:
                System.out.println("You chose action 2.");
                TimeUnit.SECONDS.sleep(timeOut);
                System.out.print("\nWriting something into the file, wait please im not that fast");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".\n");
                try {
                    FileWriter file = new FileWriter(filePath);
                    file.write("You wanted me to writed something here, now you got something in this file have fun :)");
                    file.close();
                    System.out.println("Successfully wrote to file.");
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
                break;
            case 3:
                System.out.println("You chose action 3.");
                TimeUnit.SECONDS.sleep(timeOut);
                System.out.print("\nCreating a copy of the file.");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".\n");
                try {
                    FileSystem system = FileSystems.getDefault();
                    Path original = system.getPath(filePath);
                    Path target = system.getPath(filePathCopy);
                    Files.copy(original, target);
                    System.out.println("File copied!");
                }catch(IOException e){
                    System.out.println("\nAn Error occurred, does the File already exist?\n");
                    e.printStackTrace();
                }
                break;
            case 4:
                System.out.println("You chose action 4.");
                TimeUnit.SECONDS.sleep(timeOut);
                System.out.print("\nMoving the file to another directory");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".\n");
                System.out.print("\nIts a prank, i working on that.");
                break;
            case 5:
                System.out.println("You chose action 5.");
                TimeUnit.SECONDS.sleep(timeOut);
                System.out.print("\nDestroying the file, i think you have something to hide from the FBI");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".\n");
                File file = new File(filePath);
                if(file.delete())
                {
                    System.out.println("File delete: successfully");
                }
                else
                {
                    System.out.println("File delete: failed");
                }
                break;
            case 6:
                System.out.println("You chose action 6.");
                TimeUnit.SECONDS.sleep(timeOut);
                System.out.print("\nYea better don't forget the copy");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".\n");
                File fileCopy = new File(filePathCopy);
                if(fileCopy.delete())
                {
                    System.out.println("File delete: successfully");
                }
                else
                {
                    System.out.println("File delete: failed");
                }
                break;
            default:
                // The user input an unexpected choice.
        }
    }
}
