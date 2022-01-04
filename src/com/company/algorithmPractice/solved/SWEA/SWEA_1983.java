package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// 1983. 조교의 성적 매기기
public class SWEA_1983 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        List<String> resList = new ArrayList<>();

        List<Float> scoreList = new ArrayList<>();

        StringTokenizer str;

        List<String> gradeList = Arrays.asList("A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0");

        for (int i = 0; i < t; ++i) {
            int n, k;
            float curScore;
            scoreList.clear();
            str = new StringTokenizer(br.readLine().trim());
            n = Integer.parseInt(str.nextToken());
            k = Integer.parseInt(str.nextToken());

            // n명의 학생들의 점수
            for (int j = 0; j < n; ++j) {
                curScore = 0;
                str = new StringTokenizer(br.readLine().trim());
                curScore += Integer.parseInt(str.nextToken()) * 0.35;
                curScore += Integer.parseInt(str.nextToken()) * 0.45;
                curScore += Integer.parseInt(str.nextToken()) * 0.2;

                scoreList.add(curScore);
            }

            float scoreOfK = scoreList.get(k - 1);

            scoreList.sort(Comparator.reverseOrder());

            int rankOfK = scoreList.indexOf(scoreOfK);

            resList.add(gradeList.get(rankOfK / (n / 10)));
        }

        for (int i = 0; i < t; ++i) {
            System.out.println("#" + (i + 1) + " " + resList.get(i));
        }
    }
}
