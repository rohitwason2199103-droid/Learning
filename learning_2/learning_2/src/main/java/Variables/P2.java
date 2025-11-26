package main.java.Variables;

public class P2 {
    static int x=10;
   static String message="Hello World";

   public static void main(String[] args){

       System.out.println(message+ " = " +x);
        if (x<5){
            System.out.println("x is less than 5");
    } else if (x == 5) {
            System.out.println("x is equal to 5");
        }
        else {
            System.out.println("x is greater than 5");

        }
       for (int i=0; i<=5;i++){
           String loopMessage = "Iteration " + i; // loopMessage is a local variable

           System.out.println(loopMessage);
           System.out.println(loopMessage);
}}}
