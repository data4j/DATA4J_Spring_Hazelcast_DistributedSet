package org.data4j.cache.srv;

import org.data4j.customer.Customer;

import com.hazelcast.core.ISet;

/**
 * A new IDistributedSetService Interface is created for service layer to expose cache functionality.
 *  
 * @author data4j.org
 * @since 28 Sept 2013
 * @version 1.0.0
 *
 */
public interface IDistributedSetService {

	/**
     * Adds Customer entries to customerSet
     *
     * @param Customer customer
     * @return boolean the result of operation
     * 
     */
	boolean addToDistributedSet(Customer customer);
	
	/**
     * Removes Customer entries from customerSet
     *
     * @param Customer customer
     * @return boolean the result of operation
     * 
     */
	boolean removeFromDistributedSet(Customer customer);

	/**
     * Gets Customer Set
     *
     * @return ISet customerSet
     */
	ISet<Customer> getCustomerSet();

}
