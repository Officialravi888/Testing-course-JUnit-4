import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Practice01Test {
    int x=2;
    int y=2;
    int z=3;

    @Test
    public void PracticeTest(){
        assertEquals(x,y);
    }
    public void Test1(){
        assertNotEquals(y,z);
    }
}
