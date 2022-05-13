package com.company.algorithmPractice.solved.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BJ_1541 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), "+-", true); // delimeter도 token으로 저장

        String curToken;

        int res;
        int curSum = 0;

        List<Integer> numList = new ArrayList<>();

        while (st.hasMoreTokens()) {
            curToken = st.nextToken();
            if (curToken.equals("+")) {
            } else if (curToken.equals("-")) {
                numList.add(curSum);
                curSum = 0;
            } else {
                // 숫자
                // +가 나오면 temp에 저장
                curSum += Integer.parseInt(curToken);
            }
        }

        if (numList.isEmpty()) {
            res = curSum;
        } else { // 뺄셈 연산자가 한번 이상 나온 상황 => 마지막 curSum을 numList에 넣어줘야 한다
            numList.add(curSum);
            res = numList.get(0); // 맨 앞 숫자는 더하고
            for (int i = 1; i < numList.size(); ++i) {
                res -= numList.get(i);
            }
        }

        System.out.println(res);


    }
}
