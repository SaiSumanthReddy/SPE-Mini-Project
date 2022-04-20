package CalculatorTest;
import org.junit.Test;

import Calculator.Calculator;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    private static final double Epislon = 1e-15;

	@Test
	public void test_root() {
		assertEquals(calculator.root(25.0), 5.0, Epislon);
	}

	@Test
	public void test_fact() {
		assertEquals(calculator.factorial(4), 24, Epislon);
	}

	@Test
	public void test_log() {
		assertEquals(calculator.log(1), 0, Epislon);
	}

	@Test
	public void test_power() {
		assertEquals(calculator.power(3.0, 2.0), 9.0, Epislon);
	}

	@Test
	public void test_root_neg() {
		assertNotEquals(calculator.root(25.0), -5.0, Epislon);
	}

	@Test
	public void test_fact_neg() {
		assertNotEquals(calculator.factorial(4), -24, Epislon);
	}

	@Test
	public void test_log_neg() {
		assertNotEquals(calculator.log(1), 1, Epislon);
	}

	@Test
	public void test_power_neg() {
		assertNotEquals(calculator.power(3.0, 2.0), -9.0, Epislon);
	}
}
