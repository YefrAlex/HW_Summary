package JavaPro.lesson19_stream2.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student>students = new ArrayList<>();
        Student student1 = new Student (1,"Rob");
        Student student2 = new Student (2,"Anna");
        Student student3 = new Student (3,"Nei");

        student1.addBook("Java basic");
        student1.addBook("Java pro");
        student1.addBook("Java Spring");
        student1.addBook("Spring boot");
        student1.addBook("Coffe java");

        student2.addBook("HTML");
        student2.addBook("Pyton");
        student2.addBook("Java Spring");
        student2.addBook("JavaScript");

        student3.addBook("Pyton");
        student3.addBook("C#");
        student3.addBook("Java basic");
        student3.addBook("Java");

        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println("Список студентов");
        students.forEach(System.out::println);

        List<String> books = students.stream()
                .flatMap(x->x.getBooks().stream())
                .filter(x->!x.contains("Java"))
                .toList();

        System.out.println(books);

        List<String> books1 = students.stream()
                .flatMap(x->x.getBooks().stream())
                .filter(x->!x.toLowerCase().contains("java"))
                .toList();
        System.out.println(books1);

    }


}
