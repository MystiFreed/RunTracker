// Mysti Freed, mrfreed@dmacc.edu
// RunDao interface, specifying the methods that apply to Run.java

package beans;

import java.util.List;

public interface RunDao {
	
	public void addNew(Run run);
	public void updateRun(Run run);
	public void removeRun(int runID);
	public Run runFinder(int runID);
	public List<Run> generateList(List<Integer> runIDs);
	public List<Run> qualifiedRuns(boolean goodOrBad);
}
