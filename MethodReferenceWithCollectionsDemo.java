import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class StudentAge {
    int age;
    
    StudentAge(int age) {
    
        this.age = age;
    
    } // end StudentAge constructor -- int

} // end StudentAge class

class StudentAgeComparator {

    static int compareAge(StudentAge sa1, StudentAge sa2) {
        return sa1.age - sa2.age;
    } // end compareAge method

} // end StudentAgeComparator class

class MethodReferenceWithCollectionsDemo {

    public static void main(String[] args) {
    
        ArrayList<StudentAge> studentAgesList = 
                new ArrayList<>(Arrays.asList(new StudentAge(19), 
                                              new StudentAge(20), 
                                              new StudentAge(18)));
                                          
        StudentAge maxAge = Collections.<StudentAge>max(
                studentAgesList, StudentAgeComparator::compareAge);  
                
        System.out.printf("The maximum age is %d\n", maxAge.age);                                        
    
    } // end main method

} // end MethodReferenceWithCollectionsDemo class
