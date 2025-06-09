package com.entity.view;

import com.entity.XiaoshouchukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 销售出库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-01 16:56:05
 */
@TableName("xiaoshouchuku")
public class XiaoshouchukuView  extends XiaoshouchukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoshouchukuView(){
	}
 
 	public XiaoshouchukuView(XiaoshouchukuEntity xiaoshouchukuEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoshouchukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
