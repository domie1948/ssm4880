package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 商品退货
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-01 16:56:05
 */
@TableName("shangpintuihuo")
public class ShangpintuihuoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShangpintuihuoEntity() {
		
	}
	
	public ShangpintuihuoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 退换编号
	 */
					
	private String tuihuanbianhao;
	
	/**
	 * 商品名称
	 */
					
	private String shangpinmingcheng;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 退换单价
	 */
					
	private Integer tuihuandanjia;
	
	/**
	 * 退换总价
	 */
					
	private String tuihuanzongjia;
	
	/**
	 * 退换时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date tuihuanshijian;
	
	/**
	 * 供应商账号
	 */
					
	private String gongyingshangzhanghao;
	
	/**
	 * 供应商名称
	 */
					
	private String gongyingshangmingcheng;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：退换编号
	 */
	public void setTuihuanbianhao(String tuihuanbianhao) {
		this.tuihuanbianhao = tuihuanbianhao;
	}
	/**
	 * 获取：退换编号
	 */
	public String getTuihuanbianhao() {
		return tuihuanbianhao;
	}
	/**
	 * 设置：商品名称
	 */
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
	/**
	 * 设置：数量
	 */
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：退换单价
	 */
	public void setTuihuandanjia(Integer tuihuandanjia) {
		this.tuihuandanjia = tuihuandanjia;
	}
	/**
	 * 获取：退换单价
	 */
	public Integer getTuihuandanjia() {
		return tuihuandanjia;
	}
	/**
	 * 设置：退换总价
	 */
	public void setTuihuanzongjia(String tuihuanzongjia) {
		this.tuihuanzongjia = tuihuanzongjia;
	}
	/**
	 * 获取：退换总价
	 */
	public String getTuihuanzongjia() {
		return tuihuanzongjia;
	}
	/**
	 * 设置：退换时间
	 */
	public void setTuihuanshijian(Date tuihuanshijian) {
		this.tuihuanshijian = tuihuanshijian;
	}
	/**
	 * 获取：退换时间
	 */
	public Date getTuihuanshijian() {
		return tuihuanshijian;
	}
	/**
	 * 设置：供应商账号
	 */
	public void setGongyingshangzhanghao(String gongyingshangzhanghao) {
		this.gongyingshangzhanghao = gongyingshangzhanghao;
	}
	/**
	 * 获取：供应商账号
	 */
	public String getGongyingshangzhanghao() {
		return gongyingshangzhanghao;
	}
	/**
	 * 设置：供应商名称
	 */
	public void setGongyingshangmingcheng(String gongyingshangmingcheng) {
		this.gongyingshangmingcheng = gongyingshangmingcheng;
	}
	/**
	 * 获取：供应商名称
	 */
	public String getGongyingshangmingcheng() {
		return gongyingshangmingcheng;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}

}
