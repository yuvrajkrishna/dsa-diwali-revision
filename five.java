import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num% 4 == 0){
            if(num%100 != 0){
                System.out.println("Leap Year");
            }
            else{
                if(num%400 == 0){
                    System.out.println("Leap Year");
                }
                else{
                    System.out.println("Not Leap Year");
                }
            }
        }
        else{
            System.out.println("Not Leap Year");
        }
        sc.close();
    }
}
