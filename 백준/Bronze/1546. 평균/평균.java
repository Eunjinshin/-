import java.io.IOException;
import java.util.*;

/**
 * 문제 풀이 일 : 2026.03.13
 * '데이터 정규화(Normalization)'와 '부동 소수점 오차'
 */
class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 시험 본 과목의 개수
        int N = sc.nextInt();

        int[] score = new int[N];
        int M = 0; // 점수 중에 최댓값
        double result = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt(); // 숫자 입력

            score[i] = num;

            if (num > M)
                M = num;
        }

        for (int i = 0; i < N; i++) {
            result += ((double) score[i] / M * 100);
        }

        System.out.println(result / N);

    }
}