import java.util.Scanner;
public class twentytwo {
    public static void main(String[] args) {
        System.out.println("Enter 3 digit Number");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int n1 = n/100;
        int n2 = (n/10)%10;
        int n3 = n%10;
        if(n2 > n1 && n2 > n3){
            System.out.println("Mid elem is Largest");
        }
        else if(n2 < n1 && n2 < n3){
            System.out.println("Mid elem is Smallest");
        }
        else{
            System.out.println("Mid elem is Neither");
        }
    }
}
