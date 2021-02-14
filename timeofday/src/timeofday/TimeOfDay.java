package timeofday;

/**
 * @invar uren should be between 0 and 23.
 *  | 0 <= getUren() && 23 >= getUren()
 *  
 * @invar minuten should be between 0 and 59.
 *  | 0 <= getMinuten() &&  getMinuten()  <= 59 
*/

public class TimeOfDay {
	
	/**
	 * @invar minutesSinceMidnight should be between 0 and 1439.
	 *   |  0 <= minutesSinceMidnight && 1439 >= minutesSinceMidnight
	 */
	public int minutesSinceMidnight;

	/**
	 * @pre uren should be between 0 and 23.
	 *  | 0 <= uren && 23 >= uren
	 * @pre minuten should be between 0 and 59.
	 *  | 0 <= minuten &&  minuten  <= 59 
	 * @post minutesSinceMidnight should be between 0 and 1439.
	 *  |  0 <= minutesSinceMidnight && 1439 >= minutesSinceMidnight
	 */
	public TimeOfDay (int uren, int minuten) {
		minutesSinceMidnight = (60*uren) + minuten;	
	}
	/**
	 * @pre uren should be between 0 and 23.
	 *  | 0 <= uren && 23 >= uren
	 * @post minutesSinceMidnight should be between 0 and 1439.
	 *  |  0 <= minutesSinceMidnight && 1439 >= minutesSinceMidnight
	 */
	
	public void setUren (int uren) {
		minutesSinceMidnight = (minutesSinceMidnight%60) + (60*uren);
	}
	
	/**
	 *@pre minuten should be between 0 and 59.
	 *  | 0 <= minuten &&  minuten  <= 59 
	 */
	
	public void setMinuten(int minuten) {
		int uren = minutesSinceMidnight/60 ;
		minutesSinceMidnight = uren*60 + minuten;
	}
	
	public int getUren() {
		return minutesSinceMidnight/60; 
	}
	
	public int getMinuten() {
		return minutesSinceMidnight%60;
	}
} 

