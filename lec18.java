public class lec18 {
    public static void main (String[] args){
        Student s = new Student();
        s.name = "John";
        s.age = 20; 
        System.out.println();
        
    }
}
class Student  {
    String name;
    int age;
    @Override 
    public String toString() {
        return ( name + ", " + age );
    }
}
