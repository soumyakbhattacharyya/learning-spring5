package sb.algorithm;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayTest {

	@Test
	public void testTwoSum() {
		assertArrayEquals(new int[] { 0, 2 }, Array.twoSum(new int[] { 2, 7, 11, 15 }, 13));
	}

	@Test
	public void testMaxArea() {
		assertEquals(56, Array.maxArea(new int[] { 1, 12, 3, 56 }));
	}

}
