import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int n = sc.nextInt();

        int n1 = n%10;
        n /= 10;
        int n2 = n % 10;
        n /= 10;
        int n3 = n% 10;
        n/=10;
        if(n1 != n2 && n2 != n3 && n1 != n3){
            System.out.println("distinct");
        }
        else{
            System.out.println("Not distinct");
        }
        sc.close();
    }
}