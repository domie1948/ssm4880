package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghutuihuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghutuihuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghutuihuoView;


/**
 * 用户退货
 *
 * @author 
 * @email 
 * @date 2021-03-01 16:56:05
 */
public interface YonghutuihuoService extends IService<YonghutuihuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghutuihuoVO> selectListVO(Wrapper<YonghutuihuoEntity> wrapper);
   	
   	YonghutuihuoVO selectVO(@Param("ew") Wrapper<YonghutuihuoEntity> wrapper);
   	
   	List<YonghutuihuoView> selectListView(Wrapper<YonghutuihuoEntity> wrapper);
   	
   	YonghutuihuoView selectView(@Param("ew") Wrapper<YonghutuihuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghutuihuoEntity> wrapper);
   	
}

