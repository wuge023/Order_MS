package com.etc.controller;

import java.util.List;

import com.etc.entity.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.entity.Customer;
import com.etc.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	
	@RequestMapping("/showcus")
	public String showCustomer(Model model){
		List<Customer> list = customerService.findAll();
		model.addAttribute("list", list);
		return "customer";
	}
	
	@PostMapping("/restcustomer")
	public String addCustomer(Customer customer){
		customerService.doAdd(customer);
		return "forward:showcus.html";
	}
	
	@RequestMapping("/restcustomer")
	public String modifyCustomer(Customer customer){
		customerService.doModify(customer);
		return "forward:showcus.html";
	}
	
	@RequestMapping("/restcustomer")
	public JsonResult deleteCustomer(int cid){
		customerService.doRemove(cid);
		return "forward:showcus.html";
	}
	
	@PutMapping("/freezecustomer")
	public String freezeCustomer(List<Customer> customers){
		for(Customer cus : customers)
		if (cus.getStatus() == 1) {
			customerService.doModify(new Customer(cus.getCid(),null,null,2));
		} else if (cus.getStatus() == 2) {
			customerService.doModify(new Customer(cus.getCid(),null,null,1));
		}
		return "forward:showcus.html";
	}
}
