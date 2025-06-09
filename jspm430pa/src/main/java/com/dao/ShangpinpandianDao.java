package com.dao;

import com.entity.ShangpinpandianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinpandianVO;
import com.entity.view.ShangpinpandianView;


/**
 * 商品盘点
 * 
 * @author 
 * @email 
 * @date 2021-03-01 16:56:05
 */
public interface ShangpinpandianDao extends BaseMapper<ShangpinpandianEntity> {
	
	List<ShangpinpandianVO> selectListVO(@Param("ew") Wrapper<ShangpinpandianEntity> wrapper);
	
	ShangpinpandianVO selectVO(@Param("ew") Wrapper<ShangpinpandianEntity> wrapper);
	
	List<ShangpinpandianView> selectListView(@Param("ew") Wrapper<ShangpinpandianEntity> wrapper);

	List<ShangpinpandianView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinpandianEntity> wrapper);
	
	ShangpinpandianView selectView(@Param("ew") Wrapper<ShangpinpandianEntity> wrapper);
	
}
