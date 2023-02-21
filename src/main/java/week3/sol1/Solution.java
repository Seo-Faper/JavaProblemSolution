package week3.sol1;


class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int idx1 = 0;
        int idx2 = 0;
        for(String i : goal){

            if(i.equals(cards1[idx1])){
                if(idx1 < cards1.length)
                    idx1++;
            }else if(i.equals(cards2[idx2])){
                if(idx2 < cards2.length) idx2++;
            }else{
                System.out.println("No");
                break;
            }
        }
        return answer;
    }
}