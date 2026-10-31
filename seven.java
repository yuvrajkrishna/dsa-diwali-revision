import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();
        System.out.println("Enter Number 3");
        int num3 = sc.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println("Number 1 is greatest");
        }
        else if(num1 >= num2 && num1 > num3){
            System.out.println("Number 1 and Number 2 is greatest");
        }
        else if(num1 < num2 && num2 > num3){
            System.out.println("Number 2 is greatest");
        }
        else if(num1 > num2 && num1 < num3){
            System.out.println("Number 3 is greatest");
        }
        else if(num1 < num2 && num2 >= num3){
            System.out.println("Number 2 and Number 3 is greatest");
        }
        else if(num1 < num2 && num2 < num3){
            System.out.println("Number 3 is greatest");
        }
        else if(num1 == num2 && num2 > num3){
            System.out.println("Number 1 and Number 2 is greatest");
        }
        else if(num1 > num2 && num1 == num3){
            System.out.println("Number 1 and Number 3 is greatest");
        }
        else{
            System.out.println("Number 1 , Number 2 and Number 3 is greatest");
        }
    }
}
