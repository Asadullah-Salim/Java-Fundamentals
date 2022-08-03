import java.util.Scanner;

public class MultipleChoice {
    public static void main(String[] args) {
        String question = "What is the largest planet in our Solar System?";
        String ChoiceOne = "Saturn";
        String ChoiceTwo = "Jupiter";
        String ChoiceThree = "Earth";

        String correctAnswer = ChoiceTwo;

        System.out.println(question);
        System.out.println("Choose one of the following: "+ChoiceOne+","+ChoiceTwo+" or "+ChoiceThree);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (correctAnswer.equals(input)){
            System.out.println("Correct! That's The Correct Answer");
        }else {
            System.out.println("You are InCorrect! The Correct Answer is "+ correctAnswer);
        }
    }
}
