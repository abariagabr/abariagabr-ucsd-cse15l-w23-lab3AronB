import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	
    
    int[] input2 = { 6,7,8,9 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 9,8,7,6 }, input2);
  }


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{}, ArrayExamples.reversed(input1));
  }
}
