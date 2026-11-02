import java.util.Scanner;
public class twentyfour {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter  Number");
        int n = sc.nextInt();
        int size = (int) Math.log10(n)+1;
        if(size == 1){
            System.out.println("Single Digit");
        }
        else if (size == 2){
            System.out.println("Double Digit");
        }
        else {
            System.out.println("Multi Digit");
        }
    }

}
