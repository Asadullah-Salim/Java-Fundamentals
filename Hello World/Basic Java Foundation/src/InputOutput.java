import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        int studentAge = 20;
        double studentGPA = 3.15;
        String studentFirstName = "Asadullah";
        String studentLastName = "Salim";

        System.out.println(studentFirstName +" "+ studentLastName +" has a GPA of "+ studentGPA );
        System.out.println("What do you want to update it to ?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName +" "+ studentLastName +" now has a GPA of "+ studentGPA );
    }
}
