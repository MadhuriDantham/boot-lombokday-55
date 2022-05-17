package com.jobiak.bootlombok;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jobiak.bootlombok.model.Customer;

@SpringBootApplication
public class BootLombokday55Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BootLombokday55Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Customer cus=new Customer();
		cus.setCustId(1);
		cus.setName("Maxx Bail");
	    cus.setBalance(5743);
	    
	    
	    System.out.println(cus.getBalance());
	    System.out.println(cus.getName());
	    System.out.println(cus.getCustId());
	    
	    System.out.println(cus);
	    
	    Customer cus2=new Customer(2,"Maxx Bail",5743);
		System.out.println(cus2);
		
		boolean result=cus.equals(cus2);
		System.out.println(result);
		
		
		
	}

}
