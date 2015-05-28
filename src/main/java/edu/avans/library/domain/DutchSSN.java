package edu.avans.library.domain;

public class DutchSSN {
	// Attributes
	private String ssn;
	private final static String DEFAULT_VALUE = "unknown";
	
	// Constructor
	
	// Default
	public DutchSSN() {
		ssn = DEFAULT_VALUE;
	}
	
	public DutchSSN(String ssn) {
		this.ssn = ssn;
	}
	
	// Methods
	public String getSSN() {
		return ssn;
	}
	
	private boolean isValideSSN(int value) {
		if(value <= 9999999 || value > 999999999) {
			return false;
		}      
		int sum = -1 * value % 10;
 
        for (int multiplier = 2; value > 0; multiplier++) {
            int val = (value /= 10) % 10;
            sum += multiplier * val;
        }
 
        return sum != 0 && sum % 11 == 0;
	}

	
	public void setSSN(int value) throws Invalid_SSN_Exception {
		if(isValideSSN(value)) {
			this.ssn = String.valueOf(value);
		} else {
			throw new Invalid_SSN_Exception(
				"geen juiste waarde");
			}
		}
}
