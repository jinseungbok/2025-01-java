package ch04.sec08;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { // 이 라인은 수정 불가
/*
            System.out.print(i + "1");
            if (i == 0);
            {
                continue;
                // 출력 결과 2, 4, 6, 8, 10
            }
            System.out.println(i);
        }
    }
}
*/
            // 정답
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}