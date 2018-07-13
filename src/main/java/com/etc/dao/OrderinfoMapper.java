package com.etc.dao;

import com.etc.entity.Orderinfo;
import com.etc.entity.OrderinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderinfo
     *
     * @mbggenerated Wed May 23 14:45:02 CST 2018
     */
    int countByExample(OrderinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderinfo
     *
     * @mbggenerated Wed May 23 14:45:02 CST 2018
     */
    int deleteByExample(OrderinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderinfo
     *
     * @mbggenerated Wed May 23 14:45:02 CST 2018
     */
    int deleteByPrimaryKey(Integer oid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderinfo
     *
     * @mbggenerated Wed May 23 14:45:02 CST 2018
     */
    int insert(Orderinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderinfo
     *
     * @mbggenerated Wed May 23 14:45:02 CST 2018
     */
    int insertSelective(Orderinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderinfo
     *
     * @mbggenerated Wed May 23 14:45:02 CST 2018
     */
    List<Orderinfo> selectByExample(OrderinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderinfo
     *
     * @mbggenerated Wed May 23 14:45:02 CST 2018
     */
    Orderinfo selectByPrimaryKey(Integer oid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderinfo
     *
     * @mbggenerated Wed May 23 14:45:02 CST 2018
     */
    int updateByExampleSelective(@Param("record") Orderinfo record, @Param("example") OrderinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderinfo
     *
     * @mbggenerated Wed May 23 14:45:02 CST 2018
     */
    int updateByExample(@Param("record") Orderinfo record, @Param("example") OrderinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderinfo
     *
     * @mbggenerated Wed May 23 14:45:02 CST 2018
     */
    int updateByPrimaryKeySelective(Orderinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderinfo
     *
     * @mbggenerated Wed May 23 14:45:02 CST 2018
     */
    int updateByPrimaryKey(Orderinfo record);
}