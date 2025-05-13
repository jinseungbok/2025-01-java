package ch03.sec07;
// p.94
public class LogicalOperatiorExample {
    public static void main(String[] args) {
       int num1 = 5;
       int num2 = 0;
       // boolean 값
       // System.out.printf(" %d > %d : %b\n", num1, num2, num1 > num2);
       // System.out.printf(" %d > %d && %d > %d : %b\n"
       //        , num1, num2, num1, 2, num1 > num2 && num1 > 2);
       System.out.printf("%d > %d : %b\n", num1, num2, num1 > num2);
       System.out.printf("5 > 0 && 5 > 2 : %b\n", 5 > 0 && 5 > 2); // true
       // &&(and 연산자) 양 쪽은 boolean 타입만 올 수 있다.
       System.out.printf("5 > 0 && 5 > 2 : %b\n", 5 > 0 && 5 < 2); // false
       System.out.printf("5 > 0 && 5 < 2 && 10 > 2 : %b\n", 5 > 0 && 5 < 2 && 10 > 2); // false
       // and 연산자는 양쪽 다 True일 경우에만 true, 한 쪽만 false여도 false
       // 1) 5 > 0         >> true
       // 2) 5 < 2         >> false
       // 3) true && false >> false
       // false 발생 시 뒤는 계산하지 않는다.
       System.out.println();
       System.out.printf("5 > 0 || 5 < 2 : %b\n", 5 > 0 || 5 < 2); // true
       // 1) 5 > 0         >> true
       System.out.printf("5 < 0 || 5 < 2 : %b\n", 5 < 0 || 5 < 2); // false
       // || or 연산자. 둘 중 하나라도 true면 true
       System.out.println();
       System.out.printf("!(5 < 0 || 5 < 2) : %b\n", !(5 < 0 || 5 <2)); // true
       System.out.printf("!false : %b\n", !false); // true
    }
}
