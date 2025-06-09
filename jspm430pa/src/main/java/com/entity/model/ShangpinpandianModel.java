package com.entity.model;

import com.entity.ShangpinpandianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 商品盘点
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-01 16:56:05
 */
public class ShangpinpandianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商品名称
	 */
	
	private String shangpinmingcheng;
		
	/**
	 * 商品类型
	 */
	
	private String shangpinleixing;
		
	/**
	 * 实点数量
	 */
	
	private Integer shidianshuliang;
		
	/**
	 * 是否缺货
	 */
	
	private String shifouquehuo;
		
	/**
	 * 是否缺少
	 */
	
	private String shifouqueshao;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
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
	 * 设置：实点数量
	 */
	 
	public void setShidianshuliang(Integer shidianshuliang) {
		this.shidianshuliang = shidianshuliang;
	}
	
	/**
	 * 获取：实点数量
	 */
	public Integer getShidianshuliang() {
		return shidianshuliang;
	}
				
	
	/**
	 * 设置：是否缺货
	 */
	 
	public void setShifouquehuo(String shifouquehuo) {
		this.shifouquehuo = shifouquehuo;
	}
	
	/**
	 * 获取：是否缺货
	 */
	public String getShifouquehuo() {
		return shifouquehuo;
	}
				
	
	/**
	 * 设置：是否缺少
	 */
	 
	public void setShifouqueshao(String shifouqueshao) {
		this.shifouqueshao = shifouqueshao;
	}
	
	/**
	 * 获取：是否缺少
	 */
	public String getShifouqueshao() {
		return shifouqueshao;
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
