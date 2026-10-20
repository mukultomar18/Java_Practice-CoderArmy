//static keywords
public class lec15 {
    public static void main(String[] args) {

        Student s1 = new Student("Mukul", 21, 101);
        Student s2 = new Student("Rohit", 22, 102);

        //Student.college = "ORiental College";

        System.out.println(s1.name + " , " + s1.age + " , " + s1.rollno + " , " + Student.college);
        System.out.println(s2.name + " , " + s2.age + " , " + s2.rollno + " , " + Student.college);
    }
}

class Student {
    String name;
    int age;
    int rollno;
    static String college;

    Student(String name, int age, int rollno) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }
    //static block
    //static blocks are used to initialize static variables. It is executed before the main method at the time of class loading.

    static {
        college = "ORiental College";
    }
}
//static can be used with variables, methods, blocks and nested classes. Static variables are shared among all instances of a class. Static methods can be called without creating an instance of the class. Static blocks are used for static variable initialization. Static nested classes can access all static members of the outer class.
//static can be methods , variables but not any  parameter of the method. Static methods can only access static variables and static methods of the class. Static methods cannot access instance variables or instance methods directly. Static methods can be called using the class name without creating an object of the class.
//parameters are always local to the method and cannot be declared as static. Static methods cannot use the 'this' keyword because they are not associated with any instance of the class. Static methods can be overloaded but not overridden.
//any class can not be static but inner class can be static. Static nested classes can access all static members of the outer class. Static nested classes cannot access instance members of the outer class directly. Static nested classes can be instantiated without an instance of the outer class.
//class is a part of a package and can be public or default. A class cannot be declared as static. However, a nested class (a class defined within another class) can be declared as static. A static nested class does not have access to instance variables and methods of the outer class. It can only access static members of the outer class. 
//WHY PUBLIC STATIC VOID MAIN IS USED IN JAVA?
//public: The main method must be public so that it can be accessed by the Java Virtual Machine (JVM) from outside the class. If it were not public, the JVM would not be able to invoke it, and the program would not run.
//static: The main method must be static so that it can be called without creating an instance
//WHY MAIN IS STATIC?
//The main method is static because it serves as the entry point of the program and needs to be called by the JVM without creating an instance of the class. Since the main method is static, it can be invoked directly using the class name, allowing the program to start executing without requiring an object of the class to be created first. This is essential for the program's execution flow, as it allows the JVM to initiate the program without any dependencies on object instantiation.
//KYUKI VOH KHUD SE OBJ CCREATE NHI  KR SKTA ISLIYE USNE USSEY STATIC BANA DIYA .