package org.example;

public class Variables {
    static String testing;// Define String Variable
    static int B; // Define int Variable
    static int a =10;
    static int b=20;
    static int c=30;


    // Creating a function

    public static void setUp() {
        testing = "Manual"; // Initialize Variable
        B = 10; // Initialize Variable

        //    Diff between else & else if
        if (a>b){
            System.out.println(B+testing);
    } else if (b>a) {
            System.out.println(B);
        }
        if(a>c) {
            System.out.println(B);
        } else {
            System.out.println(B);
        }

    }
    // Function with local variables

    public static void setdown(int day) {
        day =1;

        switch (day){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");

        }
    }

public static String func(String Mon,String Day){
//return "MonDay";
return Mon+Day;
    }

    public static void main(String[] args){
      //  setdown(1);
/*        String result = func("January", "Funday");
        System.out.println(result);
        */
 /*
        int Total=Sum(10,15);
        System.out.println(Total);

  */
        Sum1(10,15);
    }

public static int Sum(int A,int B){
        return A-B;
}
public static void Sum1(int A,int B){
   int total=A+B;
    System.out.println(total);
}

}