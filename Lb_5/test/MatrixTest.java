import org.junit.*;
import org.junit.jupiter.api.Assertions;

public class MatrixTest {
	
	@Before
	public void setUp() {
	}
	
	@Test
	public void testConstructorWithParam() {
		Matrix matrix;
		double[][] actualMatrix = {{1,2,3}, {4,5,6}, {7,8,9}};
		double[][] expectedResult = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		matrix = new Matrix(actualMatrix);
		Assertions.assertArrayEquals(expectedResult, matrix.getMatrix());
	}
	
	@Test
	public void testCreateMatrix() {
		Matrix matrix = new Matrix();
		Assertions.assertNotNull(matrix.createMatrix());
	}

	@Test
	public void testChangeMatrix() {
		Matrix matrix;
		double[][] actualMatrix = {{1,2,3}, {4,5,6}, {7,8,9}};
		double[][] expectedResult = {{9,7,8}, {3,1,2}, {6,4,5}};
		
		matrix = new Matrix(actualMatrix);
		Assertions.assertArrayEquals(expectedResult, matrix.changeMatrix());
	}

	@Test
	public void testFindMaxElem() {
		Matrix matrix;
		double[][] actualMatrix = {{1,2,3}, {4,5,6}, {7,8,9}};
		double expectedResult = 9;
		
		matrix = new Matrix(actualMatrix);
		Assertions.assertEquals(expectedResult, matrix.findMaxElem(actualMatrix));
	}

	@Test
	public void testSwapColls() {
		Matrix matrix;
		double[][] actualMatrix = {{1,2,3}, {4,5,6}, {7,8,9}};
		double[][] expectedResult = {{2,1,3}, {5,4,6}, {8,7,9}};
		
		matrix = new Matrix(actualMatrix);
		matrix.swapColls(1);
		Assertions.assertArrayEquals(expectedResult, matrix.getMatrix());
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testSwapCollsWithException() {
		Matrix matrix;
		double[][] actualMatrix = {{1,2,3}, {4,5,6}, {7,8,9}};
		double[][] expectedResult = {{2,1,3}, {5,4,6}, {8,7,9}};
		
		matrix = new Matrix(actualMatrix);
		matrix.swapColls(4);
		Assertions.assertArrayEquals(expectedResult, matrix.getMatrix());
	}

	@Test
	public void testSwapRows() {
		Matrix matrix;
		double[][] actualMatrix = {{1,2,3}, {4,5,6}, {7,8,9}};
		double[][] expectedResult = {{4,5,6}, {1,2,3}, {7,8,9}};
		
		matrix = new Matrix(actualMatrix);
		matrix.swapRows(1);
		Assertions.assertArrayEquals(expectedResult, matrix.getMatrix());
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testSwapRowsWithException() {
		Matrix matrix;
		double[][] actualMatrix = {{1,2,3}, {4,5,6}, {7,8,9}};
		double[][] expectedResult = {{4,5,6}, {1,2,3}, {7,8,9}};
		
		matrix = new Matrix(actualMatrix);
		matrix.swapRows(4);
		Assertions.assertArrayEquals(expectedResult, matrix.getMatrix());
	}
}
