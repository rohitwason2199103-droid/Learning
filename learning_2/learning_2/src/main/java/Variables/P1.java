package main.java.Variables;

import java.io.*;
public class P1 {
   static int x = 110; // If variable not in main class then mark as static

    public static void main(String[] args)
    {
        // x is a local variable

     //   int x = 10;
        // message is also a local variable

        String message = "Hello, world!";
        System.out.println("x = " + x);
        System.out.println("message = " + message);
        System.out.println("message = " + message);

        if (x > 50) {
            // result is a local variable
            String result = "x is greater than 5";
            System.out.println(result);
        }
        for (int i = 0; i < 3; i++) {
            String loopMessage = "Iteration " + i; // loopMessage is a local variable
            System.out.println(loopMessage);
        }

    }
}