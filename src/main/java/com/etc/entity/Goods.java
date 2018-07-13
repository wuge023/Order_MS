package com.etc.entity;

import java.util.Date;

public class Goods {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.gid
     *
     * @mbggenerated Wed May 23 08:46:34 CST 2018
     */
    private Integer gid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.gname
     *
     * @mbggenerated Wed May 23 08:46:34 CST 2018
     */
    private String gname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.type
     *
     * @mbggenerated Wed May 23 08:46:34 CST 2018
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.price
     *
     * @mbggenerated Wed May 23 08:46:34 CST 2018
     */
    private Double price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.date
     *
     * @mbggenerated Wed May 23 08:46:34 CST 2018
     */
    private Date date;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.gid
     *
     * @return the value of goods.gid
     *
     * @mbggenerated Wed May 23 08:46:34 CST 2018
     */
    public Integer getGid() {
        return gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.gid
     *
     * @param gid the value for goods.gid
     *
     * @mbggenerated Wed May 23 08:46:34 CST 2018
     */
    public void setGid(Integer gid) {
        this.gid = gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.gname
     *
     * @return the value of goods.gname
     *
     * @mbggenerated Wed May 23 08:46:34 CST 2018
     */
    public String getGname() {
        return gname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.gname
     *
     * @param gname the value for goods.gname
     *
     * @mbggenerated Wed May 23 08:46:34 CST 2018
     */
    public void setGname(String gname) {
        this.gname = gname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.type
     *
     * @return the value of goods.type
     *
     * @mbggenerated Wed May 23 08:46:34 CST 2018
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.type
     *
     * @param type the value for goods.type
     *
     * @mbggenerated Wed May 23 08:46:34 CST 2018
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.price
     *
     * @return the value of goods.price
     *
     * @mbggenerated Wed May 23 08:46:34 CST 2018
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.price
     *
     * @param price the value for goods.price
     *
     * @mbggenerated Wed May 23 08:46:34 CST 2018
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.date
     *
     * @return the value of goods.date
     *
     * @mbggenerated Wed May 23 08:46:34 CST 2018
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.date
     *
     * @param date the value for goods.date
     *
     * @mbggenerated Wed May 23 08:46:34 CST 2018
     */
    public void setDate(String date) {
        this.date = java.sql.Date.valueOf(date);
    }
    
    /*public void setDate(Date date) {
        this.date = date;
    }*/
    
    

	public Goods(Integer gid, String gname, String type, Double price, Date date) {
		this.gid = gid;
		this.gname = gname;
		this.type = type;
		this.price = price;
		this.date = date;
	}

	public Goods() {
	}
    
    
}