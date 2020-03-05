import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {


    @Test

    publicvoidinsertAlreadyThere(){

        assertTrue(testSet.contains(8));
        testSet.insert(8);
        assertTrue(testSet.contains(8));

    }

    @Test

    publicvoidremoveNotThere(){

        assertFalse(testSet.contains(7));
        testSet.remove(7);
        assertFalse(testSet.contains(7) );


    }

    @Test

    publicvoidremoveAlreadyThere(){
        assertTrue(testSet.contains(9));
        testSet.remove(9);
        assertFalse(testSet.contains(9));

    }
}
