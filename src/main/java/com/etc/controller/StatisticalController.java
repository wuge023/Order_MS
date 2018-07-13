package com.etc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etc.dao.StatisticalMapper;
import com.etc.entity.JsonResult;

@RestController
@RequestMapping("**.do")
public class StatisticalController {
	
	@Autowired
	private StatisticalMapper stMapper;
	
	@GetMapping("/showcharts")
	public JsonResult<Map<String,Object>> showCharts(){
		return new JsonResult<Map<String,Object>>(stMapper.groupByType());
	}
	
}
