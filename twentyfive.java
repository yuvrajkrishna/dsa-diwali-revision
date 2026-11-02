import java.util.Scanner;
public class twentyfive {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 7 == 0 && n % 10 == 7){
            System.out.println("It is Multiple of 7 and last digit is 7");
        }
        else if(n % 7 != 0 && n % 10 == 7){
            System.out.println("Last Digit is 7");
        }
        else if(n % 7 == 0 && n % 10 != 7){
            System.out.println("Multiple of 7");
        }
        else{
            System.out.println("Neither Multiple nor last Digit of 7");
        }
    }
}
