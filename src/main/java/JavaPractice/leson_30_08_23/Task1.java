package JavaPractice.leson_30_08_23;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Aleks");
        student1.addBook("Java 8 vs Java 19");
        student1.addBook("Spring Boot in Action");
        student1.addBook("Effective Java");

        Student student2 = new Student();
        student2.setName("Thomas");
        student2.addBook("HTML introducing");
        student2.addBook("Effective Java");

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);

        Set<String> books = list.stream().flatMap(student -> student.getBook().stream())
                .sorted(Comparator.reverseOrder()).skip(2).limit(2).collect(Collectors.toSet());

        System.out.println(books);

        int[] ints= new Random().ints(200).toArray();

        System.out.println(Arrays.stream(ints).average());
        System.out.println(Arrays.stream(ints).sum());
        System.out.println(Arrays.stream(ints).filter(x-> x%2==0));
        System.out.println(Arrays.stream(ints).dropWhile(x -> x%15 !=0).filter(x->x%3 == 0).map(x->(int)Math.pow(x,2)).filter(x->x>7898754).toArray());


    }


    public static class Student {
        private int id;
        private String name;
        private Set<String> book;

        public void addBook(String book) {
            if (this.book == null)
                this.book=new HashSet<>();

            this.book.add(book);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id=id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name=name;
        }

        public Set<String> getBook() {
            return book;
        }

        public void setBook(Set<String> book) {
            this.book=book;
        }
    }
}