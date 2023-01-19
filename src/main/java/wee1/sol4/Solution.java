package wee1.sol4;

import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        String regex = "[^"+skill+"]";
        return (int)Arrays.stream(skill_trees).filter(e -> skill.startsWith(e.replaceAll(regex,""))).count();
    }
}