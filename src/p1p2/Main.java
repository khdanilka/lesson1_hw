package p1p2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by android on 7/17/17.
 */
public class Main {

    public static void main(String[] args) {

        String[] arr = {"1","2","3","4"};

        new EasyTasks<String>().swap2el(arr,2,3);
        System.out.println("task1 " + Arrays.toString(arr));

        ArrayList<String> aL = new EasyTasks<String>().returnAL(arr);
        System.out.println("task2 " + Arrays.toString(aL.toArray()));
    }
}

