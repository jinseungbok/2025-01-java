package ch04;

public class Mission03 {
    public static void main(String[] args) {

    }
}
    // public static void main(String[] args) {
    //    int value = ???; // 1~100 사이의 랜덤값 나오게 해주시고
        // value = 5; 라면
        // 출력 : 5는(은) 홀수입니다.

        // 랜덤값 value = 97; 라면
        // 출력: 97는(은) 홀수입니다.

        // 랜덤값 value = 54; 라면
        // 출력: 54는(은) 짝수입니다.
/*
    }
}

// 정답
        public static void main(String[] args) {
        int value = (int)(Math.random() * 100.0) + 1;

        if(value % 2 == 0) {
            System.out.println(value + "는(은) 짝수입니다.");
        } else {
            System.out.println(value + "는(은) 홀수입니다.")
        }
    }
}

// 개선
        public static void main(String[] args) {
            int value = (int) (Math.random() * 100.0) + 1;

            String oddEven = "홀";
            if (value % 2 == 0) {
                oddEven = "짝";
            }
            System.out.printf("%d는(은) %s수입니다.\n", value, oddEven);
       }
}

// 개선2
        public static void main(String[] args) {
            int value = (int) (Math.random() * 100.0) + 1;

            System.out.printf("%d는(은) %s수입니다.\n"
                    , value, value % 2 == 0 ? "짝" : "홀"); // 삼항식
        }
}
*/