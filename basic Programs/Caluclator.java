import java.util.Scanner;
public class Caluclator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a symbol: ");
        char x = sc.next().charAt(0);
        System.out.print("Enter a first number: ");
        int a = sc.nextInt();
        System.out.print("Enter a second number: ");
        int b = sc.nextInt();
        switch(x){
            case '+':
            System.out.println("Addition of two numbers is:"+ (a+b));
            break;
            case '-':
            System.out.println("Subtraction of two numbers is:" + (a-b));
            break;
            case '*':
            System.out.println("Multiplication of two numbers is:" + (a*b));
            break;
            case '%':
            System.out.println("Modulus of two numbers is:" + (a%b));
            break;
            case '/':
            System.out.println("Division of two numbers is:" + (a/b));
            break;
            default:
            System.out.println("It's not a valid input");
        }
        sc.close();
    }
}