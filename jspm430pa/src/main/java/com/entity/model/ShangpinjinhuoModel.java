package com.entity.model;

import com.entity.ShangpinjinhuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 商品进货
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-01 16:56:05
 */
public class ShangpinjinhuoModel  implements Serializable {
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
	 * 进货单价
	 */
	
	private Integer jinhuodanjia;
		
	/**
	 * 进货总价格
	 */
	
	private String jinhuozongjiage;
		
	/**
	 * 进货时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jinhuoshijian;
		
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
	 * 设置：进货单价
	 */
	 
	public void setJinhuodanjia(Integer jinhuodanjia) {
		this.jinhuodanjia = jinhuodanjia;
	}
	
	/**
	 * 获取：进货单价
	 */
	public Integer getJinhuodanjia() {
		return jinhuodanjia;
	}
				
	
	/**
	 * 设置：进货总价格
	 */
	 
	public void setJinhuozongjiage(String jinhuozongjiage) {
		this.jinhuozongjiage = jinhuozongjiage;
	}
	
	/**
	 * 获取：进货总价格
	 */
	public String getJinhuozongjiage() {
		return jinhuozongjiage;
	}
				
	
	/**
	 * 设置：进货时间
	 */
	 
	public void setJinhuoshijian(Date jinhuoshijian) {
		this.jinhuoshijian = jinhuoshijian;
	}
	
	/**
	 * 获取：进货时间
	 */
	public Date getJinhuoshijian() {
		return jinhuoshijian;
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
