package com.jobiak.bootlombok.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

	@Builder
	@ToString
	@Data
	public class Product 
	{
		private int productId;
		private String description;
		private double price;
	}


