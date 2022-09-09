package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author iman0
 *
 */
public class PrinterTest1 {
	PrinterLogic logic1 = new PrinterLogic();
	Printer printer1 = new Printer(50,50.0);

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testCheckPaper() {
		int paper = logic1.checkPaper(printer1);
		assertEquals(50,paper);
		
	}
	
	
	@Test
	public void testFillPrinter() {
		logic1.fillPrinter(printer1);
		int paper = logic1.checkPaper(printer1);
		double ink = logic1.checkInk(printer1);
		
		assertEquals(100,paper);
		assertEquals(100.0,ink, 100.0);
		
	}
	
	@Test
	public void testFillPaper() {
		logic1.fillPaper(printer1);
		int paper = logic1.checkPaper(printer1);
		assertEquals(100,paper);
	}
	
	@Test
	public void testcheckPrinterFull() {
		assertFalse(logic1.checkPrinterFull(printer1));
	}

}
