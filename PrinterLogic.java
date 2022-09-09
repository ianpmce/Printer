package model;

public class PrinterLogic {
	
	public int checkPaper(Printer printer) {
		int paper = 0;
		paper = printer.getNumOfPages();
		return paper;
	}
	
	public double checkInk(Printer printer) {
		double ink = 0;
		ink = printer.getAmtOfInk();
		return ink;
	}
	
	public void fillPrinter(Printer printer) {
		printer.setNumOfPages(printer.getMaxPages());
		printer.setAmtOfInk(printer.getMaxInk());
		
	}
	
	public void fillPaper(Printer printer) {
		printer.setNumOfPages(printer.getMaxPages());
	}
	
	public void fillInk(Printer printer) {
		printer.setAmtOfInk(printer.getMaxInk());
	}
	
	public void print(Printer printer) {
		printer.setNumOfPages(printer.getNumOfPages() - 1);
		printer.setAmtOfInk(printer.getAmtOfInk() - 0.5);
	}
	
	public boolean checkPrinterFull(Printer printer) {
		boolean isFull;
		if(printer.getNumOfPages() == printer.getMaxPages()) {
			isFull = true;
		} else { 
			isFull = false;	
		}
		if(printer.getAmtOfInk() == printer.getMaxInk()) {
			isFull = true;
		} else {
			isFull = false;
		}
		return isFull;
	}
	

}
