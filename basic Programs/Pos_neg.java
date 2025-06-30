import java.util.Scanner;
public class Pos_neg {
    public static void main(String[] args) {
        Scanner pos = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a = pos.nextInt();
        if(a>0){
            System.out.println("It's a Positive number");
        }
        else if(a<0){
            System.out.println("It's a Negative number");
        }
        else{
            System.out.println("It's Zero");
        }
        pos.close();

    }
}
