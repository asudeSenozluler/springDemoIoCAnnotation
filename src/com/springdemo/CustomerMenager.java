package com.springdemo;

public class CustomerMenager implements ICustomerService {
	
	
private	ICustomerDal customerDal;
	
public CustomerMenager(ICustomerDal customerDal) {
	this.customerDal = customerDal;
}
	public ICustomerDal getCustomerDal() {
	return customerDal;
}

public void setCustomerDal(ICustomerDal customerDal) {
	this.customerDal = customerDal;
}

	public void add() {
		
		customerDal.add();
	}

}
