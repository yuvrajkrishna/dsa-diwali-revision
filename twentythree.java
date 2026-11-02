import java.util.Scanner;

public class twentythree {
    public static void main(String[] args) {
        System.out.println("Enter four digit Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = n/1000;
        int last = n % 10;
        if(first == last){
            System.out.println("First and Last Digit Are Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
