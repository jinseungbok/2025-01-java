package other;
public class scopeStudy {
    /*
    scope : 변수가 살아있는 공간 (LifeCycle)
            변수 선언 시 자기 자신을 감싸고 있는 중괄호 안에서만 살아 있다.
            즉, 중괄호를 벗어나면 DIE.
    */
    public static void main(String[] args) {

        int num = 10;
        System.out.println(num);

        for(int i=0; i<10; i++) {
            //int i=10; //같은 스코프 안에서는 같은 이름의 변수 선언은 한 번만 하면 된다.
            System.out.println(i);
        }
        for(int i=0; i<10; i++) {
            System.out.println(i);
        }
        //System.out.println(num); // i에 접근할 수 없다.
    }
    public static void methodA() {

    }
}
