package com.etc.service;

import java.util.ArrayList;
import java.util.List;

import com.etc.entity.CustomerExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etc.dao.CustomerMapper;
import com.etc.entity.Customer;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerMapper cusMapper;

	public boolean doAdd(Customer customer){
		int row = cusMapper.insertSelective(customer);
		return row>0;
	}
	
	public boolean doModify(Customer customer){
		int row = cusMapper.updateByPrimaryKeySelective(customer);
		return row>0;
	}
	
	public boolean doRemove(List<Customer> customers){
		List<Integer> cids = new ArrayList<Integer>();
		for(Customer cus:customers){
			cids.add(cus.getCid());
		}
		CustomerExample ce = new CustomerExample();
		ce.createCriteria().andCidIn(cids);
		int row = cusMapper.deleteByExample(ce);
		return row==cids.size();
	}
	
	
	public Customer findByCid(int cid){
		Customer customer = cusMapper.selectByPrimaryKey(cid);
		return customer;
	}
	
	public List<Customer> findAll(){
		List<Customer> list = cusMapper.selectByExample(null);
		return list;
	}
}
