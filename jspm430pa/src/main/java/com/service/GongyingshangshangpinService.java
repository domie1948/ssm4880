package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongyingshangshangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongyingshangshangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongyingshangshangpinView;


/**
 * 供应商商品
 *
 * @author 
 * @email 
 * @date 2021-03-01 16:56:05
 */
public interface GongyingshangshangpinService extends IService<GongyingshangshangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongyingshangshangpinVO> selectListVO(Wrapper<GongyingshangshangpinEntity> wrapper);
   	
   	GongyingshangshangpinVO selectVO(@Param("ew") Wrapper<GongyingshangshangpinEntity> wrapper);
   	
   	List<GongyingshangshangpinView> selectListView(Wrapper<GongyingshangshangpinEntity> wrapper);
   	
   	GongyingshangshangpinView selectView(@Param("ew") Wrapper<GongyingshangshangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongyingshangshangpinEntity> wrapper);
   	
}

