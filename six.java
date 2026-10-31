import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int n1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int n2 = sc.nextInt();
        if(n1 > n2){
            System.out.println("Number 1 is greater");
        }
        else if(n1 == n2){
            System.out.println("Number 1 and Number 2 is equal");
        }
        else{
            System.out.println("Number 2 is greater");
        }
    }
}
