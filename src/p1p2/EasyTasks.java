package p1p2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by android on 7/17/17.
 */
public class EasyTasks <T> {

    public void swap2el(T[] arr,int elIndex1, int elIndex2){
        if ((elIndex1 == elIndex2)||
           (elIndex1 < 0)||(elIndex2 < 0)
           || (elIndex1 >= arr.length)||(elIndex2 >= arr.length))
                    throw new RuntimeException("wrong input data for swap method");

        T buf = arr[elIndex1];
        arr[elIndex1] = arr[elIndex2];
        arr[elIndex2] = buf;
    }

    public ArrayList<T> returnAL(T[] fromArr){
        ArrayList<T> ret = new ArrayList<>();
        for (int i=0;i<fromArr.length;i++) {
            ret.add(fromArr[i]);
        }
        return ret;
    }
}
