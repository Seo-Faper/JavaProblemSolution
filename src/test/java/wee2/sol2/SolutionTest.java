package wee2.sol2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testSolution(){
        Solution sol = new Solution();
        Assertions.assertEquals(8,sol.solution(2, 10,new int[]{7,4,5,6}));
        Assertions.assertEquals(101,sol.solution(100, 100,new int[]{10}));


    }
}
