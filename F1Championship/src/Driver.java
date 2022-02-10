/**
 * 
 */

/**
 * @author P17200246
 *
 */
public class Driver extends TeamMember {
	
	int points;  /** Fields **/
	
	
	/**
	 * @param details
	 * @param salary
	 * @param points
	 */
	public Driver (Details details, Double salary, int points) {  /** Constructor **/
		
		super(details, salary);
		this.points = points;
				
	}
	
	/**
	 * Add points
	 */
	
	public void addPoints(int pointstoadd) {
		
		this.points += pointstoadd;
	}

	/**
	 * @return the points
	 */
	public int getPoints() {
		return points;
	}

	
	/**
	 * @return ToString Function
	 */
	@Override
	public String toString() {
		return "Driver [points=" + points + "]";
	}

	
	
}
