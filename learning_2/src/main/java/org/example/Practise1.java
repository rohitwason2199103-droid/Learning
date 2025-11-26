package org.example;

public class Practise1 {
    static int n1 = 0, n2 = 1, n3, i, count = 10;


    public static void main(String[] args) {
        for (i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
        {
            System.out.println(n3);
            n3 = n1 + n2;
//            System.out.print(" " + n3);
//            n1 = n2;
//            n2 = n3;

          //  System.out.println(n1 + "" + n2);
        }
    }
}