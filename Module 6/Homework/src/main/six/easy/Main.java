package six.easy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(10);
        list.add(7);
        list.add(8);
        list.add(2);



        ListOperations<Integer> operations = new ListOperations<>(list);
        System.out.println(operations.listMax(list));
        System.out.println(operations.listMin(list));
        System.out.println(operations.listASC(list));
        System.out.println(operations.listDESC(list));

        System.out.println(operations.listIfExist(3));
        System.out.println(operations.listIfExist(11));

        System.out.println(operations.listGreaterThan(4));
        System.out.println(operations.listGreaterThan(11));

        System.out.println(operations.listSum(list));

    }
}
