package com.etc.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etc.dao.OrderRelationMapper;
import com.etc.dao.OrderinfoMapper;

@Service
public class OrderService {
	
	@Autowired
	private OrderinfoMapper oiMapper;
	@Autowired
	private OrderRelationMapper orMapper;
	
	public boolean doRemove(int oid){
		int row = oiMapper.deleteByPrimaryKey(oid);
		return row>0;
	}
	
	
	public List<Map<String,Object>> findOrder(Map<String,Object> param){
		List<Map<String,Object>> list = orMapper.selectOrder(param);
		return list;
	}
	
	public List<Map<String,Object>> findOrderDetail(int oid){
		List<Map<String,Object>> list = orMapper.selectOrderDetail(oid);
		return list;
	}
}
