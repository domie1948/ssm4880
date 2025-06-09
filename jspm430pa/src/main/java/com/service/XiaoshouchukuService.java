package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoshouchukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoshouchukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoshouchukuView;


/**
 * 销售出库
 *
 * @author 
 * @email 
 * @date 2021-03-01 16:56:05
 */
public interface XiaoshouchukuService extends IService<XiaoshouchukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoshouchukuVO> selectListVO(Wrapper<XiaoshouchukuEntity> wrapper);
   	
   	XiaoshouchukuVO selectVO(@Param("ew") Wrapper<XiaoshouchukuEntity> wrapper);
   	
   	List<XiaoshouchukuView> selectListView(Wrapper<XiaoshouchukuEntity> wrapper);
   	
   	XiaoshouchukuView selectView(@Param("ew") Wrapper<XiaoshouchukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoshouchukuEntity> wrapper);
   	
}

