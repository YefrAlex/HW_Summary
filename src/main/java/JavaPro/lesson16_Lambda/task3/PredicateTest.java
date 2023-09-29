package JavaPro.lesson16_Lambda.task3;

import JavaPro.lesson16_Lambda.task1.Degree;
import JavaPro.lesson16_Lambda.task1.Student;
import JavaPro.lesson16_Lambda.task1.StudentUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {


            List<Student> students=new ArrayList<>();
            students.add(new Student("Дмитрий", 25, 3, 4.76, Degree.MASTER));
            students.add(new Student("Егор", 24, 1, 4.16, Degree.BACHELOR));
            students.add(new Student("Павел", 26, 4, 4.26, Degree.MASTER));
            students.add(new Student("Екатерина", 19, 2, 3.96, Degree.BACHELOR));
            students.add(new Student("Александр", 18, 5, 4.88, Degree.MASTER));
            students.add(new Student("Петр", 21, 1, 4.25, Degree.BACHELOR));
            students.add(new Student("Иван", 21, 4, 4.17, Degree.MASTER));
            students.add(new Student("Николай", 22, 3, 4.09, Degree.BACHELOR));
            students.add(new Student("Инокентий", 22, 3, 4.09, Degree.BACHELOR));
            Predicate<Student> predicate=x -> x.getName().startsWith("А");
            // StudentUtils.printFilteredStudents(students,predicate);
        }
    }


