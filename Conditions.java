import java.util.*;

public class Conditions {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int button = sc.nextInt();

            // if(button == 1) {
            //     System.out.println-("Hello");
            // } else if(button ==2) {
            //     System.out.println("Nameste");
            // } else if(button ==3) {
            //     System.out.print("Bonjour");
            // } else {
            //     System.out.println("Invalid Button");
            // }
            
            switch(button) {
                case 1 : System.out.println("hello");
                break;
                case 2 : System.out.println("Nameste");
                break;
                case 3 : System.out.println("Bonjour");
                break;
                default : System.out.println("Invalid Button");
            }
        }
        
        }
        
    }