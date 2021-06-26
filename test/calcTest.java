package test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import test.Calc;

class calcTest {
	
	Calc c;

	@BeforeEach
	void setUp() throws Exception {
		c= new Calc();
	}


	@Test
	void testAdd() {
		assertEquals(c.add(40,2),42, "math is wrong!");
	}

	@Test
	void testSub() {
		assertEquals(c.sub(42,2),40);
	}

	@Test
	void testMulti() {
		assertEquals(c.multi(5,8),40);
	}

	@Test
	void testDivide() {
		assertEquals(c.divide(42,2),21);
		assertThrows(ArithmeticException.class,()->{c.divide(4,0);});
		}

}
