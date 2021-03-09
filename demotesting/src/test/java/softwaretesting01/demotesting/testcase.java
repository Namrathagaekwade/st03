package softwaretesting01.demotesting;

import junit.framework.TestCase;

public class testcase extends TestCase {
private static calc calculator;
	
	
	public static void setup() {
		calculator = new calc();
	}
	
	
	public void testadd() {
		assertEquals(10,calculator.add(7, 3));
	}
	
}
