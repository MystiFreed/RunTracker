package beans;

public interface RunInterface {
	
	public Run getRun(Integer runID);
	public void combineRuns(Integer sourceRunID, Integer targetRunID, int run2Length);
}
