package com.entity.vo;

import com.entity.XiaoshouchukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 销售出库
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-01 16:56:05
 */
public class XiaoshouchukuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商品名称
	 */
	
	private String shangpinmingcheng;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 出库单价
	 */
	
	private Integer chukudanjia;
		
	/**
	 * 出库总价格
	 */
	
	private String chukuzongjiage;
		
	/**
	 * 出库时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chukushijian;
		
	/**
	 * 销售对象
	 */
	
	private String xiaoshouduixiang;
		
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
	 * 设置：出库单价
	 */
	 
	public void setChukudanjia(Integer chukudanjia) {
		this.chukudanjia = chukudanjia;
	}
	
	/**
	 * 获取：出库单价
	 */
	public Integer getChukudanjia() {
		return chukudanjia;
	}
				
	
	/**
	 * 设置：出库总价格
	 */
	 
	public void setChukuzongjiage(String chukuzongjiage) {
		this.chukuzongjiage = chukuzongjiage;
	}
	
	/**
	 * 获取：出库总价格
	 */
	public String getChukuzongjiage() {
		return chukuzongjiage;
	}
				
	
	/**
	 * 设置：出库时间
	 */
	 
	public void setChukushijian(Date chukushijian) {
		this.chukushijian = chukushijian;
	}
	
	/**
	 * 获取：出库时间
	 */
	public Date getChukushijian() {
		return chukushijian;
	}
				
	
	/**
	 * 设置：销售对象
	 */
	 
	public void setXiaoshouduixiang(String xiaoshouduixiang) {
		this.xiaoshouduixiang = xiaoshouduixiang;
	}
	
	/**
	 * 获取：销售对象
	 */
	public String getXiaoshouduixiang() {
		return xiaoshouduixiang;
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
