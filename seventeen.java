import java.util.Scanner;

public class seventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();
        if(num1 % 2 == 0 && num2 % 2 == 0){
            System.out.println("Number 1 and Number 2 are even");
        }
        else if(num1 % 2 != 0 && num2 % 2 != 0){
            System.out.println("Number 1 and Number 2 are odd");
        }
        else {
            System.out.println("Either one is odd and other is even");
        }
    }
}
