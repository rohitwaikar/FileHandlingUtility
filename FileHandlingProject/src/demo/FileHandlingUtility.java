package demo;

import java.io.*;
import java.util.Scanner;

public class FileHandlingUtility {

    static Scanner sc = new Scanner(System.in);

    // WRITE FILE
    public static void writeFile(String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName);

            System.out.println("Enter text to write:");
            sc.nextLine(); // clear buffer
            String data = sc.nextLine();

            fw.write(data);
            fw.close();

            System.out.println("File written successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // READ FILE
    public static void readFile(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            System.out.println("\nFile Content:\n");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // MODIFY FILE (APPEND)
    public static void modifyFile(String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName, true);

            System.out.println("Enter text to append:");
            sc.nextLine();
            String data = sc.nextLine();

            fw.write("\n" + data);
            fw.close();

            System.out.println("File modified successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        int choice;
        String fileName;

        System.out.print("Enter file name (with .txt): ");
        fileName = sc.nextLine();

        do {
            System.out.println("\n1. Write File");
            System.out.println("2. Read File");
            System.out.println("3. Modify File");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    writeFile(fileName);
                    break;

                case 2:
                    readFile(fileName);
                    break;

                case 3:
                    modifyFile(fileName);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }
}
