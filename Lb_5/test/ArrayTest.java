import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayTest {

	@Before
	public void setUp() {
	}

	@Test
	public void testArrayIntArray() {
		Array array;
		int[] actualArray = {1,5,2,6,8,4,4,4};
		int[] expectedResult = {1,5,2,6,8,4,4,4};
		
		array = new Array(actualArray);
		Assertions.assertArrayEquals(expectedResult, array.getArray());
	}

	@Test
	public void testCalculateTwoDifferentNumbers() {
		Array array;
		int[] actualArray = {1,5,2,6,8,4,4,4};
		int expectedResult = 4;
		
		array = new Array(actualArray);
		array.calculate();
		Assertions.assertEquals(expectedResult, array.getCountDif());
	}

	@Test
	public void testCalculateTwoEqualsNumbers() {
		Array array;
		int[] actualArray = {4,5,2,6,8,4,4,4};
		int expectedResult = 4;
		
		array = new Array(actualArray);
		array.calculate();
		Assertions.assertEquals(expectedResult, array.getCountDif());
	}
}
