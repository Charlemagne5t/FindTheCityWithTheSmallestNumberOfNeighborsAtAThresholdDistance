import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void findTheCityTest1(){
        int n = 4;
        int[][] edges = {
                {0,1,3},
                {1,2,1},
                {1,3,4},
                {2,3,1}
        };
        int distanceThreshold = 4;
        int expected = 3;
        int actual = new Solution().findTheCity(n, edges,distanceThreshold);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findTheCityTest2(){
        int n = 5;
        int[][] edges = {
                {0,1,2},
                {0,4,8},
                {1,2,3},
                {1,4,2},
                {2,3,1},
                {3,4,1}
        };
        int distanceThreshold = 2;
        int expected = 0;
        int actual = new Solution().findTheCity(n, edges,distanceThreshold);

        Assert.assertEquals(expected, actual);
    }
}
