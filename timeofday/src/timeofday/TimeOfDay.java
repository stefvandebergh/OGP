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
	 * @invar uren should be between 0 and 23.
	 *  | 0 <= uren && 23 >= uren
	 */
	
	private int uren;

	/**
	 * @invar minuten should be between 0 and 59.
	 *  | 0 <= minuten &&  minuten  <= 59 
	 */
	
	private int minuten;
	
	/**
	 * @pre uren should be between 0 and 23.
	 *  | 0 <= uren && 23 >= uren
	 * @pre minuten should be between 0 and 59.
	 *  | 0 <= minuten &&  minuten  <= 59 
	 */
	public TimeOfDay (int uren, int minuten) {
		setUren(uren);
		setMinuten(minuten);	
	}
	/**
	 * @pre uren should be between 0 and 23.
	 *  | 0 <= uren && 23 >= uren
	 */
	
	public void setUren (int uren) {
		this.uren = uren ;
	}
	
	/**
	 *@pre minuten should be between 0 and 59.
	 *  | 0 <= minuten &&  minuten  <= 59 
	 */
	
	public void setMinuten(int minuten) {
		this.minuten = minuten;
	}
	
	public int getUren() {
		return uren; 
	}
	
	public int getMinuten() {
		return minuten;
	}
} 

