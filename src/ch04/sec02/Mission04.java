package ch04.sec02;
/*
public class Mission04 {
    public static void main(String[] args) {

    void main(String[] args) {
        // 만약 score 값이 100 ~ 90점 사이면 A 학점
        // 만약 score 값이 80 ~ 89점 사이면 B 학점
        // 만약 score 값이 70 ~ 79점 사이면 C 학점
        // 만약 score 값이 70점 미만이면 D 학점
        // 만약 score값이 100점을 넘기거나 0점 아래면 "측정 불가" 출력
        /*
        int score = ??; // 0 ~ 200 사이의 랜덤값
        if( score > 100) {
            System.out.println("점수가 100점보다 큽니다");
            System.out.println("측정 불가");
        } else if( score <= 0 ) {
            System.out.println("점수가 0점보다 낮습니다");
            System.out.println("측정 불가");
        } else if( score >= 90 ) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("학점은 A입니다");
        } else if ( score >= 80 ) {
            System.out.println("점수가 80~89입니다.");
            System.out.println("학점은 B입니다");
        } else if ( score >= 70 ) {
            System.out.println("점수가 70~79입니다.");
            System.out.println("학점은 C입니다");
        } else ( score <70 ) {
            System.out.println("점수가 70점 미만입니다.");
            System.out.println("학점은 D입니다");
        }
        System.out.println("-- 끝 --");
        */

        // 정답
        /*
        int score = (int) (Math.random() * 201.0); // 0~ 200 사이의 랜덤값
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력해주세요: ");
        int score = scan.nextInt();
        System.out.printf("score: %d\n", score);

        if (score < 0 || score > 100) { // 0미만 혹은 100 초과인 경우
            System.out.println("측정 불가");
            // 0 ~ 100 사이값이면 아래로 지나간다.
        } else if (score >= 90) { // 100 ~ 90 사이
            System.out.println("A 학점");
            // 0 ~ 89
        } else if (score >= 80) { // 80 ~ 89 사이
            System.out.println("B 학점");
        } else if (score >= 70) { // 70 ~ 79 사이
            System.out.println("C 학점");
            // 0 ~ 69
        } else {
            System.out.println("D 학점");
        }
        System.out.println("-- 끝 --")
        */
        // 개선
/*
        Public static void main (String[]args){
            System.out.print("점수를 입력해주세요: ");
            int score = scan.nextInt();
            System.out.printf("score: %d\n", score);

            String result = "D학점";
            if (score < 0 || score > 100) { // 0미만 혹은 100 초과인 경우
                System.out.println("측정 불가");
            } else { // 0 ~ 100 사이인 경우
                String result = "D";
                if (score >= 90) { // 90 ~ 100 사이
                    result = "A";
                } else if (score >= 80) { // 80 ~ 89 사이
                    result = "B";
                    // 0 ~ 79
                } else if (score >= 70) { // 70 ~ 79 사이
                    result = "C";
                    // 0 ~ 69
                }
                System.out.printf("당신은 %s학점\n", result);
            }
            System.out.println("-- 끝 --");
        }
    }

 */