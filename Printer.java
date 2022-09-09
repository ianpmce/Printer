package model;

public class Printer {
private int numOfPages;
private double amtOfInk;
private int maxPages = 100;
private double maxInk = 100.0;

/**
 * @param numOfPages
 * @param amtOfInk
 */
public Printer(int numOfPages, double amtOfInk) {
	super();
	if(numOfPages >= 100) {
		this.numOfPages = 100;
	} else {
		this.numOfPages = numOfPages;
	}
	if(amtOfInk >= 100.0) {
		this.amtOfInk = 100.0;
	}else {
		this.amtOfInk = amtOfInk;
	}
}

/**
 * @return the numOfPages
 */
public int getNumOfPages() {
	return numOfPages;
}


/**
 * @param numOfPages the numOfPages to set
 */
public void setNumOfPages(int numOfPages) {
	this.numOfPages = numOfPages;
}


/**
 * @return the amtOfInk
 */
public double getAmtOfInk() {
	return amtOfInk;
}


/**
 * @param amtOfInk the amtOfInk to set
 */
public void setAmtOfInk(double amtOfInk) {
	this.amtOfInk = amtOfInk;
}

/**
 * @return the maxPages
 */
public int getMaxPages() {
	return maxPages;
}

/**
 * @param maxPages the maxPages to set
 */
public void setMaxPages(int maxPages) {
	this.maxPages = maxPages;
}

/**
 * @return the maxInk
 */
public double getMaxInk() {
	return maxInk;
}

/**
 * @param maxInk the maxInk to set
 */
public void setMaxInk(double maxInk) {
	this.maxInk = maxInk;
}




}
