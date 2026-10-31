import java.util.Scanner;
public class one{
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("Number is Positive");
        }
        else if(num == 0){
            System.out.println("Number is Zero");
        }
        else{
            System.out.println("Number is Negative");
        }
    }
}