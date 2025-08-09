package JAVA_PRACTICE_PROJECT_1;
import javax.swing.*;
import java.util.*;
public class QuestionService extends JFrame {

    Question[] q = new Question[5];
    String[] ans = new String[5];
    int score = 0;

    JLabel frame = new JLabel();



    public QuestionService() {

        q[0] = new Question("Q1)."," Which component is used to compile, debug and execute the java programs?","1. JRE",
                "2. JIT","3. JDK","4. JVM","3");

        q[1] = new Question("Q2)."," Which of these cannot be used for a variable name in Java?","1. identifier & keyword",
                "2. identifier","3. keyword","4. none of the mentioned","3");

        q[2] = new Question("Q3)."," Which of the following is not an OOPS concept in Java?","1. Polymorphism",
                "2. Inheritance","3. Encapsulation","4. Compilation","4");

        q[3] = new Question("Q4)."," Which of the following is a type of polymorphism in Java Programming?","1. Multiple polymorphism",
                "2. Compile time polymorphism","3. Multilevel polymorphism","4. Execution time polymorphism","2");

        q[4] = new Question("Q5)."," Which statement is true about Java?","1. Java is a sequence-dependent programming language",
                "2. Java is a code dependent programming language","3. Java is a platform-dependent programming language","4. Java is a platform-independent programming language","4");

    }

    public void showQuestion(){

        for(int i = 0; i < q.length; i++){

            System.out.print(q[i].getNum()+" ");
            System.out.println(q[i].getQuestion());
            System.out.println(q[i].getOpt_1());
            System.out.println(q[i].getOpt_2());
            System.out.println(q[i].getOpt_3());
            System.out.println(q[i].getOpt_4());
            System.out.println();

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice : ");
            ans[i] = sc.nextLine();

            if((q[i].getCorrect()).equals(ans[i])){

                System.out.println("Answer is correct!");
                score += 1;

            }
            else {

                System.out.println("you select wrong answer! Better luck next time.");

            }
        }
    }

    public void finalScore(){
        System.out.println("Your Score Is : "+score+" out of 5.");
        System.out.println("Thank You");
    }
}
