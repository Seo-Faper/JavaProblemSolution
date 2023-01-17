package wee1.sol2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import wee1.sol2.Solution;

public class SolutionTest {
    @Test
    public void testSolution(){
        wee1.sol2.Solution sol = new Solution();
        Assertions.assertEquals(7,sol.solution("ULURRDLLU"));
        Assertions.assertEquals(7,sol.solution("LULLLLLLU"));
        Assertions.assertEquals(1,sol.solution("UDUDUDUD"));
    }
}
