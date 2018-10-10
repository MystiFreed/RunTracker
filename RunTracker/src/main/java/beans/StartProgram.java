// Mysti Freed, mrfreed@dmacc.edu
// StartProgram file for the RunTracker project

package beans;

import java.util.List;

import	org.springframework.context.annotation.AnnotationConfigApplicationContext;
import	org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new	AnnotationConfigApplicationContext(BeanConfiguration.class);
		RunInterface runInterface = applicationContext.getBean("runInterface", RunInterface.class);
		
		// Generate pre-consolidation run information
		System.out.println("Before run consolidation");
		System.out.println("Run 1 length: " + runInterface.getRun(1).getRunLength());
		System.out.println("Run 2 length: " + runInterface.getRun(2).getRunLength());
		
		// Ensure all data has populated accurately within the runs
		System.out.println("Run 1: " + runInterface.getRun(1).getRunDate() + " " + runInterface.getRun(1).getRunLength() + " "+ runInterface.getRun(1).getTimeOfDay() + " " + runInterface.getRun(1).isGoodRun());
		System.out.println("Run 2: " + runInterface.getRun(2).getRunDate() + " " + runInterface.getRun(2).getRunLength() + " "+ runInterface.getRun(2).getTimeOfDay() + " " + runInterface.getRun(2).isGoodRun());
		
		// Combine run lengths
		runInterface.combineRuns(1, 2, 45);
		
		System.out.println("After run consolidation");
		System.out.println("Run 1 length: " + runInterface.getRun(1).getRunLength());
		System.out.println("Run 2 length: " + runInterface.getRun(2).getRunLength());
	}

}
