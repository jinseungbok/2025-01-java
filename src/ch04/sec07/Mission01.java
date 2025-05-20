package ch04.sec07;

import java.util.Scanner;

public class Mission01 {
    /*
    --------------------------------------
    1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
    --------------------------------------
    선택 >

    (실행 예시)
    선택 > 1. (엔터)
    예금액 > 10000 (엔터)

    [[ 프린트 ]]
    선택 > 2. (엔터)
    출금액 > 2000 (엔터)
    [[ 프린트 ]]
    선택 > 3. (엔터)
    잔고 > 8,000원
    [[ 프린트 ]]
    선택 > 4. (엔터)

    프로그램 종료
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            boolean i = true;
            int run = 0;
            while (true) {
            System.out.print(">> ");
            int num = scanner.nextInt();
            if(num == 1) {break;}
                        System.out.println("[[ 프린트 ]]");
                    }
                }
            }
/*
        boolean run = true;

        int sum = 0;
        while( run ) {
            System.out.print(">> ");
            int num = scanner.nextInt();
            if( num == 0 ) {
                run = false;
            } else {
                //sum = sum + num;
                sum += num;
            }
        }
        System.out.println("합계: " + sum);
        */