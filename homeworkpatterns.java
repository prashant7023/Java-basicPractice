import java.util.*;


public class homeworkpatterns {

    public static void main(String args[]) {

//         // SOLID RHOMBUS
//         int n = 5;
//
//         //outer loop
//         for(int i=1; i<=n; i++) {
//             //spaces
//             for(int j=1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }
//             //stars
//             for(int j=1; j<=n; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }





        // int n = 5;
        
        // for(int i=1; i<=n; i++) {
        //     //spaces
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     //numbers
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }




//         //IMPORTANT - PELLENDROM
         int n = 5;

         //outer loop
         for(int i=1; i<=n; i++) {
             //spaces
             for(int j=1; j<=n-i; j++) {
                 System.out.print(" ");
             }
             //first part
             for(int j=i; j>=1; j--) {
                 System.out.print(j);
             }
             //second part
             for(int j=2; j<=i; j++) {
                 System.out.print(j);
             }
             System.out.println();
         }



//         //BUTTERFLY
//         int n = 5;
//
//         //UPPER PART
//         for(int i=1; i<=n; i++) {
//             //1ST PART
//             for (int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//
//             //spaces
//             int spaces = 2*(n-i);
//             for(int j=1; j<=spaces; j++) {
//                 System.out.print(" ");
//             }
//
//             //2ND PART
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//
//         //LOWER PART
//
//         for(int i=n; i>=1; i--) {
//             //1ST PART
//             for (int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//
//             //spaces
//             int spaces = 2*(n-i);
//             for(int j=1; j<=spaces; j++) {
//                 System.out.print(" ");
//             }
//
//             //2ND PART
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }




//        //DIAMOND
//        int n = 4;
//
//        for(int i=1; i<=n; i++) {
//            //spaces
//            for(int j=1; j<=n-i; j++) {
//                System.out.print("  ");
//            }
//            //stars
//            int stars = 2*i - 1;
//            for(int j=1; j<=stars; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//
//        //lower part
//        for(int i=n; i>=1; i--) {
//            //spaces
//            for(int j=1; j<=n-i; j++) {
//                System.out.print("  ");
//            }
//            //stars
//            int stars = 2*i - 1;
//            for(int j=1; j<=stars; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }





    }
}