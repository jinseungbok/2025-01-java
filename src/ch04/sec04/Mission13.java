package ch04.sec04;

public class Mission13 {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 6) * 3; // 3~8까지 랜덤값
        System.out.println("star: " + star);
        //star = 3
        //*
        //**
        /// ***
        for (int i = 0; i < star; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// or
        /*
        System.out.println("----");
        for(int i=1; i<=star; i++) {
            for(int k=0; k<i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */
        /*
        for (int i = 3; i < 9; i++) {
        for(int k = "*"; i < 9; i++) {
        System.out.println("*");
            }
        } */
/*
        for (int k = 0; k < star; k++) {
        for (int i = 0; i < star; i++) {
        System.out.print("*");
            }
                    System.out.println();
                     */