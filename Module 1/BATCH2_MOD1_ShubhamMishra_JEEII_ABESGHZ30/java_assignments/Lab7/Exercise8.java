package Lab7;

import java.util.*;

 class Duplicate{
    public Integer[] modifyArray(int[] arr) {
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
            lists.add(new Integer(arr[i]));
        Collections.sort(lists);
        Set<Integer> sets = new HashSet<>();
        for (Integer i : lists) {
            sets.add(i);
        }
        Integer array[] = new Integer[sets.size()];
        int k = 0;
        for (Integer i : sets) {
            array[k++] = i;
        }
        return array;
    }
}

public class  Exercise8 {
    public static void main(String args[]) {
        Duplicate j = new Duplicate();
        int arr[] = {10, 20, 30, 10, 80, 60, 60};
        Integer array[] = j.modifyArray(arr);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
