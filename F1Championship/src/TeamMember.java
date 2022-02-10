import java.util.Objects;

/**
 * 
 */

/**
 * @author P17200246
 *
 */
public class TeamMember {

	private Details details;  /** Fields **/
	private Double salary;
	
	public TeamMember () { /** Empty Constructor **/
		
	}
	
	
	/**
	 * @param details
	 * @param salary
	 */
	public TeamMember (Details details, Double salary) {  /** Constructor **/
		
		this.details = details;
		this.salary = salary;
	}

	/**
	 * @return the details
	 */
	public Details getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(Details details) {
		this.details = details;
	}

	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	/**
	 * @return ToString Function
	 */
	@Override
	public String toString() {
		return "TeamMember [details=" + details + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(details, salary);
	}

	/**
	 * Equals Function
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TeamMember other = (TeamMember) obj;
		return Objects.equals(details, other.details) && Objects.equals(salary, other.salary);
	}
	
	
}
