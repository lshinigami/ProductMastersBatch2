package six.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOperations<T> {
    private List<Integer> list;
    public  ListOperations (List<Integer> list) {
        this.list = list;
    }

    public Integer listMin(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    public Integer listMax(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public List<Integer> listASC(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i) <= list.get(j)) {
                    continue;
                }
                else {
                    Collections.swap(list, i, j);
                }
            }
        }
        return list;
    }

    public List<Integer> listDESC(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i) >= list.get(j)) {
                    continue;
                }
                else {
                    Collections.swap(list, i, j);
                }
            }
        }
        return list;
    }

    public boolean listIfExist(Integer num) {
        boolean isExist = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == num) {
                isExist = !isExist;
            }
        }
        return isExist;
    }

    public List<Integer> listGreaterThan(Integer num) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > num){
                newList.add(list.get(i));
            }
        }
        return newList;
    }

    public int listSum(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
