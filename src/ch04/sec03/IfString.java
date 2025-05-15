package ch04.sec03;

import java.util.Scanner;

public class IfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요. (F/M) > ");
        String gender = scanner.next();
        System.out.println("gender: " + gender);
        // F을 입력하면 "당신은 여자입니다."
        // M을 입력하면 "당신은 남자입니다."
        // F,M이 아니면 "성별을 입력해주세요." 출력
        if ("F".equalsIgnoreCase(gender) || "여".equals(gender) || "여자".equals(gender)) {
            System.out.println("당신은 여자입니다.");
        } else if ("M".equalsIgnoreCase(gender) || "남".equals(gender) || "남자".equals(gender)) {
            System.out.println("당신은 남자입니다.");
        } else {
            System.out.println("성별을 입력해주세요.");
        }
        System.out.println("-- 끝 --");
    }
}
/*
        switch(gender) {
            if(gender.equals == F) {
                System.out.println("당신은 여자입니다");
            } else if (gender == "M") {
                System.out.println("당신은 남자입니다"); {
                    default:
                        System.out.println("성별을 입력해 주세요");
                }
            }
        }
    }
}
*/

/*
            "F", "당신은 여자입니다");
                else if
                    "M", "당신은 남자입니다" }
            case 1: "F";
                System.out.println("당신은 여자입니다");
                break;
            case 2: "M";
                System.out.println("당신은 남자입니다");
                break;
            default:
                System.out.println("성별을 입력해주세요");
                break; */