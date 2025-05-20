package ch05.sec06;

import java.util.Arrays;

public class Mission05 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        // for 쓰기용 (10, 11, 12, 13, .... 19)
        for(int i=0; i<arr.length; i++) {
            arr[i] = i+10;
        }
        // for 출력용(읽기 후 출력)
        for(int i = 0; i<arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }
        // arr[0] : 10
        // arr[0] : 11
        // ....
        // arr[9] : 19
    }
}