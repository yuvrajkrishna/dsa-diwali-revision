import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        System.out.println("Enter input");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("It is uppercase");
        }
        else if(ch >= 'a' && ch <= 'z'){
            System.out.println("It is lowercase");
        }
        else if(ch >= '0' && ch <= '9'){
            System.out.println("It is digit");
        }
        else {
            System.out.println("It is special digit");
        }
    }
}
