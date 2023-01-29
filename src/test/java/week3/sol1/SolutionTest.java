package week3.sol1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testSolution(){
        Solution sol = new Solution();
        Assertions.assertEquals(2,sol.solution(4, new int[]{4,10,15},new int[]{20,5,10},30));


    }
}
