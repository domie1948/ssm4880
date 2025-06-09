package com.dao;

import com.entity.ChaoshizixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChaoshizixunVO;
import com.entity.view.ChaoshizixunView;


/**
 * 超市资讯
 * 
 * @author 
 * @email 
 * @date 2021-03-01 16:56:05
 */
public interface ChaoshizixunDao extends BaseMapper<ChaoshizixunEntity> {
	
	List<ChaoshizixunVO> selectListVO(@Param("ew") Wrapper<ChaoshizixunEntity> wrapper);
	
	ChaoshizixunVO selectVO(@Param("ew") Wrapper<ChaoshizixunEntity> wrapper);
	
	List<ChaoshizixunView> selectListView(@Param("ew") Wrapper<ChaoshizixunEntity> wrapper);

	List<ChaoshizixunView> selectListView(Pagination page,@Param("ew") Wrapper<ChaoshizixunEntity> wrapper);
	
	ChaoshizixunView selectView(@Param("ew") Wrapper<ChaoshizixunEntity> wrapper);
	
}
