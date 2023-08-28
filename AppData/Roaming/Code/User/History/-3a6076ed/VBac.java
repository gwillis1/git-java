import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class testQuiz 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        try (Scanner scanner = new Scanner(System.in)) {
            int testing = 1;

            //open the input files
            Scanner inputFile = new Scanner(new File("Quiz.txt"));

            System.out.println("\n\n");
            System.out.println("QUESTIONS (enter 'QUIT' at any time to leave the quiz.)");
            System.out.println("---------\n");

            //skip first line
            inputFile.nextLine();

            //loops to ask quiz questions and give user feedback
            while(inputFile.hasNextLine() && (testing == 1))
            {
                //logic to select random questions
                Random rand = new Random();
                int questionNum = rand.nextInt(19); //get a random value between (0-9)

                while ((questionNum % 2) != 0)  //filter out odd values
                {
                    questionNum = rand.nextInt(19); //2n-1 for 25 questions, bound=49 MODIFY LINE 28
                }
                //int choicesNum = questionNum + 1;

                for (int i=0; i < questionNum; i++)
                {
                    inputFile.nextLine();
                }

                //logic to display questions/ answers ---- NEED 25 QUESTIONS
                String answer = inputFile.next();
                String question = inputFile.nextLine().trim();
                String choices = inputFile.nextLine();

                System.out.println(question);
                System.out.println(choices + "\n");

                String answerGuess = scanner.next();

                if (answerGuess.equalsIgnoreCase(answer))
                {
                    System.out.println("Correct!\n");
                }
                else if (answerGuess.equalsIgnoreCase("quit"))
                {
                    System.out.println("ENDED QUIZ");
                    testing = 0;
                }
                else if (answerGuess != answer) 
                {
                    System.out.println("The correct answer is " + answer.toUpperCase() + ".\n");
                }

                inputFile.close();
                inputFile = new Scanner(new File("Quiz.txt"));
                inputFile.nextLine();
            }
        }
    }
}
        /*
        Scanner scanner = new Scanner(System.in);

        //Questions Array
        String[] questions = {"Question 1?\n A: choice 1\t B: choice 2\t C: choice 3\t", 
                            "Question 2?\n A: choice 1\t B: choice 2\t C: choice 3\t", 
                            "Question 3?\n A: choice 1\t B: choice 2\t C: choice 3\t", 
                            "Question 4?\n A: choice 1\t B: choice 2\t C: choice 3\t", 
                            "Question 5?\n A: choice 1\t B: choice 2\t C: choice 3\t"};
        
        //Quiz Logic
        for (int i = 0; i < questions.length;) 
        {
            System.out.println(questions[i]);
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("A"))
            {
                System.out.println("Correct!\n");
                i++;
            }
            else if (answer.equalsIgnoreCase("B"))
            {
                System.out.println("Try again.\n");
            }
            else if (answer.equalsIgnoreCase("C"))
            {
                System.out.println("Try again.\n");
            }
            else if (answer.equalsIgnoreCase("D"))
            {
                System.out.println("Try again.\n");
            }
            else
            {
                System.out.println("Enter a valid answer choice.\n");
            }

        }
    }
}
*/

    /*
    System.out.println("Question 1: " + "Insert Question");
    System.out.println("A. " + "Insert Answer   " + "B. " + "Insert Answer   " +"C. " + "Insert Answer   " + "D. " + "Insert Answer\n");
    String answer = scanner.next();

    if (answer.equalsIgnoreCase("A"))
    {
        System.out.println("Correct!");
    }
    else if (answer.equalsIgnoreCase("B"))
    {
        System.out.println("Try again.");
    }
    else if (answer.equalsIgnoreCase("C"))
    {
        System.out.println("Try again.");
    }
    else if (answer.equalsIgnoreCase("D"))
    {
        System.out.println("Try again.");
    }
    else
    {
        System.out.println("Enter a valid answer choice.");
    }
    



    switch(answer)
    {
        case "A": 
            System.out.println("Correct!");
            break;
        case "B": 
            System.out.println("Try again.");
            break;
        case "C": 
            System.out.println("Try again.");
            break;
        case "D": 
            System.out.println("Try again.");
            break;
        default:
            System.out.println("Enter a valid answer choice.");
        
        //If correct, ask next question, if incorrect ask same question.
    }

    System.out.println("Question 2: " + "Insert Question");
    System.out.println("A. " + "Insert Answer   " + "B. " + "Insert Answer   " +"C. " + "Insert Answer   " + "D. " + "Insert Answer\n");

    System.out.println("Question 3: " + "Insert Question");
    System.out.println("A. " + "Insert Answer   " + "B. " + "Insert Answer   " +"C. " + "Insert Answer   " + "D. " + "Insert Answer\n");

    System.out.println("Question 4: " + "Insert Question");
    System.out.println("A. " + "Insert Answer   " + "B. " + "Insert Answer   " +"C. " + "Insert Answer   " + "D. " + "Insert Answer\n");

    System.out.println("Question 5: " + "Insert Question");
    System.out.println("A. " + "Insert Answer   " + "B. " + "Insert Answer   " +"C. " + "Insert Answer   " + "D. " + "Insert Answer");
    }
}
*/