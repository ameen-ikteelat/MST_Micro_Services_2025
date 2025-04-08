import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mst.Calculator;

public class CalculatorTest {
	
	private Calculator claculator; 
	int actual , expected ;
	@BeforeEach
	public void setUp()
	{
		claculator = new Calculator();
	}
	
	@Test
	public void testAddition()
	{
		 actual = claculator.add(2, 3);
		 expected = 5;
		assertEquals(actual , expected , "2+3=5");
	}
	
	@Test
	public void testSubtract()
	{
		actual = claculator.sub(5, 2); 
		expected = 3;
		assertEquals(expected,actual , "5 - 2 should equal 3");
	}
	
	
	@Test
	public void testSubtract2()
	{
		actual = claculator.sub(2,5); 
		expected = 3;
		assertEquals(expected,actual , "2 - 5should equal 3");
	}
	
	@Test
	public void testMull()
	{
		actual = claculator.mul(3, 4);
		expected =12;
		assertEquals(actual, expected ,"3 * 4 should equal 12");
	}
	
	@Test
	public void testDiv() {
		actual = claculator.divide(12, 2);
		expected =  6;
		assertEquals(actual,expected);
	}
	
	@Test
	public void testDivByZero() {
		Exception exception = assertThrows(IllegalArgumentException.class,
				() ->  claculator.divide(12, 0));
		
		String expectedMessage =new String("Division by zero is not allowed");
		String actualMessage = new String (exception.getMessage());
		assertEquals(expectedMessage, actualMessage);
		assertTrue(actualMessage.contains(expectedMessage));
	}
}
