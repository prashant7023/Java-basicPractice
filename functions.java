import java.util.*;

public class functions {


    // public static void printMyName(String name) {
    //     System.out.println(name);
    //     return;
    // }

    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.next();

    //     printMyName(name); //call the fuction
    // }


    


    // public static int calculateSum(int a, int b) {
    //     int sum = a + b;
    //     //System.out.println("Sum of 2 numbers : " +sum);
    //     return sum;
    // }

    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     int sum = calculateSum(a, b);
    //     System.out.println("Sum of 2 numbers : " +sum);
    // }




    // public static int calculateproduct(int a, int b) {
    //     return  a * b;
         
    // }

    // public static void main(String args[]) {
    //         Scanner sc = new Scanner(System.in);
    //         int a = sc.nextInt();
    //         int b = sc.nextInt();

    //         int product = calculateproduct(a, b);
    //         System.out.println("product of 2 numbers : " + calculateproduct(a, b));
    // }



    public static void printFactorial(int n) { //for void function return is not necessery
        //loop
        if(n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for(int i=n; i>=1; i--) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);
    }


}