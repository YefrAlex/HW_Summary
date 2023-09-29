package JavaPro.lesson16_Lambda.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Дмитрий", 25, 3, 4.76, Degree.MASTER));
        students.add(new Student("Егор", 24, 1, 4.16, Degree.BACHELOR));
        students.add(new Student("Павел", 26, 4, 4.26, Degree.MASTER));
        students.add(new Student("Екатерина", 19, 2, 3.96, Degree.BACHELOR));
        students.add(new Student("Александр", 18, 5, 4.88, Degree.MASTER));
        students.add(new Student("Петр", 21, 1, 4.25, Degree.BACHELOR));
        students.add(new Student("Иван", 21, 4, 4.17, Degree.MASTER));
        students.add(new Student("Николай", 22, 3, 4.09, Degree.BACHELOR));
        students.add(new Student("Инокентий", 22, 3, 4.09, Degree.BACHELOR));

        System.out.println("Список всех студентов");
        for (Student student : students){
            System.out.println(student);
        }
        System.out.println();
        System.out.println("средний бал больше 4 и степень магистр");
        StudentUtils.printFilteredStudents(students,new FilterByRateAndDegree());

        System.out.println("возраст меньше 25  и степень бакалавр");
        StudentUtils.printFilteredStudents(students, new FilterByAgeAndDegree());

        System.out.println("Имя начинается на А и средний бал < 4.5");
        System.out.println("используем анонимный класс");

        StudentUtils.printFilteredStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return (student.getName().startsWith("А") && student.getAverageRate()>4.5);
            }
        });

        System.out.println("Фильтр до 2, включительно, средний бал > 4");
        System.out.println("используем анонимный класс");

        StudentUtils.printFilteredStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getCourse()<=2 && student.getAverageRate()>4;
            }
        });

        System.out.println("Фильтр имя 6 букв или длиннее, содержит букву И");
        System.out.println("Используем лямбда выражение");

        StudentUtils.printFilteredStudents(students, x-> x.getName().length() >= 6 && x.getName().toLowerCase().contains("и"));

        System.out.println("Фильтр курс не четный, возраст четный");
        System.out.println("Используем лямбда выражение");
        StudentUtils.printFilteredStudents(students, x-> x.getCourse()%2 !=0 && x.getAge()%2==0);

        System.out.println("Фильтр бакалавр, содержит букву п");
        System.out.println("Используем лямбда выражение");

        Filter filter = x-> x.getDegree().equals(Degree.BACHELOR) && x.getName().toLowerCase().contains("п");

        StudentUtils.printFilteredStudents(students,filter);



    }
}
