//ENCAPSULATION
//encapsulation means wrapping up of data and code into a single unit. It is a mechanism that binds together code and the data it manipulates, and keeps both safe from outside interference and misuse.
//encapsulation says both data and methods should be wrapped together in a single unit. It is a mechanism that binds together code and the data it manipulates, and keeps both safe from outside interference and misuse. In encapsulation, the variables or data of a class are hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.
//encapsulation says we shouldnot provide unrestricted access to class members. It is a protective shield that prevents the data from being accessed by the code outside this shield. To achieve encapsulation in Java −

    //1. Declare the variables of a class as private.
    //2. Provide public setter and getter methods to modify and view the variables values.
//a package groups related classes and interfaces together. Packages are used to avoid name conflicts and to control access to classes, interfaces, and sub-packages. They also make it easier to locate and use the classes, interfaces, enumerations, and annotations. In Java, packages are defined using the package keyword followed by the package name. For example, java.util is a package that contains utility classes such as ArrayList, HashMap, and Date.
//access modifiers in Java are keywords that set the accessibility (visibility) of classes, methods, and other members. The four access modifiers in Java are public, protected, default (no modifier), and private. They determine which other classes can access a particular class or member. Public members are accessible from any other class, protected members are accessible within the same package and subclasses, default members are accessible only within the same package, and private members are accessible only within the same class.
//private access modifier is used to restrict access to class members. When a member is declared as private, it can only be accessed within the same class. This is a key aspect of encapsulation, as it allows the class to control how its data is accessed and modified, preventing unintended interference from outside classes.
//default access modifier (also known as package-private) is used when no access modifier is specified. Members with default access are accessible only within the same package. This means that classes in the same package can access each other's default members, but classes in different packages cannot. This level of access control helps to organize code and maintain encapsulation while allowing for collaboration between related classes within the same package.
//protected access modifier is used to allow access to class members from subclasses and classes within the same package. When a member is declared as protected, it can be accessed by any subclass (even if it's in a different package) and by any class in the same package. This provides a balance between encapsulation and inheritance, allowing subclasses to utilize and extend the functionality of their parent classes while still restricting access from unrelated classes.
 public class lec16{
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(500);
        ba.withdraw(300);

        System.out.println(ba.getBalance());
    }
}

class BankAccount {
    private double balance;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        // amount <= balance
        balance -= amount;
    }

    // getters / Setters
    public double getBalance() {
        return balance;
    }
}

class Student {
    private String name;
    private int rollNumber;
    private int age;
    private String college;

    Student(String name, int rollNumber, int age, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        // Validations --> college should be real.
        this.college = college;
    }
}