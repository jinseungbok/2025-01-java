package ch04.sec04;

public class Mission08 {
    public static void main(String[] args) {
        int sum = 0;

        //sum = sum + 1;
        // 대입연산자 우측 1 읽기. 0 + 1 = 1, 최종적으로 0인 값이 1로 변경됨
        //sum = sum + 2;
        // 대입연산자 우측 2 읽기. 2 + 1 = 3, 최종적으로 2인 값이 3으로 변경됨.

        //System.out.println("sum: " + sum); // 3

        // 1~100 모두 더한 값 출력하세요.
        // 작업
        // sum = sum + 1;
        // sum = sum + 2;
        // sum = sum + 3;
        // ....
        // sum = sum + 100;
        for (int i=1; i<101; i++) {
            sum = sum + i;
        }
        System.out.println("sum: " + sum); // 5050
    }
}