import java.util.Scanner;

public class twentyeight {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num >= 100 && num <= 999){
            System.out.println("YES");
        }
        else{
            System.out.println("No");
        }
    }
}
