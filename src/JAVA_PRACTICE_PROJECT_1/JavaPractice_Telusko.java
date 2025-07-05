// Just For Practice Java Core Coding - Telusko...
package JAVA_PRACTICE_PROJECT_1;

import java.util.Scanner;

public class JavaPractice_Telusko {
    Scanner sc = new Scanner(System.in);
//    public static void main(String[] args) {

////        Abstract Keyword.

//        demo d = new Secondemo();
//        d.one();
//        d.two();
//    }
//}
//abstract class demo{
//    public abstract void one();
//    public void two(){
//        System.out.println("In Two !");
//    }
//}
//class Secondemo extends demo{
//    public void one() {
//        System.out.println("in one !");
//    }
//}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

//    Inner Class .

//    public static void main(String[] args) {
//        A aref = new A();
//        aref.show();
//        System.out.println(aref.n);
//        A.B bref = aref.new B();
//        bref.detail();
//    }
//}
//class A{
//    int n = 5;
//    public void show(){
//        System.out.println("in a show .");
//    }
//    class B{
//        public void detail(){
//            System.out.println("in Detail .");
//        }
//    }
//}
//--------------------------------------------------------------------------------------
//    // Anonymous Inner Class.
//    public static void main(String[] args) {
//        A obj = new A(){
//            public void show(){
//                System.out.println("In Show 2.");
//            }
//        };
//        obj . show();
//
//    }
//}
//class A{
//    public void show(){
//        System.out.println("in Show");
//    }
//}
//
//---------------------------------------------------------------------------------

////InterFace
//    public static void main(String[] args) {
//        A obj = new D();
//        A obj2 = new B();
//        C obj3 = new C();
//        obj3.show(obj2);
//        obj3.show(obj);
//    }
//}
//interface A{
//    void show();
//}
//class B implements A{
//    @Override
//    public void show() {
//        System.out.println("IN SHOW !");
//    }
//}
//class D implements A{
//    @Override
//    public void show() {
//        System.out.println("IN SHOW 2!");
//    }
//}
//class C{
//    public void show(A alpha) {
//        alpha.show();
//    }
//}
//-----------------------------------------------------------------------------------
//    Enums...
//    public static void main(String[] args) {
//        Names name = Names.Himanshu;
//        System.out.println(name.getMarks());
//        name.setMarks(500);
//        System.out.println(name.getMarks());
//
//    }
//}
//enum Names{
//    Himanshu(400),Chootu(200),Anurag(500),Ritika(300);
//    private int marks;
//    private Names(int marks){
//        this.marks = marks;
//    }
//    public int getMarks() {
//        return marks;
//    }
//    public void setMarks(int marks) {
//        this.marks = marks;
//    }
//}
//-----------------------------------------------------------------------------------

//    problem solution:

//    public static void main(String[] args) {
//        Machine fan = new Fan("Fan");
//        Machine washer = new WashingMachine("Washing Machine");
//        System.out.println(fan.start());
//        System.out.println(washer.start());
//    }
//}
//interface Machine{
//    public String start();
//}
//
//abstract class Appliance implements Machine{
//    String name;
//
//    public Appliance(String name){
//        this.name = name;
//    }
//}
//class Fan extends Appliance{
//
//    public Fan(String name) {
//        super(name);
//    }
//
//    @Override
//    public String start() {
//        return "Fan is running";
//    }
//}
//class WashingMachine extends Appliance{
//
//    public WashingMachine(String name) {
//        super(name);
//    }
//
//    @Override
//    public String start() {
//        return "Washing Machine is operating";
//    }
    public static void main(String[] args) {

    }
}