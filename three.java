import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 5 == 0){
            System.out.println("It is divisible by 5");
        }
        else{
            System.out.println("Not divisible by 5");
        }
    }
}
