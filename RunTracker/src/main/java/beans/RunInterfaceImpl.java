// Mysti Freed, mrfreed@dmacc.edu
// Run implementation without database support.

package beans;

public class RunInterfaceImpl implements RunInterface{
	
	private RunDao runDao;
	
	/**
	 * getter for runDao object
	 * @return object
	 */
	public RunDao getRunDao() {
		return runDao;
	}
	
	/**
	 * setter for the runDao object
	 * @param runDao
	 */
	public void setRunDao(RunDao runDao) {
		this.runDao = runDao;
	}
	
	/**
	 * This method will find a run based on the runID entered in the constructor
	 */
	public Run getRun(Integer runID) {
		return runDao.runFinder(runID);
	}

	/**
	 * This method will combine the run length for two runs completed on the same day
	 */
	public void combineRuns(Integer sourceRunID, Integer targetRunID, int run2Length) {
		Run sourceRun = runDao.runFinder(sourceRunID);
		Run targetRun = runDao.runFinder(targetRunID);
		sourceRun.setRunLength(0);
		targetRun.setRunLength(targetRun.getRunLength() + run2Length);
		runDao.updateRun(sourceRun); 
		runDao.updateRun(targetRun); 
	}
	
	

}
