package wee2.sol2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Stack<Integer> wait = new Stack<>();
        Queue<Integer> bridge = new LinkedList<>();
        ArrayList<Integer> off = new ArrayList<>();
        for(int i = truck_weights.length-1; i>=0; i--){
            wait.push(truck_weights[i]);
        }
        for(int i = 0; i<bridge_length; i++) bridge.offer(0);

        while (off.size()!=truck_weights.length){
            if(sumBridge(bridge) + wait.peek() <= weight){
                bridge.offer(wait.pop());
                off.add(bridge.poll());
                answer++;
            }
        }
        return answer;
    }
    public static int sumBridge(Queue<Integer> t){
        Queue<Integer> q = new LinkedList<>(t);
        int sum = 0;
        while (!q.isEmpty()) {
            sum += q.poll();
        }
        return sum;
    }
}