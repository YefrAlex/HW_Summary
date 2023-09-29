package JavaPro.lesson16_Lambda.task1;

import JavaPro.lesson16_Lambda.task3.PredicateTest;

import java.util.List;

public class StudentUtils {
    public static void printFilteredStudents(List<Student> students, Filter filter){
        for (Student student : students){
            if (filter.test(student)){
                System.out.println(student);
            }
        }
    }

}
