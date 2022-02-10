import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 */

/**
 * @author P17200246
 *
 */
public class Team implements Iterable<Mechanic>, Comparable<Team> {

	private ArrayList<Mechanic> members;
	private Driver driver1;
	private Driver driver2;   /** Fields **/
	private String name;
	private int points;
	
	public Team() {
		
	}
	
	
	/**
	 * @param driver1
	 * @param driver2
	 * @param name
	 */
	public Team(Driver driver1, Driver driver2, String name) {  /** Constructor **/
		
		this.driver1 = driver1;
		this.driver2 = driver2;
		this.name = name;
		this.members = new ArrayList<Mechanic>();
	}
	
	
	
	
	/**
	 * @return the driver1
	 */
	public Driver getDriver1() {
		return driver1;
	}

	/**
	 * @param driver1 the driver1 to set
	 */
	public void setDriver1(Driver driver1) {
		this.driver1 = driver1;
	}

	/**
	 * @return the driver2
	 */
	public Driver getDriver2() {
		return driver2;
	}

	/**
	 * @param driver2 the driver2 to set
	 */
	public void setDriver2(Driver driver2) {
		this.driver2 = driver2;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the points
	 */
	public int getPoints() {
		return points;
	}
	
	/**
	 * calculate total team points
	 */
	public void calculatePoints() {
		
		this.points = driver1.getPoints() + driver2.getPoints();
		
	}
	
	/**
	 * add mechanic to team
	 */
	public void add(Mechanic newMechanic){
		
		this.members.add(newMechanic);
	}
	
	
	/**
	 * remove mechanic
	 */
	public void remove(int mechanicIndex){
		
		this.members.remove(mechanicIndex);
	}
	
	
	/**
	 * @return size of array
	 */
	public int size() {
		
		return this.members.size();
	}
	
	
	/**
	 * Comparator Interface
	 */
	@Override
	public int compareTo(Team o) {
		
		return o.points - this.points;
	}

	/**
	 * Iterator Interface
	 */
	@Override
	public Iterator<Mechanic> iterator() {
		
		return this.members.iterator();
	}

	/**
	 * ToString Interface
	 */
	@Override
	public String toString() {
		return "Team [members=" + members + ", driver1=" + driver1 + ", driver2=" + driver2 + ", name=" + name
				+ ", points=" + points + "]";
	}
	
	

}
