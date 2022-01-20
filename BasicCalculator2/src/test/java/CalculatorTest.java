import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.apisero.calculator.Calculator;

public class CalculatorTest {
	
	static Calculator cObj=null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cObj=new Calculator();
	}
	
	@Test
	public void testSum() {
		assertEquals(20,cObj.sum(10, 10));
	}
	@Test
	public void testSub() {
		assertTrue(0==cObj.sub(10, 10));
	}
	@Test
	public void testMul() {
		assertNotEquals(90,cObj.mul(10, 10));
	}
	@Test
	public void testDiv() {
		assertFalse(10==cObj.div(20, 10));
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		cObj=null;
	}

	

}
