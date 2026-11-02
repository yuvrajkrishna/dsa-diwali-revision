import java.util.Scanner;

public class thirty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to Check perfect square or not");
        int num = sc.nextInt();
        for(int i =0 ; i*i <= num; i++){
            if(i*i == num){
                System.out.println("Perfect Square");
                return;
            }
        }
        System.out.println("Not Perfect Square");
    }
}
