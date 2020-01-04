package com.bank.observer;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class CustomerDAO {
	
	private final int positionOfCustomer = 0;
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	
	@PersistenceContext
	private EntityManager entityManager;

	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public CustomerDTO getCustomerById(int customerId){
		List <CustomerDTO> customerList = new ArrayList<CustomerDTO>();		
		List<Customer>foundCustomer =  entityManager.createQuery("Select e from Customer e Where e.id = :customerId", Customer.class)
				.setParameter("customerId",customerId).getResultList();
		System.out.println(foundCustomer.toString());
		System.out.println(foundCustomer.get(0).getCustomerId());
		CustomerDTO customer = new CustomerDTO(foundCustomer.get(positionOfCustomer));
		return customer;
	}
}

	
	


