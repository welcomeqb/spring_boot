package com.snowbirdit.testCoreJava;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.snowbirdit.corejava.Calculator;

class CalculatorTest1 {

	@Test
	void testAddInt() {
		
		Calculator calculator = new Calculator();
		
		assertEquals(14, calculator.addInt(6, 8));
	}

	@Test
	@DisplayName("AssertTrue")
	void testAssertTrue() {
		
		
		Calculator calculator = new Calculator();
		assertTrue(calculator.addInt(6, 8)>13);
	}
	
	@Test
	@Disabled
	void testDisabled() {
		
		assertTrue(2>1);
	}
	
	
}
