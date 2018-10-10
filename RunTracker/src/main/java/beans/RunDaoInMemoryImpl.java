// Mysti Freed, mrfreed@dmacc.edu
// Run implementation without database support.

package beans;

import	java.util.ArrayList;
import	java.util.HashMap;
import	java.util.List;
import	java.util.Map;

public class RunDaoInMemoryImpl implements RunDao{
	
	/**
	 * This method sets up the HashMap for the RunDaoInMemoryImpl class
	 */
	private Map<Integer, Run> runsMap = new HashMap<Integer, Run>();
	
	{
		Run run1 = new Run(1, "10/1/2018", "morning", 45, true);
		Run run2 = new Run(2, "10/2/2018", "evening", 50, false);
		
		runsMap.put(run1.getRunID(), run1);
		runsMap.put(run2.getRunID(), run2);
	}

	/**
	 * This method provides the HashMap with the location to addNew
	 */
	public void addNew(Run run) {
		runsMap.put(run.getRunID(), run);		
	}

	/**
	 * This method provides the HashMap with the location to updateRun
	 */
	public void updateRun(Run run) {
		runsMap.put(run.getRunID(), run);		
	}

	/**
	 * This method provides the HashMap with the location to removeRun
	 */
	public void removeRun(int runID) {
		runsMap.remove(runID);		
	}

	/**
	 * This method provides the HashMap with the location of the Run for runFinder
	 */
	public Run runFinder(int runID) {
		return runsMap.get(runID);
	}

	/**
	 * This method provides the HashMap with direction on how to generateList
	 */
	public List<Run> generateList(List<Integer> runIDs) {
		List<Run> runs = new ArrayList<Run>();
		for(Integer id: runIDs) {
			runs.add(runsMap.get(id));
		}
		return runs;
	}

	/**
	 * This method provides the HashMap with direction on how to provide qualifiedRuns based on
	 * boolean goodOrBad value
	 */
	public List<Run> qualifiedRuns(boolean goodOrBad) {
		List<Run> runs = new ArrayList<Run>();
		for(Run run: runsMap.values()) {
			if(goodOrBad == (run.isGoodRun())) {
				runs.add(run);
			}
		}
		return runs;
	}
}
