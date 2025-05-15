package ch04.sec04;

public class Mission10 {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 4.0) + 3; // 3~6사이 랜덤값
        System.out.printf("star: %d\n", star);
        for (int k = 0; k < star; k++) {
            for (int i = 0; i < star; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
    public static void main(String[] args) {
        int star = (int) (Math.random() * 4.0) + 3;
        System.out.printf("star: %d\n", star);
        int totalCount = star * star;
        for (int k = 1; k < totalCount; k++) { //star3 > 9번, star 4 > 16
        System.out.print("*");
        if (k % star == 0) {
            System.out.println();
        }
    }
}
*/
        /*
        star: 3
        ***
        ***
        ***
        */
