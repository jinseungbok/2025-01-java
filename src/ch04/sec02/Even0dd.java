package ch04.sec02;

public class Even0dd {
    public static void main (String[] args) {
        // 홀, 짝 + 랜덤 숫자
        int num = 101;
        //mod % 연산자 사용, 나머지 값을 구함
        System.out.printf("%d / %d = %d\n", num, 5, num / 5);
        System.out.printf("%d %% %d = %d\n", num, 5, num % 5);

        // mod를 활용해 짝, 홀인지 구분

        if( num % 2 == 0 ) {
            System.out.printf("%d는 짝수입니다.\n", num);
        } else {
            System.out.printf("%d는 홀수입니다.\n", num);
        }
        System.out.println("--끝--");
    }
}