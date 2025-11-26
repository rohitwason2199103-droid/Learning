package org.example;

public class FunctionWithReturnType {
    public static int Sum(int A, int B){
        return A+B;
    }

    public static void main(String[] args){
        int Total =Sum(10,15);
        System.out.println(Total);
    }
}
