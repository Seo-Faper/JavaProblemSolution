package wee2.sol1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testSolution(){
        Solution sol = new Solution();
        Assertions.assertArrayEquals(new int[] {2,1},sol.solution(new int[] {93,30,55}, new int[]{1,30,5}));
        Assertions.assertArrayEquals(new int[] {1, 3, 2},sol.solution(new int[] {95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1}));
        Assertions.assertArrayEquals(new int[] {1, 1, 1, 4},sol.solution(new int[] {99, 98, 97, 96, 99, 98, 97}, new int[]{1, 1, 1, 1, 1, 1, 1}));
    }
}
