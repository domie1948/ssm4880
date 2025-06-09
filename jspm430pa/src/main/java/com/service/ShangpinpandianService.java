package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpinpandianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangpinpandianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpinpandianView;


/**
 * 商品盘点
 *
 * @author 
 * @email 
 * @date 2021-03-01 16:56:05
 */
public interface ShangpinpandianService extends IService<ShangpinpandianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpinpandianVO> selectListVO(Wrapper<ShangpinpandianEntity> wrapper);
   	
   	ShangpinpandianVO selectVO(@Param("ew") Wrapper<ShangpinpandianEntity> wrapper);
   	
   	List<ShangpinpandianView> selectListView(Wrapper<ShangpinpandianEntity> wrapper);
   	
   	ShangpinpandianView selectView(@Param("ew") Wrapper<ShangpinpandianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpinpandianEntity> wrapper);
   	
}

