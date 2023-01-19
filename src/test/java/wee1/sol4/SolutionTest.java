package wee1.sol4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import wee1.sol4.Solution;

public class SolutionTest {
    @Test
    public void testSolution(){
        Solution sol = new Solution();
        Assertions.assertEquals(2,sol.solution("CBD",new String[]{"BACDE", "CBADF", "AECB", "BDA"}));

    }
}
