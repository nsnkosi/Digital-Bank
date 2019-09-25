package controller;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

import model.Customer;
import service.CustomerEJB;

@ManagedBean(name = "customercontroller")
@SessionScoped
public class CustomerController {
	@EJB
	private CustomerEJB customerEJB;
	
	@ManagedProperty(value="#{customer}")
	private Customer customer;
	
	private List<Customer> customerList = new ArrayList<>();
	
	private List<Customer> getCustomerList(){
		customerList = customerEJB.findCustomer(); 
		return customerList;
	}
	
	public String viewEmployee(){
        return "customerList.xhtml";
    }
	
    public String addNewCustomer() {
        customerEJB.addNewCust(customer.getEntity());
        customerList = customerEJB.findCustomer();
       return "customerList.xhtml";
   }
	public Customer getCustomer() {
		return customer;
	}

	public void setEmployee(Customer customer) {
		this.customer = customer;
	}
    
}
