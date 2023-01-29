package wee2.sol2;

import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> bridge = new LinkedList<>();

        for(int i = 0; i<bridge_length; i++) bridge.offer(0);

        int i = 0;
        int sum = 0;

        while (i < truck_weights.length){
            sum -= bridge.poll(); // 다리의 끝에 있는 요소를 내림 0으로 꽉 차있었다면 무게의 변화가 일어나지 않음
            answer++;
            if(sum + truck_weights[i] <= weight) { // 현재 다리 위에 트럭 무게 + 지날려는 트럭 무게가 최대 중량보다 작거나 같을 때

                sum += truck_weights[i]; // 다리 중량에 들어갈 트럭을 추가
                bridge.offer(truck_weights[i]); // 다리 큐에 트럭을 추가
                i++;
            }else{ // 현재 다리 위의 트럭 무게 + 지금 지날려는 트럭 무게가 최대 중량보다 클 때
                bridge.offer(0);
            }

          //  System.out.println(bridge);
        }
        return answer + bridge_length;
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