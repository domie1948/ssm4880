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


import com.dao.ChaoshizixunDao;
import com.entity.ChaoshizixunEntity;
import com.service.ChaoshizixunService;
import com.entity.vo.ChaoshizixunVO;
import com.entity.view.ChaoshizixunView;

@Service("chaoshizixunService")
public class ChaoshizixunServiceImpl extends ServiceImpl<ChaoshizixunDao, ChaoshizixunEntity> implements ChaoshizixunService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChaoshizixunEntity> page = this.selectPage(
                new Query<ChaoshizixunEntity>(params).getPage(),
                new EntityWrapper<ChaoshizixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChaoshizixunEntity> wrapper) {
		  Page<ChaoshizixunView> page =new Query<ChaoshizixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChaoshizixunVO> selectListVO(Wrapper<ChaoshizixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChaoshizixunVO selectVO(Wrapper<ChaoshizixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChaoshizixunView> selectListView(Wrapper<ChaoshizixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChaoshizixunView selectView(Wrapper<ChaoshizixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
