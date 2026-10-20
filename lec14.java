public class lec14 {
       public static void main(String[] args) {
        int x = 4;
        int y = 5;

        System.out.println(x + " , " + y);

        addTen(x, y);
        
        System.out.println(x + " , " + y);

    }

    static void addTen(int x, int y) {
        x = x + 10;
        y = y + 10;
    }
    // In the above code, we are passing the values of x and y to the addTen method. However, since Java is pass-by-value, the original values of x and y in the main method remain unchanged after the method call.
    //bro java is only acceting call by value no such concept of call by reference is not available in java it simply did call by value and we thought it s call by reference but it is not true no such concept of call by reference is present in java
    
}
