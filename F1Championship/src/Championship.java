import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * 
 */

/**
 * @author P17200246
 *
 */
public class Championship implements Iterable<Team> {
	
	private ArrayList<Team> teams;  /** Array Initialisation **/
	
	public Championship() {   /** Constructor **/
		
		this.teams = new ArrayList<Team>();
	}

	/**
	 * Sort Via Points
	 */
	public void sortTeamsOnPoints() {
		
		Collections.sort(teams);
	}
	
	/**
	 * Add team to championship
	 */
	public void add(Team team) {
		
		this.teams.add(team);
	}
	
	/**
	 * Remove team from championship
	 */
	public void remove(int index) {
		
		this.teams.remove(index);
	}
	
	/**
	 * @return Get Team index
	 */
	public Team get(int index) {
		
		return this.teams.get(index);
	}
	
	
	/**
	 *  @return Team index
	 */
	public int size() {
		
		return this.teams.size();			
	}
	
	/**
	 * Clear Team
	 */
	public void clear() {
		
		this.teams.clear();
	}
	
	/**
	 * Iterable Interface
	 */
	public Iterator<Team> iterator() {
		
		return this.teams.iterator();
	}

	/**
	 * @return ToString method
	 */
	@Override
	public String toString() {
		return "Championship [teams=" + teams + "]";
	}
	
	
}
