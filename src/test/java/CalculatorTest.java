import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		assertEquals(calc.add("5.1", "6.2"), "11.3");
	}
	@Test
	public void testSub() {
		Calculator calc = new Calculator();
		assertEquals(calc.sub("5.1", "4.1"), "1.0");
	}
	@Test
	public void testDivi() {
		Calculator calc = new Calculator();
		assertEquals(calc.divi("5", "4"), "1.25");
	}
	@Test
	public void testMulti() {
		Calculator calc = new Calculator();
		assertEquals(calc.mult("5", "4"), "20.0");
	}
	@Test
	public void testDivi0() {
		Calculator calc = new Calculator();
		System.out.println(calc.divi("5", "0"));
		assertEquals(calc.divi("5", "0"), "Infinity");
	}
}
