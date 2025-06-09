package com.entity.vo;

import com.entity.ShangpinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 商品信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-01 16:56:05
 */
public class ShangpinxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商品类型
	 */
	
	private String shangpinleixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 规格
	 */
	
	private String guige;
		
	/**
	 * 地址
	 */
	
	private String dizhi;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 商品价格
	 */
	
	private String shangpinjiage;
		
	/**
	 * 商品详情
	 */
	
	private String shangpinxiangqing;
		
	/**
	 * 供应商账号
	 */
	
	private String gongyingshangzhanghao;
		
	/**
	 * 供应商名称
	 */
	
	private String gongyingshangmingcheng;
				
	
	/**
	 * 设置：商品类型
	 */
	 
	public void setShangpinleixing(String shangpinleixing) {
		this.shangpinleixing = shangpinleixing;
	}
	
	/**
	 * 获取：商品类型
	 */
	public String getShangpinleixing() {
		return shangpinleixing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：规格
	 */
	 
	public void setGuige(String guige) {
		this.guige = guige;
	}
	
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
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
	 * 设置：商品价格
	 */
	 
	public void setShangpinjiage(String shangpinjiage) {
		this.shangpinjiage = shangpinjiage;
	}
	
	/**
	 * 获取：商品价格
	 */
	public String getShangpinjiage() {
		return shangpinjiage;
	}
				
	
	/**
	 * 设置：商品详情
	 */
	 
	public void setShangpinxiangqing(String shangpinxiangqing) {
		this.shangpinxiangqing = shangpinxiangqing;
	}
	
	/**
	 * 获取：商品详情
	 */
	public String getShangpinxiangqing() {
		return shangpinxiangqing;
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
			
}
