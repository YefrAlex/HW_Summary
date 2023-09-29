package JavaPro.lesson3_Enum.task2;

public class Document {
    public static final Document SENT = new Document();
    public static final Document DELIVERED= new Document();
    public static final Document READ = new Document();

    private Document () {
        System.out.println("вызван конструктор класса документ");
    }
}
