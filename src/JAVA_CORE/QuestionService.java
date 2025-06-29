package JAVA_CORE;
import java.util.*;
public class QuestionService {

    Question[] q = new Question[5];
    String[] ans = new String[5];
    int score = 0;

    public QuestionService() {

        q[0] = new Question("Q1)."," Which component is used to compile, debug and execute the java programs?","1. JRE",
                "2. JIT","3. JDK","4. JVM","3");

        q[1] = new Question("Q2)."," Which of these cannot be used for a variable name in Java?","1. identifier & keyword",
                "2. identifier","3. keyword","4. none of the mentioned","3");

        q[2] = new Question("Q3)."," abcd find next","1. e",
                "2. f","3. g","4. h","1");

        q[3] = new Question("Q4)."," abcd find next","1. e",
                "2. f","3. g","4. h","1");

        q[4] = new Question("Q5)."," abcd find next","1. e",
                "2. f","3. g","4. h","1");

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
