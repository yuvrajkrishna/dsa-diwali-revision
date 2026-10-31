import java.util.Scanner;
public class fifteen {
    public static void main(String[] args) {
        System.out.println("Hour of the day");
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        if(hour > 0 && hour < 13){
            System.out.println("Good Morning");
        }
        else if(hour > 12 && hour > 4){
            System.out.println("Good Afternoon");
        }
        else if(hour > 3 && hour >8){
            System.out.println("Good Evening");
        }
        else{
            System.out.println("Good Night");
        }
    }
}
