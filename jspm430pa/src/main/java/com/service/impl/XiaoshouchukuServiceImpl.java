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


import com.dao.XiaoshouchukuDao;
import com.entity.XiaoshouchukuEntity;
import com.service.XiaoshouchukuService;
import com.entity.vo.XiaoshouchukuVO;
import com.entity.view.XiaoshouchukuView;

@Service("xiaoshouchukuService")
public class XiaoshouchukuServiceImpl extends ServiceImpl<XiaoshouchukuDao, XiaoshouchukuEntity> implements XiaoshouchukuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoshouchukuEntity> page = this.selectPage(
                new Query<XiaoshouchukuEntity>(params).getPage(),
                new EntityWrapper<XiaoshouchukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoshouchukuEntity> wrapper) {
		  Page<XiaoshouchukuView> page =new Query<XiaoshouchukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoshouchukuVO> selectListVO(Wrapper<XiaoshouchukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoshouchukuVO selectVO(Wrapper<XiaoshouchukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoshouchukuView> selectListView(Wrapper<XiaoshouchukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoshouchukuView selectView(Wrapper<XiaoshouchukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
