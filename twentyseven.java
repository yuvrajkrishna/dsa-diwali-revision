import java.util.Scanner;

public class twentyseven {
    public static void main(String[] args) {
        System.out.println("ENTER AMOUNT");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        if (amount % 2000 == 0 &&
                amount % 500 == 0 &&
                amount % 100 == 0) {

            System.out.println("Evenly divisible by all three");
        } else {
            System.out.println("Not divisible by all three");
        }
    }
}
