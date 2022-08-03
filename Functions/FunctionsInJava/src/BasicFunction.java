import java.util.Scanner;

public class BasicFunction {
    public static void callingTeaTime(){
        System.out.println("Waiting for Develop Tea Time...");
        System.out.println("Type any word to Start a Tea Time ;)");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("Enjoy Tea Time ...");
    }
    public static void main(String[] args) {
        callingTeaTime();
    }
}
