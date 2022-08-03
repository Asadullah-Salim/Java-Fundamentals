import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        while (isOnRepeat){
            System.out.println("Current Song Is Playing");

            System.out.println("Would you like to take is song off repeat?If so, answer yes");
            String answer = input.next();

            if (answer.equals("yes")){
                isOnRepeat = false;
            }
        }
        System.out.println("Switching To Next Song");


    }
}
