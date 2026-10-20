//final keyword
public class lec15part2 {
    public static void main(String[] args) {
        Random r1 = new Random();
        System.out.println(r1.PI);
     //METHOD 3
    //  final int x;
    //  x = 5;
//     //  System.out.println(x);
// java allows us an optimixzation because first time we need to initialize its value and after that we can not change its value. so we can use final keyword with variable, method and class. final variable is a constant variable whose value cannot be changed once it is assigned. final method cannot be overridden by subclasses. final class cannot be extended or inherited by other classes. final keyword is used to enforce immutability and prevent modification of variables, methods, and classes in Java.
//theoritically it is incorrect but practically it is correct. final keyword ka jo variable hoga uska value change nhi hoga. final key word ka use variable, method, class ke sath kiya ja skta h. final variable ka value change nhi hoga. final method ko override nhi kiya ja skta. final class ko inherit nhi kiya ja skta.}

}
}

class Random{
    
    // double pi ;
    // Random (double pi){
    //     this.pi = pi;
    //METHOD 1  
    final double PI = 3.14;
   //METHOD 2
//    final double PI;
//    Random(){
//     this.PI = 3.14;
//    }
    //final key word is used to declare a constant variable whose value cannot be changed once it is assigned. In this case, the variable PI is declared as final and assigned a value of 3.14. This means that the value of PI cannot be modified later in the program.
//final key word ka jo variable hoga uska value change nhi hoga. final key word ka use variable, method, class ke sath kiya ja skta h. final variable ka value change nhi hoga. final method ko override nhi kiya ja skta. final class ko inherit nhi kiya ja skta.
//final keyword has its naming convention in Java. It is a good practice to use uppercase letters for final variables to indicate that they are constants. This helps to distinguish them from regular variables and makes the code more readable. For example, in the code above, the final variable PI is written in uppercase letters to indicate that it is a constant value.
//always uppercase letters for variable after writting final keyword.
//final is used to make a variable constant, a method cannot be overridden, and a class cannot be inherited. Final variables are constants whose values cannot be changed once assigned. Final methods cannot be overridden by subclasses. Final classes cannot be extended or inherited by other classes. Final keyword is used to enforce immutability and prevent modification of variables, methods, and classes in Java.
//we can not change the value of a final variable once it is assigned. If we try to assign a new value to a final variable, we will get a compilation error. For example, if we try to assign a new value to the final variable PI in the code above, we will get an error saying "cannot assign a value to final variable PI". This is because final variables are meant to be constants and their values cannot be changed after they are assigned.
//we can use final with parameters of any function. If we declare a parameter as final, it means that the value of that parameter cannot be changed within the method. This can be useful to prevent accidental modification of the parameter value and to ensure that the method behaves as expected. For example, if we declare a parameter as final in a method, we cannot reassign a new value to that parameter within the method body. This can help to make the code more robust and less error-prone.
    }
