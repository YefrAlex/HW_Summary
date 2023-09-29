package JavaPro.lesson17_Lambda.task8;

import java.util.function.Function;

public class Main {

    // Написать класс Request.
    // Запрос должен содержать два поля - текст сообщения и целочисленный идентификатор отправителя.
    // Используя функциональный интерфейс, написать функцию,
    // которая принимает запрос и возвращает строку в виде:
    // {Получен запрос: сообщение - [здесь_текст_сообщения], отправитель - [здесь_ид_отправителя]}
    // Написать метод, который принимает запрос и данную функцию и выводит результат в консоль.
    public static void main(String[] args) {
        Function<Request,String> function = x -> String.format("{Получен запрос: сообщение - [%s], отправитель - [%d]}", x.getString(),x.getIndex());
        Request request = new Request("Это наше сообщение", 123);
        printRequest(request,function);
    }
    public static void printRequest (Request request, Function<Request,String> function){
        System.out.println(function.apply(request));
    }
}
