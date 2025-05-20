package ch04.sec08;

public class BeakContinueStudy {
    public static void main(String[] args) {
        // 10번 반복하는 for문 2개 작성해 주세요.
        /* for(int i1=0; i1<11; i1++) {
            System.out.println(i1);
            for (int k=i1; k>i1; k++)
                System.out.println(k);
        }
    }
} */
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
        System.out.println("--------");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
                // coutinue 시 증감식
            }
            System.out.println(i);
        }
    }
}