package ch02;

public class PrintVsPrintln {
    public static void main (String[] args) {
        //print
        System.out.print("안녕");
        System.out.print("안녕");
        System.out.print("안녕");

        System.out.println("-------");
        //println
        System.out.println("HELLO");
        System.out.println("HELLO");
        System.out.println("HELLO");

        //print + 개행(이스케이프 문자 \n)
        System.out.print("안녕\n");
        System.out.print("안녕\n");
        System.out.print("안녕\n");

        // 여러분 생각에
        System.out.print("안녕\\n");
        System.out.print("  '안녕'\n");
        System.out.print("   \"안녕\" \n");

        //printf
        int age = 22;
        String name = "홍길동";
        float height = 172.522323f;
        double height2 = 172.5;
        // age, name, height 변수를 활용하여 아래처럼 출력시켜 주세요.
        // 제 이름은 홍길동이고 나이는 22살이며 키는 172.5cm 입니다.
        System.out.println("제 이름은 " + name + "이고");
        System.out.println("나이는" + age + "살이며");
        System.out.println("키는" + height + "입니다");

        System.out.println("제 이름은 " + name + "이고 " + "나이는 " + age + " 살이며 " + "키는 " + height + " 입니다");
        System.out.printf("제 이름은 %s이고 나이는 %d살이며 키는 %.1fcm입니다. \n", name, age, height);
        // %s(string, 문자열) , %d(decimal, 10진수)를 자주 쓴다.
    }
}
