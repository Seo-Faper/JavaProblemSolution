package wee2.sol1;

import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        Stack<Integer> L = new Stack<>();

        for(int i = progresses.length-1; i>=0; i--){
            int daily = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0) daily++;
            L.push(daily);
        }

        System.out.println(L.toString());
        Stack<Integer> sk = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int init = 0;
        while (!L.isEmpty()){
            if(sk.isEmpty()) {
                sk.push(L.pop());
                init = sk.peek();
            }else{

                if(init >= L.peek()){
                    sk.push(L.pop());
                }else{
                    ans.add(sk.size());
                    init = sk.peek();
                    sk.clear();
                }
            }

        }
        ans.add(sk.size());
        int[] answer = ans.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}