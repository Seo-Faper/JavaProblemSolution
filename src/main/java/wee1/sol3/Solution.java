package wee1.sol3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};

        Set<String> useWord = new HashSet<>();
        useWord.add(words[0]);
        String last = words[0];
        for(int i = 1; i<words.length; i++){

            if(useWord.contains(words[i])){
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                break;
            }
            if(last.charAt(last.length()-1) == words[i].charAt(0)){
                last = words[i];
                useWord.add(words[i]);
            }else{
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                break;
            }
    //        System.out.println(last.charAt(last.length()-1)+" "+words[i].charAt(0));

        }
     //   System.out.println(Arrays.toString(answer));
        return answer;
    }
}