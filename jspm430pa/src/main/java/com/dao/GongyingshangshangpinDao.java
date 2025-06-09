package com.dao;

import com.entity.GongyingshangshangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongyingshangshangpinVO;
import com.entity.view.GongyingshangshangpinView;


/**
 * 供应商商品
 * 
 * @author 
 * @email 
 * @date 2021-03-01 16:56:05
 */
public interface GongyingshangshangpinDao extends BaseMapper<GongyingshangshangpinEntity> {
	
	List<GongyingshangshangpinVO> selectListVO(@Param("ew") Wrapper<GongyingshangshangpinEntity> wrapper);
	
	GongyingshangshangpinVO selectVO(@Param("ew") Wrapper<GongyingshangshangpinEntity> wrapper);
	
	List<GongyingshangshangpinView> selectListView(@Param("ew") Wrapper<GongyingshangshangpinEntity> wrapper);

	List<GongyingshangshangpinView> selectListView(Pagination page,@Param("ew") Wrapper<GongyingshangshangpinEntity> wrapper);
	
	GongyingshangshangpinView selectView(@Param("ew") Wrapper<GongyingshangshangpinEntity> wrapper);
	
}
