package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrinterTest2 {
	PrinterLogic logic2 = new PrinterLogic();
	Printer printer2 = new Printer(100,100.0);

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testCheckInk() {
		double ink = logic2.checkInk(printer2);
		assertEquals(100.0,ink,100.0);
		
	}
	
	
	@Test
	public void testFillPrinter() {
		logic2.fillPrinter(printer2);
		int paper = logic2.checkPaper(printer2);
		double ink = logic2.checkInk(printer2);
		
		assertEquals(100,paper);
		assertEquals(100.0,ink, 100.0);
		
	}
	
	@Test
	public void testFillInk() {
		logic2.fillInk(printer2);
		double ink = logic2.checkInk(printer2);
		assertEquals(100.0,ink,100.0);
	}
	
	@Test
	public void testcheckPrinterFull() {
		assertTrue(logic2.checkPrinterFull(printer2));
	}

}
