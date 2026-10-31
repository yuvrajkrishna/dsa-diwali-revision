import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("Number is divisble by 3 and 5");
        }
        else{
            System.out.println("Number is Not divisible by 3 and 5");
        }
    }
}
