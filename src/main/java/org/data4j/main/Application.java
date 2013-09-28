package org.data4j.main;

import org.data4j.operator.DistributedSetDemonstrator;
import org.data4j.operator.DistributedSetLoader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Application class starts the application
 * 
 * @author data4j.org
 * @since 28 Sept 2013
 * @version 1.0.0
 *
 */
public class Application {
	
	/**
     * Starts the application
     *
     * @param  String[] args
	 *
     */
	public static void main(String[] args) {		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Cache content is being loaded...
		DistributedSetLoader distributedLoader = context.getBean(DistributedSetLoader.class);		
		distributedLoader.load();
		
		//Cache content is being demonstrated...
		DistributedSetDemonstrator distributedSetDemonstrator = context.getBean(DistributedSetDemonstrator.class);
		distributedSetDemonstrator.demonstrate();
	}
	
}
