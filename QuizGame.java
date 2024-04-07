import java.util.Scanner;
 
public class QuizGame {
    public static void main(String ar[]) {
        Scanner s= new Scanner(System.in);
        int score = 0;
 
        String[] questions = {
            "Which country won the FIFA World Cup in 2022?",
            "Who painted the Mona Lisa?",
            "Who created Bitcoin?"
        };
        String[] options = {
            "a) Argentina\tb) France\tc) Brazil",
            "a) Michelangelo\tb) Leonardo da Vinci\tc) Pablo Picasso",
            "a) Satoshi Nakamoto\tb) David Chaum\tc) Changpeng Zhao"
        };
        String[] answers = {"a", "b", "a"};
 
        System.out.println("Answer the following questions:");
 
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
            System.out.println("Options: " + options[i]);
            System.out.print("Your answer: ");
            String userAnswer = s.nextLine().toLowerCase();
 
            if (userAnswer.equals(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + answers[i]);
            }
        }
 
        System.out.println("\nQuiz completed! Your final score: "
                             + score + " out of " + questions.length);
        s.close();
    }
}