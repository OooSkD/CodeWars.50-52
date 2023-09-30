import org.junit.jupiter.api.Test;
import task50.Solution;
import task51.HumanReadableTime;
import task52.SpinWords;

import static org.junit.jupiter.api.Assertions.*;

public class tasks_tests {
    @Test
    public void BasicTests_test() {
        assertEquals("-6,-3-1,3-5,7-11,14,15,17-20", Solution.rangeExtraction(new int[] {-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20}));

        assertEquals("-3--1,2,10,15,16,18-20", Solution.rangeExtraction(new int[] {-3,-2,-1,2,10,15,16,18,19,20}));
    }
    @Test
    public void MakeReadable_test() {
        assertEquals( "00:00:05", HumanReadableTime.makeReadable(5));
        assertEquals( "00:01:00", HumanReadableTime.makeReadable(60));
        assertEquals( "23:59:59", HumanReadableTime.makeReadable(86399));
        assertEquals( "99:59:59", HumanReadableTime.makeReadable(359999));
    }

    @Test
    public void SpinWords_test() {
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    }

}
