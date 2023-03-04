import org.example.exemple1.Demo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DemoTest {
    @Test
    public void testGetArea(){
        int expected=6;
        Demo DemoTestApp = null;
        int actual= DemoTestApp.getArea(2,3);
        assertEquals(expected,actual);
        assertThat();
    }

    private void assertThat() {
    }

}
