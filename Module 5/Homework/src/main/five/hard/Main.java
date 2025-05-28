package five.hard;

import five.easy.DayOfWeek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*1. Напишите программу, которая
считывает из консоли n целых чисел
и добавляет их в ArrayList<Integer>.

2. Реализуйте метод removeDuplicates(ArrayList<Integer> list), который
удаляет дубликаты,
сохраняя порядок элементов. */
public class Main {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();
            arr.add(num);
        }

        System.out.println("Task 1. Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
*/


        System.out.println("Task 2:");

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
            list.add(i);
            list.add(i);
        }
        list.add(2);
        list.add(1);
        list.add(0);


        System.out.print("Original list: ");
        for (int i : list) {
            System.out.print(i + " ");
        }

        System.out.println("Without duplicates: " + removeDuplicates(list));
    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int size = list.size() - 1;
            for (int j = size; j > i ; j--) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                    size--;
                }
            }
        }
        return list;
    }


}
