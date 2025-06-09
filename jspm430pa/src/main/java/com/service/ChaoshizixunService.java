package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChaoshizixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChaoshizixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChaoshizixunView;


/**
 * 超市资讯
 *
 * @author 
 * @email 
 * @date 2021-03-01 16:56:05
 */
public interface ChaoshizixunService extends IService<ChaoshizixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChaoshizixunVO> selectListVO(Wrapper<ChaoshizixunEntity> wrapper);
   	
   	ChaoshizixunVO selectVO(@Param("ew") Wrapper<ChaoshizixunEntity> wrapper);
   	
   	List<ChaoshizixunView> selectListView(Wrapper<ChaoshizixunEntity> wrapper);
   	
   	ChaoshizixunView selectView(@Param("ew") Wrapper<ChaoshizixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChaoshizixunEntity> wrapper);
   	
}

