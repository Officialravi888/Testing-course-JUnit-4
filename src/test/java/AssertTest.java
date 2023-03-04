import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AssertTest {
    @Test
    public void Test1(){
        assertTrue(true);
    }
    @Test
    public void Test2(){
        assertTrue(2==2);

    }
    @Test
    public void Test3(){
        assertTrue("abs".length()==3);
    }
}
