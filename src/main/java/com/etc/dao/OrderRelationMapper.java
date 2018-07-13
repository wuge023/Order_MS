package com.etc.dao;

import java.util.List;
import java.util.Map;

public interface OrderRelationMapper {

	List<Map<String,Object>> selectOrder(Map<String,Object> param);
	List<Map<String,Object>> selectOrderDetail(int oid);
}
