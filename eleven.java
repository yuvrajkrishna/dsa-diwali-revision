import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Side one");
        int a = sc.nextInt();
        System.out.println("Side 2");
        int b = sc.nextInt();
        System.out.println("Side 3");
        int c = sc.nextInt();
        if(a+b > c && a+c > b && b+c > a){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Not Triangle");
        }
        sc.close();
    }
}
