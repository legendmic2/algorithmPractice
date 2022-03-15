package com.company.algorithmPractice.solved.programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PG_43163 {
    public static void main(String[] args) throws Exception {
        String begin = "hit";
        String target = "cog";
        // String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        String[] words = {"hot", "dot", "dog", "lot", "log"};

        int result = solution(begin, target, words);

        System.out.println("result: " + result);
    }

    public static int solution(String begin, String target, String[] words) {
        // 1. words에 target이 존재하지 않는 exception 처리
        if(Arrays.stream(words).noneMatch(target::equals)) {
            return 0;
        }

        // 2. BFS
        return bfs(begin, target, words);
    }

    static int bfs(String begin, String target, String[] words) {
        Queue<String> queue = new LinkedList<>();
        int cnt = 0;

        for(String word: words) {
            // 한 글자만 다른 경우 queue에 넣는다
            if(isDifferentExceptOne(begin, word)) {
                queue.add(word);
            }
        }

        if(queue.size() == 0) {
            return 0; // 한 글자만 다른 케이스가 없다면 0을 return
        }

        // 한 글자만 다른 경우가 존재하는 경우
        // 반복문의 반복횟수가 words의 길이보다 클 경우, 안에서 반복되는 것이므로 break되도록
        while (!queue.isEmpty() && cnt <= words.length) {
            cnt++; // 횟수 증가
            int qSize = queue.size();

            for(int i=0; i<qSize; ++i) {
                String front = queue.poll(); // 맨앞 pop

                // target을 찾았으므로 현재 cnt를 return
                assert front != null;
                if(front.equals(target)) {
                    return cnt;
                }

                for(String word: words) {
                    if(isDifferentExceptOne(front, word)) {
                        queue.add(word);
                    }
                }
            }
        }


        return 0;
    }

    // a와 b가 딱 한 글자만 다르다면 true
    static boolean isDifferentExceptOne(String a, String b) {
        int cnt = 0;
        int length = a.length(); // a와 b의 length는 같다

        for(int i = 0; i<length; ++i) {
            if(a.charAt(i) != b.charAt(i)) {
                cnt++;
            }
        }

        return cnt == 1;
    }
}
