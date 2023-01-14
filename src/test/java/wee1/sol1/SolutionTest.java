package wee1.sol1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SolutionTest {
    @Test
    public void testSolution(){
        Solution sol = new Solution();
        Assertions.assertEquals(1,sol.solution(new int[] {1,2,3,4}));
        Assertions.assertEquals(4,sol.solution(new int[] {1,2,7,6,4}));
    }
}