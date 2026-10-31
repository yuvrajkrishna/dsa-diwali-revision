import java.util.Scanner;

public class fourteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1%num2 == 0 || num2%num1 == 0){
            System.out.println("One is multiple of another");
        }
        else{
            System.out.println("No both are not Multiple of another");
        }
    }
}
