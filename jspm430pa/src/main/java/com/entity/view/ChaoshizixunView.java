package com.entity.view;

import com.entity.ChaoshizixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 超市资讯
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-01 16:56:05
 */
@TableName("chaoshizixun")
public class ChaoshizixunView  extends ChaoshizixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChaoshizixunView(){
	}
 
 	public ChaoshizixunView(ChaoshizixunEntity chaoshizixunEntity){
 	try {
			BeanUtils.copyProperties(this, chaoshizixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
