//WHY DO WEUSE STRING ARGS[] IN JAVA?
//The main method in Java is defined as public static void main(String[] args). The String args[] parameter is used to pass command-line arguments to the program. When you run a Java program from the command line, you can provide additional information or input to the program by specifying arguments after the class name. These arguments are passed as an array of strings (String[] args) to the main method, allowing the program to access and process them as needed. This feature enables users to customize the behavior of the program without modifying its source code.
public class lec15part3 {
    public static void main(String[] args) {
        System.out.println("Number of arguments passed: " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i  + ": " + args[i]);
        }
    }
}
