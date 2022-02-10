import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 */

/**
 * @author P17200246
 *
 */
public class F1ChampionshipTest {

	/**
	 * @param args
	 */
	
	private static Championship testchampionship = new Championship(); /** New Instance **/
	private static ArrayList<Team> testteams = new ArrayList<Team>(); /** Array Initialisation **/
	
	public static void main(String[] args) {
		
		UseCase1();
		UseCase2();   /** Runs Each Use Case **/
		UseCase3();
		UseCase4();

	}
	
	private static void UseCase1() {  /** Creates 5 Teams with 2 drivers and mechanics with placeholder names **/
	
		for( int teamIndex = 0; teamIndex < 5; teamIndex++ )
		{
			Driver driver1 = new Driver(new Details("Driver1", "42 Wallaby Way, Sydney"), ThreadLocalRandom.current().nextDouble(1000.0, 50000.0), 0);
			Driver driver2 = new Driver(new Details("Driver2", "43 Wallaby Way, Sydney"), ThreadLocalRandom.current().nextDouble(1000.0, 50000.0), 0);
			
			driver1.addPoints(ThreadLocalRandom.current().nextInt(1, 30));
			driver2.addPoints(ThreadLocalRandom.current().nextInt(1, 30));
			
			Team newTeam = new Team(driver1, driver2, String.format("Team %d", teamIndex));

		    for( int mechanicIndex = 0; mechanicIndex < 4; mechanicIndex++ )
		    {
		        newTeam.add(new Mechanic(new Details("Awesome Driver Name", "43 Wallaby Way, Sydney"), ThreadLocalRandom.current().nextDouble(1000.0, 20000.0), "Handyman", true));
		    }
		    
		    testteams.add(newTeam);
		}
	}
	
	
	private static void UseCase2() {  /** Adds the 5 new teams to a championship and orders them based on points with first place 
	 									  printed first**/
		for(Team team : testteams) {
			
			testchampionship.add(team);
			team.calculatePoints();
		}
		
		testchampionship.sortTeamsOnPoints();
	}
	
	
	private static void UseCase3() { /** Outputs championship standings with placeholder team name and total points with placeholder
										 driver names and individual points  **/
		Iterator<Team> iterator = testchampionship.iterator();
		while(iterator.hasNext()) {
			
			Team selectedteam = iterator.next();
			System.out.println(String.format("%s has %d points",selectedteam.getName(),selectedteam.getPoints()));
			System.out.println(String.format("	%s has %d individual points",selectedteam.getDriver1().getDetails().getFullName(),selectedteam.getDriver1().getPoints()));
			System.out.println(String.format("	%s has %d individual points",selectedteam.getDriver2().getDetails().getFullName(),selectedteam.getDriver2().getPoints()));
			
		}
		
		

	}
	
	private static void UseCase4() {  /** Combines total salary of mechanics and drivers for winning team and outputs that with number of
										  team members **/
		Team winningteam = testchampionship.get(0);
		int totalsalary = 0;
		
		Iterator<Mechanic> iterator = winningteam.iterator();
		while(iterator.hasNext()) {
			Mechanic selectedmechanic = iterator.next();
			totalsalary += selectedmechanic.getSalary();
		}
		
		totalsalary += (winningteam.getDriver1().getSalary() + winningteam.getDriver2().getSalary());
		
		System.out.println(String.format("\n%s earns a combined salary of $%d (with 6 members)", winningteam.getName(), totalsalary));
		
	}
}	
