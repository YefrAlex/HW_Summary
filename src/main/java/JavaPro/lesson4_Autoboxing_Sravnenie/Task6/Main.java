package JavaPro.lesson4_Autoboxing_Sravnenie.Task6;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java", "Gerbery Shildt");
        Book book2 = book1;

        book2.setName("Clean code");
        System.out.println(book1.getName());


    }
}
