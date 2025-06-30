import java.util.Scanner;

public class Scannerifelse {
   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your marks: ");
      int marks = sc.nextInt();
      String Grade;
        if(marks >=90){
           Grade ="A";
        }
        else if (marks >= 75) {
            Grade ="B";
        } 
        else if(marks >= 65){
             Grade ="c";
        }
        else {
            Grade ="D";
        }
        System.out.println("Your Grade is: " + Grade);
        sc.close();
    }
}
