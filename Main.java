package StreamAPI_OperationWithNumb_Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> listAsArray = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        ArrayList<Integer> list = new ArrayList<>(listAsArray);
        sortAscendingOrder(list);
    }

    public static void sortAscendingOrder(List<Integer> list) {
        for (int i = 0; i < list.size(); ) {
            if (list.get(i) <= 0) {
                list.remove(i);
            } else if (list.get(i) % 2 == 1 ) {
                list.remove(i);
            } else {
                i++;
            }
        }

        int max;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    max = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, max);
                }
            }
        }

        for (Integer integer: list) {
            System.out.println(integer);
        }
    }

}
