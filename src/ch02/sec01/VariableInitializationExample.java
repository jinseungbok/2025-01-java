package ch02.sec01;

public class VariableInitializationExample {
    public static void main(String[] args) {
        int value; // 변수 선언(변수명 당 최초 한번), 선언을 할 때 데이터 타입 지정(int는 정수 타입)
        // 변수 사용 방법 2가지: 읽기(read), 쓰기(write)
        // 우측에 =가 있으면 쓰기, 없으면 읽기
        value = 10; //
        int value2 = 20; //
        /*
        에러(예외) 종류 크게 2가지
        - Compile Error : 문법을 잘못 작성해 프로그램 컴파일이 안되는 에러. 컴파일 자체 안됨
        - Runtime Error : 프로그램 실행 도중 오류가 발생함
         */
        int result = value + 10; // value 아래에 빨간색 언더라인, 컴파일 에러
        System.out.println(result);
    }
}