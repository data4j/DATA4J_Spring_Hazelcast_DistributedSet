package org.data4j.operator;

import org.data4j.cache.srv.IDistributedSetService;
import org.data4j.customer.Customer;

/**
 * DistributedSetLoader Class loads Customers to customerSet.
 * 
 * @author data4j.org
 * @since 28 Sept 2013
 * @version 1.0.0
 *
 */
public class DistributedSetLoader {
	
	private	IDistributedSetService distributedSetService;
	
	/**
     * Loads Customer Items to customerSet.
     *
     */
	public void load() {
		Customer firstCustomer = new Customer();
		firstCustomer.setId("1");
		firstCustomer.setName("Name1");
		firstCustomer.setSurname("Surname1");
		
		Customer secondCustomer = new Customer();
		secondCustomer.setId("2");
		secondCustomer.setName("Name2");
		secondCustomer.setSurname("Surname2");
		
		Customer thirdCustomer = new Customer();
		thirdCustomer.setId("3");
		thirdCustomer.setName("Name3");
		thirdCustomer.setSurname("Surname3");
		
		distributedSetService.addToDistributedSet(firstCustomer);
		distributedSetService.addToDistributedSet(secondCustomer);
		distributedSetService.addToDistributedSet(thirdCustomer);
		
	}

	public void setDistributedSetService(IDistributedSetService distributedSetService) {
		this.distributedSetService = distributedSetService;
	}
	
}
