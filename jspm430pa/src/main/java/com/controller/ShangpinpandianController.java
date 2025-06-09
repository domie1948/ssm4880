package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShangpinpandianEntity;
import com.entity.view.ShangpinpandianView;

import com.service.ShangpinpandianService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 商品盘点
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-01 16:56:05
 */
@RestController
@RequestMapping("/shangpinpandian")
public class ShangpinpandianController {
    @Autowired
    private ShangpinpandianService shangpinpandianService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShangpinpandianEntity shangpinpandian, HttpServletRequest request){

        EntityWrapper<ShangpinpandianEntity> ew = new EntityWrapper<ShangpinpandianEntity>();
    	PageUtils page = shangpinpandianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangpinpandian), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShangpinpandianEntity shangpinpandian, HttpServletRequest request){
        EntityWrapper<ShangpinpandianEntity> ew = new EntityWrapper<ShangpinpandianEntity>();
    	PageUtils page = shangpinpandianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangpinpandian), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShangpinpandianEntity shangpinpandian){
       	EntityWrapper<ShangpinpandianEntity> ew = new EntityWrapper<ShangpinpandianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shangpinpandian, "shangpinpandian")); 
        return R.ok().put("data", shangpinpandianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShangpinpandianEntity shangpinpandian){
        EntityWrapper< ShangpinpandianEntity> ew = new EntityWrapper< ShangpinpandianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shangpinpandian, "shangpinpandian")); 
		ShangpinpandianView shangpinpandianView =  shangpinpandianService.selectView(ew);
		return R.ok("查询商品盘点成功").put("data", shangpinpandianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShangpinpandianEntity shangpinpandian = shangpinpandianService.selectById(id);
        return R.ok().put("data", shangpinpandian);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShangpinpandianEntity shangpinpandian = shangpinpandianService.selectById(id);
        return R.ok().put("data", shangpinpandian);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShangpinpandianEntity shangpinpandian, HttpServletRequest request){
    	shangpinpandian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shangpinpandian);

        shangpinpandianService.insert(shangpinpandian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShangpinpandianEntity shangpinpandian, HttpServletRequest request){
    	shangpinpandian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shangpinpandian);

        shangpinpandianService.insert(shangpinpandian);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShangpinpandianEntity shangpinpandian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shangpinpandian);
        shangpinpandianService.updateById(shangpinpandian);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shangpinpandianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShangpinpandianEntity> wrapper = new EntityWrapper<ShangpinpandianEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = shangpinpandianService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
