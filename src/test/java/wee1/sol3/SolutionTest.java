package wee1.sol3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import wee1.sol3.Solution;

public class SolutionTest {
    @Test
    public void testSolution(){
        Solution sol = new Solution();
        Assertions.assertArrayEquals(new int[] {3,3},sol.solution(3,new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}));
        Assertions.assertArrayEquals(new int[] {0,0},sol.solution(5,new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"}));
        Assertions.assertArrayEquals(new int[] {1,3},sol.solution(2,new String[]{"hello", "one", "even", "never", "now", "world", "draw"}));
    }
}
