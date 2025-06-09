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


import com.dao.ShangpinpandianDao;
import com.entity.ShangpinpandianEntity;
import com.service.ShangpinpandianService;
import com.entity.vo.ShangpinpandianVO;
import com.entity.view.ShangpinpandianView;

@Service("shangpinpandianService")
public class ShangpinpandianServiceImpl extends ServiceImpl<ShangpinpandianDao, ShangpinpandianEntity> implements ShangpinpandianService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpinpandianEntity> page = this.selectPage(
                new Query<ShangpinpandianEntity>(params).getPage(),
                new EntityWrapper<ShangpinpandianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpinpandianEntity> wrapper) {
		  Page<ShangpinpandianView> page =new Query<ShangpinpandianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangpinpandianVO> selectListVO(Wrapper<ShangpinpandianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangpinpandianVO selectVO(Wrapper<ShangpinpandianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangpinpandianView> selectListView(Wrapper<ShangpinpandianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpinpandianView selectView(Wrapper<ShangpinpandianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
