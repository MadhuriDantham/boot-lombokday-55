package com.jobiak.bootlombok.model;

import lombok.AllArgsConstructor;
import com.jobiak.bootlombok.model.Customer;
import com.jobiak.bootlombok.model.Product;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Data
public class Customer {
	@Setter
	@Getter
	private long custId;
	@Setter
	@Getter
	private String name;
	@Setter
	@Getter
	private double balance;
	

}
