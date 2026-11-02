import java.util.Scanner;

public class twentynine {
    public static void main(String[] args) {
        System.out.println("Enter angle of side 1");
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        System.out.println("Enter angle of side 2");
        int angle2 = sc.nextInt();
        System.out.println(180 - angle1 - angle2);
    }
}
