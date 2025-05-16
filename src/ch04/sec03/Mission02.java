package ch04.sec03;

public class Mission02 {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 101.0); // 0~100 랜덤값
        System.out.println("score: " + score);
        // switch 이용해서 단!! 겁나 nice하게
        // 만약 score 값이 100~90점 사이면 A학점
        // 만약 score 값이 80~89점 사이면 B학점
        // 만약 score 값이 70~79점 사이면 C학점
        // 만약 score 값이 70점 미만이면 D학점
        // 만약 score 값이 100점을 넘기거나 0점 아래면 "측정 불가" 출력
        switch ( score / 10 ) {
            case 10, 9:
                System.out.println("A학점");
                break;
            case 8:
                System.out.println("B학점");
                break;
            case 7:
                System.out.println("C학점");
                break;
            default:
                System.out.println("D학점");
                break;
        }
    }
}