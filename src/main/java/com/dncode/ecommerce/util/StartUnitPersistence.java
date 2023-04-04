package com.dncode.ecommerce.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dncode.ecommerce.model.Produto;

public class StartUnitPersistence 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Ecommerce-PU");
		
		EntityManager manager = factory.createEntityManager();
		
		Produto produto = manager.find(Produto.class, 1l);
		
		System.out.println(produto);
		
		manager.close();
		factory.close();
	}
}