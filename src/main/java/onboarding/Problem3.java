package onboarding;

import java.util.Scanner;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        number = scan.nextInt();
        for (int i = 1; i < number; i++) {
            String str1 = String.valueOf(i);
            if (str1.contains("3")) {
                answer++;
            } else if (str1.contains("6")) {
                answer++;
            } else if (str1.contains("9")) {
                answer++;
            }
        }
        return answer;
    }
}