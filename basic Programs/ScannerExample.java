import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your college name: ");
        String collegename = sc.nextLine();
        System.out.print("Enter your branch: ");
        String branch = sc.nextLine();
        System.out.print("Enter your year: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter you favourite programming language:");
        String favourite = sc.nextLine();
        System.out.print("Do you likes java (true/false): ");
        boolean likesJava = sc.nextBoolean();
        System.out.println("My name is: " + name);
        System.out.println("My college name is: "+collegename);
        System.out.println("My branch name is: " + branch);
        System.out.println("I'm pursuing" + year +"th year.");
        System.out.println("My favourite programming language is:" + favourite);
        System.out.println("I like java: " + likesJava);
        sc.close();
    }
    
}
