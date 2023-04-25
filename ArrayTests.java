import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3,4 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 4,3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {2,3,4};
    assertArrayEquals(new int[]{ 4,3,2}, ArrayExamples.reversed(input1));
  }


  @Test
  public void testaverageWithoutLowest(){
    double[] input={1,1,1,1,2,3,4,5};
    assertEquals(null, 3.5,ArrayExamples.averageWithoutLowest(input), 0); 
    
  }
}
