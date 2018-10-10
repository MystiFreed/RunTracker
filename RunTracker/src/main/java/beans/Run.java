// Mysti Freed, mrfreed@dmacc.edu
// Run class, used to capture date, time of day, length and the quality of a run.

package beans;

import java.sql.Date;

public class Run {
	
	private int runID; // identifier for the run
	private String runDate; // entry of date in format mm/dd/yr
	private String timeOfDay; // entry of time of day: morning/afternoon/evening
	private int runLength; // length of run in number of minutes
	private boolean goodRun; // boolean: yes (good run) or no (bad run)

	/**
	 * default constructor for the Run class
	 */
	public Run() {
	}
	
	/**
	 * constructor for the Run class
	 * @param rd = runDate
	 * @param tod = timeOfDay
	 * @param rl = runLength
	 * @param gr = goodRun
	 */
	public Run(int id, String rd, String tod, int rl, boolean gr) {
		this.runID = id;
		this.runDate = rd;
		this.timeOfDay = tod;
		this.runLength = rl;
		this.goodRun = gr;
	}
	
	/**
	 * getter for runID
	 * @return int
	 */
	public int getRunID() {
		return runID;
	}

	/**
	 * setter for runID
	 * @param runID
	 */
	public void setRunID(int runID) {
		this.runID = runID;
	}

	/**
	 * getter for runDate
	 * @return Date
	 */
	public String getRunDate() {
		return runDate;
	}

	/**
	 * setter for runDate
	 * @param runDate
	 */
	public void setRunDate(String runDate) {
		this.runDate = runDate;
	}

	/**
	 * getter for timeOfDay
	 * @return String
	 */
	public String getTimeOfDay() {
		return timeOfDay;
	}

	/**
	 * setter for timeOfDay
	 * @param timeOfDay
	 */
	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}

	/**
	 * getter for runLength
	 * @return int
	 */
	public int getRunLength() {
		return runLength;
	}

	/**
	 * setter for runLength
	 * @param runLength
	 */
	public void setRunLength(int runLength) {
		this.runLength = runLength;
	}

	/**
	 * getter for isGoodRun
	 * @return boolean
	 */
	public boolean isGoodRun() {
		return goodRun;
	}

	/**
	 * setter for isGoodRun
	 * @param goodRun
	 */
	public void setGoodRun(boolean goodRun) {
		this.goodRun = goodRun;
	}

	/**
	 * toString for the Run class
	 */
	@Override
	public String toString() {
		return "Run [runDate=" + runDate + ", timeOfDay=" + timeOfDay + ", runLength=" + runLength + ", goodRun="
				+ goodRun + "]";
	}
}
