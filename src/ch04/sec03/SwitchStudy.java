package ch04.sec03;
public class SwitchStudy {
    /*
    switch 에서는 관계연산자(>, <, >=, <=, !=) 사용할 수 없다.
    오로지 == equal만 가능
    switch는 case에 맞는 값이 있으면 진입, break; 키워드를 만날 때가지 모두 실행

    switch( 변수 ) {
        case  값1: {
              처리1;
              break; }
        case  값2:
              처리2;
              break;
        [...]

        default:
            나머지 처리;
            break;
     switch는 if로 가능하나 if는 switch로 힘들 수 있음.
     */
    public static void main(String[] args) {
        int num = 2;
        switch( num ) {
            case 1:
                System.out.println("1입니다.");
                break;
            case 2:
            case 3:
                System.out.println("2 or 3입니다.");
                break;
            default:
                System.out.println("값이 없네요.");
            case 4:
                System.out.println("4입니다.");
                break;
        }
        System.out.println("-- 끝 --");
    }
}