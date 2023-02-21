package week3.sol1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testSolution(){
        Solution sol = new Solution();
        Assertions.assertEquals("Yes",sol.solution(new String[]{"i", "drink", "water"},new String[]{"want", "to"},new String[]{"i", "want", "to", "drink", "water"}));

    }
}
