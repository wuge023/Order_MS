package com.etc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etc.dao.GoodsMapper;
import com.etc.entity.Goods;

@Service
public class GoodsService {
	
	@Autowired
	private GoodsMapper goodsMapper;

	public boolean doAdd(Goods goods){
		int row = goodsMapper.insertSelective(goods);
		return row>0;
	}
	
	public boolean doModify(Goods goods){
		int row = goodsMapper.updateByPrimaryKeySelective(goods);
		return row>0;
	}
	
	public boolean doRemove(int gid){
		int row = goodsMapper.deleteByPrimaryKey(gid);
		return row>0;
	}
	
	public Goods findByGid(int gid){
		Goods goods = goodsMapper.selectByPrimaryKey(gid);
		return goods;
	}
	
	public List<Goods> findAll(){
		List<Goods> list = goodsMapper.selectByExample(null);
		return list;
	}
}
