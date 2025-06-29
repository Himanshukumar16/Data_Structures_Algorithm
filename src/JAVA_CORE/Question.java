package JAVA_CORE;
public class Question {
    private String num ;
    private String question ;
    private String opt_1;
    private String opt_2;
    private String opt_3;
    private String opt_4;
    private String correct;

    public Question(String num ,String question , String opt_1, String opt_2, String opt_3, String opt_4, String correct){
        this.num = num;
        this.question = question;
        this.opt_1 = opt_1;
        this.opt_2 = opt_2;
        this.opt_3 = opt_3;
        this.opt_4 = opt_4;
        this.correct = correct;
    }

    public String getNum() {
        return num;
    }

    public String getQuestion() {
        return question;
    }

    public String getOpt_1() {
        return opt_1;
    }

    public String getOpt_2() {
        return opt_2;
    }

    public String getOpt_3() {
        return opt_3;
    }

    public String getOpt_4() {
        return opt_4;
    }

    public String getCorrect() {
        return correct;
    }
}
