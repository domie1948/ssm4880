package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YonghutuihuoDao;
import com.entity.YonghutuihuoEntity;
import com.service.YonghutuihuoService;
import com.entity.vo.YonghutuihuoVO;
import com.entity.view.YonghutuihuoView;

@Service("yonghutuihuoService")
public class YonghutuihuoServiceImpl extends ServiceImpl<YonghutuihuoDao, YonghutuihuoEntity> implements YonghutuihuoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghutuihuoEntity> page = this.selectPage(
                new Query<YonghutuihuoEntity>(params).getPage(),
                new EntityWrapper<YonghutuihuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghutuihuoEntity> wrapper) {
		  Page<YonghutuihuoView> page =new Query<YonghutuihuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghutuihuoVO> selectListVO(Wrapper<YonghutuihuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghutuihuoVO selectVO(Wrapper<YonghutuihuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghutuihuoView> selectListView(Wrapper<YonghutuihuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghutuihuoView selectView(Wrapper<YonghutuihuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
