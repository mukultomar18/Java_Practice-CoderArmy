import college.Teacher;
// import school.Teacher; we cannot do this that we cannot import two files at a time so for that we simply write PACKAGENAME.CLASSNAME OBJ = NEW PACKAGENAME.CLASSNAME IN OUR MAIN FUNCTION
// // this will import that specific class from that if we want to access whole file then we need to write import college.*; this will import all the classes from that package
//import college.*; (this will import all the classes)
public class lec16part6 {
    public static void main(String[] args) {
        college.Teacher t= new college.Teacher(); //this will be written when more than one imports is  called
        // Teacher t = new Teacher(); this will be written when any single import is called
       t.mark();  
        school.Teacher t1= new school.Teacher();
        t1.mark();
    }
}
