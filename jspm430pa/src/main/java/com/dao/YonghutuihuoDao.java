package com.dao;

import com.entity.YonghutuihuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghutuihuoVO;
import com.entity.view.YonghutuihuoView;


/**
 * 用户退货
 * 
 * @author 
 * @email 
 * @date 2021-03-01 16:56:05
 */
public interface YonghutuihuoDao extends BaseMapper<YonghutuihuoEntity> {
	
	List<YonghutuihuoVO> selectListVO(@Param("ew") Wrapper<YonghutuihuoEntity> wrapper);
	
	YonghutuihuoVO selectVO(@Param("ew") Wrapper<YonghutuihuoEntity> wrapper);
	
	List<YonghutuihuoView> selectListView(@Param("ew") Wrapper<YonghutuihuoEntity> wrapper);

	List<YonghutuihuoView> selectListView(Pagination page,@Param("ew") Wrapper<YonghutuihuoEntity> wrapper);
	
	YonghutuihuoView selectView(@Param("ew") Wrapper<YonghutuihuoEntity> wrapper);
	
}
