package com.company.algorithmPractice.solved.programmers;

import java.util.*;
import java.util.stream.Collectors;

public class PG_42748 {
    public static void main(String[] args) throws Exception {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};

        int[] result = solution(array, commands);

        for(int res : result) {
            System.out.print(res + " ");
        }

    }

    public static int[] solution(int[] array, int[][] commands) {
        // array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수
        // command[i] => [0] = i / [1] = j / [2] = k

        List<Integer> subList;

        List<Integer> res = new ArrayList<>();

        for(int[] com: commands) {
            subList = new ArrayList<>();

            // sub list (i~j) 저장
            for(int i=com[0]-1; i<com[1]; ++i) {
                subList.add(array[i]);
            }

            // sort
            Collections.sort(subList);

            // k번째 숫자 저장
            res.add(subList.get(com[2]-1));
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
