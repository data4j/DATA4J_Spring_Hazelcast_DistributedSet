package org.data4j.cache.srv;

import org.data4j.customer.Customer;
import org.data4j.customer.listener.CustomerItemListener;

import com.hazelcast.core.ISet;

/**
 * DistributedSetService Class is implementation of IDistributedSetService Interface.
 * 
 * @author data4j.org
 * @since 28 Sept 2013
 * @version 1.0.0
 *
 */
public class DistributedSetService implements IDistributedSetService {

	private ISet<Customer> customerSet;
	
	/**
     * Constructor of DistributedSetService
     *
     * @param ISet customerSet
	 *
     */
	@SuppressWarnings("unchecked")
	public DistributedSetService(ISet<Customer> customerSet) {
		setCustomerSet(customerSet);
		getCustomerSet().addItemListener(new CustomerItemListener(), true);
	}
	
	/**
     * Adds Customer entries to customerSet
     *
     * @param Customer customer
     * @return boolean the result of operation
     * 
     */
	@Override
	public boolean addToDistributedSet(Customer customer) {
		return getCustomerSet().add(customer);
	}

	/**
     * Removes Customer entries from customerSet
     *
     * @param Customer customer
     * @return boolean the result of operation
     * 
     */
	@Override
	public boolean removeFromDistributedSet(Customer customer) {
		return getCustomerSet().remove(customer);
	}	

	/**
     * Gets Customer Set
     *
     * @return ISet customerSet
     */
	public ISet<Customer> getCustomerSet() {
		return customerSet;
	}

	public void setCustomerSet(ISet<Customer> customerSet) {
		this.customerSet = customerSet;
	}
	
}
