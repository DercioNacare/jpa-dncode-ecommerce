package com.dncode.ecommerce;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class EntityManagerTest 
{
	protected static EntityManagerFactory factory;
	protected EntityManager manager;
	
	@BeforeClass
	public static void setUpBeforeClass()
	{
		factory = Persistence.createEntityManagerFactory("Ecommerce-PU");
	}
	
	@AfterClass
	public static void tearDownAfterClass()
	{
		factory.close();
	}
	
	@Before
	public void setup()
	{
		manager = factory.createEntityManager();
	}
	
	@After
	public void tearDown()
	{
		manager.close();
	}
}
