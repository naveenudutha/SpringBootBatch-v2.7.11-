package com.telusko.config;

import org.springframework.batch.item.ItemProcessor;

import com.telusko.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer>
{
	
	public Customer process(Customer item)
	{
		//logic
		System.out.println("processor");
			return item;
		
	}

}
