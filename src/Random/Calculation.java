
package Random;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/* DAILY CODE DAY #21 
 * Introduction to JUnit: Test if the given function returns the expected result
 * NOTE: JUnit classes are usually NOT to be placed within the same file */
public class Calculation {
	
	public BigDecimal calculate(double operand) {
		BigDecimal ret;
		
		double calculatedValue = operand * 100 / Math.PI;
		
		ret = BigDecimal.valueOf(calculatedValue);
		return ret;
	}

}

class CalculationTest {
	
	private Calculation classToTest;
	
	// Annotation ensures that this function is called before executing the Test
	@BeforeEach
	public void setUp() throws Exception {
		classToTest = new Calculation();		
	}
	
	// Testcase
	@Test
	void testCalculate() {
		double initialValue = 1.1;
		
		BigDecimal expectedValue = BigDecimal.valueOf(1.1 * 100 / Math.PI);
		
		assertTrue(expectedValue.equals(classToTest.calculate(initialValue)));
	}
}





