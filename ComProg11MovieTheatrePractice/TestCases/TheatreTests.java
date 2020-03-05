import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TheatreTests {
    Theatre test;
    @Before
    public void setUp (){
        int[] firstRowAisleSeats={2,3,10,11};
        test=new Theatre(60, firstRowAisleSeats, 5);

    }
    @Test
    public void testPurchaseSeat(){
        test.purchaseSeat(0);
        assertEquals(test.getSize(), 59);
        assertTrue(test.isPurchased(10));
        test.purchaseSeat(10);
        assertEquals(test.getSize(), 59);


    }
    @Test
    public void testSeatRemaing(){
        IntegerSet comparison=new IntegerSet();
        for(int i=0; i<60 ; i++){
            comparison.insert(i+1);
        }
        test.purchaseSeat(15);
        comparison.remove(15);
        
    }
}
