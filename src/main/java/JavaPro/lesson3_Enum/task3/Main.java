package JavaPro.lesson3_Enum.task3;

public class Main {
    public static void main(String[] args) {


    Document document = Document.SENT;
    /*
        if (document.equals(Document.SENT)) {
            System.out.println("Документ отправлен");
        } else if (document.equals(Document.DELIVERED)) {
            System.out.println("Документ доставлен");
        } else if (document.equals(Document.READ)) {
            System.out.println("Документ прочитан");
        }
   */
        switch (document){
            case SENT -> System.out.println("Документ отправлен");
            case READ -> System.out.println("Документ прочитан");
            case DELIVERED -> System.out.println("Документ прочитан");
            case DELETED -> System.out.println("Документ удален");
        }
        System.out.println("работа метода toString()");
        System.out.println(document);

    }
}
