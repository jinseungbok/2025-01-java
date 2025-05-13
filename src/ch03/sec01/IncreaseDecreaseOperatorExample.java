package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int i1 = 5;
        i1++; // 쓰기
        System.out.printf("i1: %d\n", i1);

        int i2 = 5;
        ++i2; // 쓰기
        System.out.printf("i2: %d\n", i2);
        /* ++이 앞에 있으나 뒤에 있으나 쓰기 상태에서는 변함 없음
        /* 앞쪽에 있으면 쓰기 먼저 , 뒤쪽은 읽기 먼저
         */
    }
}
