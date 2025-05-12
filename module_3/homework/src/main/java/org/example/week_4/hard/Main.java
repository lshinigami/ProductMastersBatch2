package org.example.week_4.hard;

import org.example.week_4.medium.UserData;

/*Нужно создать обобщенный класс Box<T>,
который представляет контейнер для хранения одного объекта любого типа.

**Требования**
Создать класс Box<T>, который содержит:
• Поле item (обобщенного типа T).
• Конструктор, принимающий начальное значение.

Методы:
• void setItem(T item) – сохраняет новое значение в контейнере.
• T getItem() – возвращает текущее значение.
• void showType() – выводит в консоль тип объекта, который хранится в контейнере.

Протестировать класс в main, создав объекты (например, Box<String> и Box<MyData>)
и вывести содержимое и тип.*/
public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello");
        Box<Double> doubleBox = new Box<>(4.7);
        Box<UserData> userDataBox = new Box<>(new UserData(1, "Marceline", "marceline@gmail.com"));
        System.out.println(stringBox.getItem());
        stringBox.showType();

        System.out.println();

        System.out.println(doubleBox.getItem());
        doubleBox.showType();

        System.out.println();

        System.out.println(userDataBox.getItem());
        userDataBox.showType();

    }
}
