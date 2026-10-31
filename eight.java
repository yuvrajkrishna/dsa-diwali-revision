import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        System.out.println("Enter the temperature");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if(temp >= 0 && temp < 16){
            System.out.println("Cold");
        }
        else if(temp >= 16 && temp < 26){
            System.out.println("Warm");
        }
        else{
            System.out.println("Hot");
        }
    }
}
