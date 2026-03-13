import java.io.*;
import java.util.StringTokenizer;

/**
 * 문제 풀이 일 : 2026.03.13
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int result = A * B * C;

        // 숫자를 담을 바구니
        int[] counts = new int[10];

        while (result > 0) {
            int digit = result % 10;
            counts[digit]++;
            result /= 10;
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.println(counts[i]);
        }
    }
}