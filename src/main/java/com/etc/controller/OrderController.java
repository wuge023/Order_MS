package com.etc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etc.entity.JsonResult;
import com.etc.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("**.do")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	//需要跟前台的表格插件进行复杂交互，所以内容会比较负责：分页参数、条件参数、map格式、封装成pageinfo
	@GetMapping("/restorder")   
	public JsonResult<Map<String,Object>> showOrder(int pageSize,int pageNum,
			String sort,String order,String orderNO,String cname,String status){
		PageHelper.startPage(pageNum, pageSize, sort+" "+order);
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("orderNO",orderNO);param.put("cname",cname);param.put("status",status);
		List<Map<String,Object>> list = orderService.findOrder(param);
		PageInfo<Map<String,Object>> pageInfo = new PageInfo<Map<String,Object>>(list);
		return new JsonResult<Map<String,Object>>(pageInfo);
	}
	
	@DeleteMapping("/restorder")
	public JsonResult deleteOrder(int oid){
		orderService.doRemove(oid);
		return new JsonResult("删除成功");
	}
	
	@GetMapping("/{oid}/restorder")
	public JsonResult<Map<String,Object>> showDetail(@PathVariable int oid){
		return new JsonResult<Map<String,Object>>(orderService.findOrderDetail(oid));
	}

}
