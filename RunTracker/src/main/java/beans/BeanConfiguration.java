// Mysti Freed, mrfreed@dmacc.edu
// Bean Configuration file for the RunTracker project

package beans;

import	org.springframework.context.annotation.Bean;
import	org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public RunDao runDao() {
		RunDaoInMemoryImpl bean = new RunDaoInMemoryImpl();
		return bean;
	}
	
	@Bean
	public RunInterface runInterface() {
		RunInterfaceImpl bean = new RunInterfaceImpl();
		bean.setRunDao(runDao());
		return bean;
	}

}
