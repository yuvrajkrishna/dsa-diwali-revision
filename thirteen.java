import java.util.Scanner;
public class thirteen {
    public static void main(String[] args) {
        System.out.println("Enter Marks");
        Scanner sc = new Scanner (System.in);
        int marks = sc.nextInt();
        if(marks <= 100 && marks >80){
            System.out.println("A");
        }
        else if(marks > 80 && marks <= 100){
            System.out.println("B");
        }
        else if(marks > 60 && marks <= 80){
            System.out.println("C");
        }
        else if(marks > 40 && marks <= 60){
            System.out.println("D");
        }
        else {
            System.out.println("E");
        }
    }
}
