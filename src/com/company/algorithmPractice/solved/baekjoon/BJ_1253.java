package com.company.algorithmPractice.solved.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_1253 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int cnt = 0; // 좋은 수 개수
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine().trim());

        for (int i = 0; i < N; ++i) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for (int k = 0; k < N; ++k) {
            int find = arr[k]; // 좋은 수인지 확인하려는 숫자
            int i = 0; // 앞 포인터
            int j = N - 1; // 뒤 포인터
            // 투 포인터 알고리즘
            while (i < j) { // 두 포인터가 만나면 (i==j) while문 종료
                if (arr[i] + arr[j] == find) { // 두 수의 합이 find인 i, j 조합을 찾았다면
                    if (i != k && j != k) { // find와
                        cnt++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else {
                        j--;
                    }
                } else if (arr[i] + arr[j] < find) {
                    // 두 수의 합이 find보다 크다면 => 뒤 포인터를 한칸 앞으로 (= 한 단계 작은 수 선택)
                    i++;
                } else {
                    // 두 수의 합이 find보다 작다면 => 앞 포인터를 한칸 뒤로 (= 한 단계 큰 수 선택)
                    j--;
                }
            }
        }

        System.out.println(cnt);
    }

}
