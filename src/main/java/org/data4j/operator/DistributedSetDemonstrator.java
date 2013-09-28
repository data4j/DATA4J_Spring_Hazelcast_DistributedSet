package org.data4j.operator;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.data4j.cache.srv.IDistributedSetService;
import org.data4j.customer.Customer;

/**
 * DistributedSetDemonstrator Class demonstrates Customers from customerSet.
 * 
 * @author data4j.org
 * @since 28 Sept 2013
 * @version 1.0.0
 *
 */
public class DistributedSetDemonstrator {

	private static final Logger logger = Logger.getLogger(DistributedSetDemonstrator.class);
	
	private	IDistributedSetService distributedSetService;
	
	/**
     * Demonstrates Customer Items from distributedSet.
	 *
     */
	public void demonstrate() {				
		Iterator<Customer> customerIterator = distributedSetService.getCustomerSet().iterator();
		while(customerIterator.hasNext()) {
			Customer customer =  customerIterator.next();
			logger.debug("Customer Items => " + customer);
		}						
	}

	public void setDistributedSetService(IDistributedSetService distributedSetService) {
		this.distributedSetService = distributedSetService;
	}
	
}
