package JavaPro.lesson3_Enum.task1;

public class Main {
    public static void main(String[] args) {
        // Мы хотим, чтобы в нашем приложении документ мог
        // иметь только три статуса - отправлен, доставлен, прочитан.
        Document document = new Document("Sent");
        if (document.getStatus().equals("Sent")){
            System.out.println("документ отправлен");
        } else if (document.getStatus().equals("Delivered")){
            System.out.println("документ доставлен");
        } else if (document.getStatus().equals("Read")) {
            System.out.println("документ прочитан");
        }

    }



}
