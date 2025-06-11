package easy;

/*Создайте интерфейс **Printer<T>**, который содержит метод **void print(T value)**.
Реализуйте его в классе StringPrinter b, который будет печатать строки в консоль.*/
public class Main {
    public static void main(String[] args) {
        StringPrinter<String> printer = new StringPrinter<>();
        printer.print("hello.html");

    }

}
