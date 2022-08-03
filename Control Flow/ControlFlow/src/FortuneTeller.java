import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 to 10");
        Scanner input = new Scanner(System.in);
        int inputtednum = input.nextInt();

        if (inputtednum<5){
            System.out.println("Enjoy The GoodLuck Friends Brings To You");
        }else {
            System.out.println("Your Shoe Selection Will Make you happy Today");
        }
    }
}
