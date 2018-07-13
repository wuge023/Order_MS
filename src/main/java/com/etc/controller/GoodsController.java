package com.etc.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.entity.Goods;
import com.etc.service.GoodsService;

@Controller
public class GoodsController {
	
	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping("/showgoods")
	public String showGoods(Model model){
		List<Goods> list = goodsService.findAll();
		model.addAttribute("list", list);
		return "goods";
	}
	
	@RequestMapping("/addgoods")
	public String addGoods(Goods goods){
		goodsService.doAdd(goods);
		return "forward:showgoods.html";
	}
	
	@RequestMapping("/modifygoods")
	public String modifyGoods(Goods goods){
		goodsService.doModify(goods);
		return "forward:showgoods.html";
	}
	
	@RequestMapping("/deletegoods")
	public String deleteGoods(int gid){
		goodsService.doRemove(gid);
		return "forward:showgoods.html";
	}

}
