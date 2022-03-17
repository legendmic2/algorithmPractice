package com.company.algorithmPractice.solved.programmers;

import java.util.*;

public class PG_43164 {
    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "A"}, {"ICN", "B"}, {"B", "ICN"}};

        String[] result = solution(tickets);

        for(String city: result) {
            System.out.print(city + " ");
        }
    }

    public static String[] solution(String[][] tickets) {
        boolean[] visited = new boolean[tickets.length];
        Arrays.fill(visited, false);
        Deque<String> curRoute = new LinkedList<>();
        curRoute.add("ICN"); // 맨처음은 무조건 ICN

        // 1. 모든 티켓(String[2])을 사전순으로 sort
        Arrays.sort(tickets, (o1, o2) -> {
            // 앞 idx의 String이 동일할 경우, 뒤의 String으로 비교
            if(o1[0].compareTo(o2[0]) == 0) {
                return o1[1].compareTo(o2[1]);
            } else {
                return o1[0].compareTo(o2[0]);
            }
        });

        // 2. Traverse하여 ICN 에서 출발하는 티켓을 찾을 경우 DFS
        for(int i=0; i< tickets.length; ++i) {
            if(tickets[i][0].equals("ICN")) {
                visited[i] = true; // 방문
                curRoute.add(tickets[i][1]); // 현재 Ticket의 도착지를 Route에 저장
                dfs(tickets[i][1], 1, visited, curRoute, tickets);

                // 끝까지 도착하여 return된 경우
                if(curRoute.size() == tickets.length + 1) {
                    return curRoute.toArray(new String[tickets.length+1]);
                } else {
                    // 이번에 추가한 ticket에선 유효한 결과가 없었던 것이므로 삭제하고 방문기록 삭제
                    visited[i] = false;
                    curRoute.removeLast();
                }
            }
        }

        return new String[]{"asd"};
    }

    // stt: 현재 순번의 출발지 (= 이전 티켓의 도착지)
    // cnt: 현재까지 사용한 티켓
    public static void dfs(String stt, int cnt, boolean[] visited, Deque<String> curRoute, String[][] tickets) {
        // 모든 도시를 순회한 상황인지 확인 (= cnt가 ticket 개수 + 1)
        if(cnt == tickets.length + 1) return;

        for(int i=0; i<tickets.length; ++i) {
            // i번 티켓의 출발지가 현재 순번의 출발지와 같다면
            if(!visited[i] && tickets[i][0].equals(stt)) {
                visited[i] = true;
                curRoute.add(tickets[i][1]);
                dfs(tickets[i][1], cnt+1, visited, curRoute, tickets);
                if(curRoute.size() == tickets.length + 1) break; // 정답을 찾은 것이므로 break
                else {
                    // 이번에 추가한 ticket에선 유효한 결과가 없었던 것이므로 삭제하고 방문기록 삭제
                    visited[i] = false;
                    curRoute.removeLast();
                }
            }
        }

    }
}
