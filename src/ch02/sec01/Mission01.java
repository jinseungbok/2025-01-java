package ch02.sec01;

public class Mission01 {
    // 메인 메소드 작성
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 22;

        System.out.println("num1: " + num1 + num2); // num1: 33( X)
                                                    // num1: 1122 (O)
        // 자동형변환(promotion) : 서로 다른 타입 간 대입이나 연산 시, 자동으로 타입 변환이 일어나는 것.
        // 1. "num1: " + num1
        // 2. "num1: " + 11
        // 3. "num1: " + "11"
        // 4. "num1: 11"
        // 5. "num1: 11" + num2
        // 6. "num1: 11" + 22
        // 7. "num1: 11" + "22"
        // 8. "num1: 1122" >> 연산의 결과
    }
}