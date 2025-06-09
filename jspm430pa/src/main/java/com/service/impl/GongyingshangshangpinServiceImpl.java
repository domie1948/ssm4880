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


import com.dao.GongyingshangshangpinDao;
import com.entity.GongyingshangshangpinEntity;
import com.service.GongyingshangshangpinService;
import com.entity.vo.GongyingshangshangpinVO;
import com.entity.view.GongyingshangshangpinView;

@Service("gongyingshangshangpinService")
public class GongyingshangshangpinServiceImpl extends ServiceImpl<GongyingshangshangpinDao, GongyingshangshangpinEntity> implements GongyingshangshangpinService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongyingshangshangpinEntity> page = this.selectPage(
                new Query<GongyingshangshangpinEntity>(params).getPage(),
                new EntityWrapper<GongyingshangshangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongyingshangshangpinEntity> wrapper) {
		  Page<GongyingshangshangpinView> page =new Query<GongyingshangshangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongyingshangshangpinVO> selectListVO(Wrapper<GongyingshangshangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongyingshangshangpinVO selectVO(Wrapper<GongyingshangshangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongyingshangshangpinView> selectListView(Wrapper<GongyingshangshangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongyingshangshangpinView selectView(Wrapper<GongyingshangshangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
