package JavaPro.lesson4_Autoboxing_Sravnenie.Task6;

public class Main1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book1 = new Book("Java", "Gerbery Shildt");
        Book book2 = (Book) book1.clone();

        book2.setName("Clean code");

        System.out.println(book1.getName());
        System.out.println(book2.getName());
    }
}
