import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testDivisibleBy3ButNotBy5ShouldPrintNumberAndFizz () throws Exception {
		FizzBuzz fizzBuzz = new FizzBuzz(9, 9);
		String result = fizzBuzz.calculate();
		assertEquals("9 fizz", result);
	}
	
	@Test
	public void testDivisibleBy5ButNotBy3ShouldPrintNumberAndBuzz () throws Exception {
		FizzBuzz fizzBuzz = new FizzBuzz(10, 10);
		String result = fizzBuzz.calculate();
		assertEquals("10 buzz", result);
	}
	
	@Test
	public void testDivisibleBy3AndBy5ShouldPrintNumberAndFizzBuzz () throws Exception {
		FizzBuzz fizzBuzz = new FizzBuzz(15, 15);
		String result = fizzBuzz.calculate();
		assertEquals("15 fizzBuzz", result);
	}
	
	@Test
	public void testNotDivisibleBy3OrBy5ShouldPrintNumber () throws Exception {
		FizzBuzz fizzBuzz = new FizzBuzz(7, 7);
		String result = fizzBuzz.calculate();
		assertEquals("7", result);
	}
	
	@Test(expected=BiggerInitialValueException.class)
	public void testInitialNumberIsBiggerShouldThrowError () throws Exception {
		FizzBuzz fizzBuzz = new FizzBuzz(10, 9);
	}
	
	
}
