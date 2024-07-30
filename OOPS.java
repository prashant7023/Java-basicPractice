// class Pen {
//     String colour;
//     String type; //ballpoint; gell

//     public void write() {
//         System.out.println("writing someting");
//     }

//     public void printColour() {
//         System.out.println(this.colour);
//     }
// }

class Student {
    String name;
    int age;

    public void  printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Student() {
    //     System.out.println("Constructor called");
    // }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class OOPS {
    public static void main(String args[]) {
        // Pen pen1 = new Pen();
        // pen1.colour = "blue";
        // pen1.type = "gell";

        // Pen pen2 = new Pen();
        // pen2.colour = "black";
        // pen2.type = "ballpoint";

        // pen1.printColour();
        // pen2.printColour();

        Student s1 = new Student("aman", 24);
        // s1.name = "prashant";
        // s1.age = 24;

        s1.printInfo();

    }
}