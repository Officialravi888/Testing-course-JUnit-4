import org.example.exemple1.StringUtilities;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilitiesTest {
    @Test
    public void testValue(){
        String a="hello";
        String b="xyz";
        String c="";
        String d="Ravi";
        StringUtilities s=new StringUtilities();
        assertEquals(0,s.vowelCount(a));
        assertEquals(0,s.vowelCount(b));
        assertEquals(0,s.vowelCount(c));
        assertEquals(0,s.vowelCount(a));
    }
    @Test
    public  void ValueTest() {
        String a = "aple";
        String b = "a";
        String c = "Apple";
        StringUtilities ss1 = new StringUtilities();
        assertFalse(ss1.isCapitalized(b));
        assertFalse(ss1.isCapitalized(a));
        assertTrue(ss1.isCapitalized(c));
}
}




