import java.util.Scanner;

public class twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Side one");
        int a = sc.nextInt();
        System.out.println("Side 2");
        int b = sc.nextInt();
        System.out.println("Side 3");
        int c = sc.nextInt();
        boolean isValidTriangle = false;
        if(a+b > c && a+c > b && b+c > a){
            isValidTriangle = true;
        }
        else{
            System.out.println("Not Valid Triangle");
            return;
        }
        if(isValidTriangle){
            if(a == b && b == c){
                System.out.println("Equilateral Triangle");
            }
            else if(a == b || b == c || a==c){
                System.out.println("Isosceles Triangle");
            }
            else{
                System.out.println("Scalene Triangle");
            }
        }
        sc.close();
    }
}
