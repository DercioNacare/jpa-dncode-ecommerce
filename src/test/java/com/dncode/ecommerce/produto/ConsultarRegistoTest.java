package com.dncode.ecommerce.produto;

import org.junit.Assert;
import org.junit.Test;

import com.dncode.ecommerce.EntityManagerTest;
import com.dncode.ecommerce.model.Produto;

public class ConsultarRegistoTest extends EntityManagerTest
{	
	@Test
	public void findById()
	{
		Produto produto = manager.getReference(Produto.class, 1l);
		
		//System.out.println(produto);
		
		Assert.assertNotNull(produto);
		//Assert.assertEquals("kindle", produto.getNome());
	}
}