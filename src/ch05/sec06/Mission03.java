package ch05.sec06;

import java.util.Arrays;

public class Mission03 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30 };
        System.out.println(Arrays.toString(arr) );
        System.out.println("-------------------");
        // 여기 아래는 여러분들의 놀이터.
        /*
        int[] = new int[3];
            int i = 10;
            for(int i=0; i>30; i++) */
        /* mission03
        System.out.print("[");
        for(int i=0; i<arr.length; i++) {
            arr[i] = (i + 1) * 10;
            System.out.print(arr[i]);
        }
        System.out.print("]"); */
        System.out.print("[");
        for(int i=0; i<arr.length; i++) {
            if(i < arr.length - 1) {
                System.out.print(arr[i] + " , ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");
    }
}
