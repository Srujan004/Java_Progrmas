import java.util.Scanner;
public class Divisibleby5 {
    public static void main(String[] args){
        Scanner dv = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = dv.nextInt();
        if(a % 5 == 0 && a % 11 == 0){
            System.out.println("The given number is divisible by both 5 and 11");
        }
        else if(a % 5 == 0){
            System.out.println("It's only divisible by 5");
        }
        else if(a % 11 == 0){
            System.out.println("It's only divisible by 11");
        }
        else{
            System.out.println("It's not divisible by both numbers");
        }
        dv.close();
    }
}
