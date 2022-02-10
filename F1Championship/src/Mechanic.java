/**
 * 
 */

/**
 * @author P17200246
 *
 */
public class Mechanic extends TeamMember {

	private String role;
	private Boolean atRace; /** Fields **/
	
	
	public Mechanic() {  /** Empty Constructor **/
		
	}

	/**
	 * @param details
	 * @param salary
	 */
	public Mechanic(Details details, Double salary, String role, Boolean atRace) { /** Constructor **/
		
		super(details, salary);
		this.role = role;
		this.atRace = atRace;
		
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the atRace
	 */
	public Boolean isAtRace() {
		return atRace;
	}

	/**
	 * @param atRace the atRace to set
	 */
	public void setAtRace(Boolean atRace) {
		this.atRace = atRace;
	}

	
	/**
	 * @return ToStringMethod
	 */
	@Override
	public String toString() {
		return "Mechanic [role=" + role + ", atRace=" + atRace + "]";
	}
	
	

}
