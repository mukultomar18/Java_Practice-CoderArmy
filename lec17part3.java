public class lec17part3 {
     public static void main(String[] args) {
        A a = new B();
        //a.fun();
        //System.out.println(a.x);  THIS CALL WILL PRINT THE VALUE OF X WHIC IS PRESENT AT INITIAL STAGE BECAUSE VARIABLES DO NOT PARTICIPATE IN POLYMORPHISM.
        //HERE Aa refer to its reference variable of A class an simply prints the value of the A.
        //if we wants to print the second value then we need to create 2 functions namely getX() in both classes and return their value this will override the value of the variable
        System.out.println(a.getX());//this will print the second value that is 20.
    }
}

//Static --> they belong to class and not to objects
// private methods cant be overriden 
// final methods cannot be overriden

// Final --> class ??? --> you cannot create child of that class

// Fields / Varables they cannot be polymorphic

// class A {
//     static void fun() {
//         System.out.println("Hello");
//     }

//     private void fun2() {
//         System.out.println("Hello");
//     }

//     final void fun3() {
//         System.out.println("Hello");
//     }
// }

// class B extends A {
//     static void fun() {
//         System.out.println("Bye");
//     }

//     // void fun3() {
//     //     System.out.println("Bye");
//     // }

// }

class A {
    //int x = 10;

    int getX() {
        return 10;
    }
}

class B extends A {
    int getX() {
        return 20;
    }
}
