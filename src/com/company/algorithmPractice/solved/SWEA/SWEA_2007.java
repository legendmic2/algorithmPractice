package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 2007. 패턴 마디의 길이
public class SWEA_2007 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> ansList = new ArrayList<>();

        int t = Integer.parseInt(br.readLine().trim());

        for(int i=0; i<t; ++i) {
            StringBuilder str = new StringBuilder(br.readLine().trim());
            int repeatIdx = 0; // 맨 앞 글자부터 확인
            int ans = 0;
            int strSize = str.length();

            for(int j=0; j<strSize; ++j) {
                for(int k=j+1; k<strSize; ++k) {
                    if(str.charAt(j) == str.charAt(k)){
                        // 동일한 글자를 찾은 경우 => 반복마디일 수도 있음
                        for(int gap = 0; gap < k - j; ++gap) {
                            if(str.charAt(j + gap) != str.charAt(k + gap)) break;
                            if(gap == k-j-1) {
                                // 마지막 부분까지 똑같다면
                                ans = k-j; // 마디의 길이는 k-j
                            }
                        }
                    }
                    if(ans != 0) break;
                }
                if(ans != 0) break;
            }

            ansList.add(ans);
        }

        for (int i = 0; i < t; ++i) {
            System.out.println("#" + (i + 1) + " " + ansList.get(i));
        }


    }
}
