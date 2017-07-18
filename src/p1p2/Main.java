package p1p2;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        String[] arr = {"one","two","three","four"};
        Integer[] arr2 = {1,2,3,4,5,6};

        swap2el(arr,2,3);
        System.out.println("task1 string " + Arrays.toString(arr));

        swap2el(arr2,2,3);
        System.out.println("task1 int " + Arrays.toString(arr2));

        ArrayList<String> aL = returnAL(arr);
        System.out.println("task2 string arraylist " + Arrays.toString(aL.toArray()));

        ArrayList<Integer> aL2 = returnAL(arr2);
        System.out.println("task2 int arraylist " + Arrays.toString(aL2.toArray()));
    }

    private static  <T> void swap2el(T[] arr,int elIndex1, int elIndex2){
        if ((elIndex1 == elIndex2)||
                (elIndex1 < 0)||(elIndex2 < 0)
                || (elIndex1 >= arr.length)||(elIndex2 >= arr.length))
            throw new RuntimeException("wrong input data for swap method");

        T buf = arr[elIndex1];
        arr[elIndex1] = arr[elIndex2];
        arr[elIndex2] = buf;
    }

    private static  <T> ArrayList<T> returnAL(T[] fromArr){
        ArrayList<T> ret = new ArrayList<>();
        for (int i=0;i<fromArr.length;i++) {
            ret.add(fromArr[i]);
        }
        return ret;
    }
}

