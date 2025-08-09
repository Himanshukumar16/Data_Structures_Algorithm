package JAVA_PRACTICE_PROJECT_1;

import javax.swing.*;

public class Project_1 {
    public static void main(String[] args) {

        QuestionService Qs = new QuestionService();
//        Qs.showQuestion();
//        Qs.finalScore();

        JFrame frame = new JFrame();
        frame.setTitle("Weekly Quiz");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.setVisible(true);
    }
}
