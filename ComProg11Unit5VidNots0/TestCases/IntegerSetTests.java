import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class IntegerSetTests {
    IntegerSet testSet;
    @Before
    public void setup(){
        testSet=new IntegerSet();
    }
    @Test
    public void testInsertNotThere(){
        //check number is not already in set
        assertEquals(testSet.size(), 0);
        assertFalse(testSet.contains(3));
                //insert a number

        //check the number is in the set
    }
}
