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
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JianchaxinxiEntity;
import com.entity.view.JianchaxinxiView;

import com.service.JianchaxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 检查信息
 * 后端接口
 * @author 
 * @email 
 * @date 2022-02-25 11:46:50
 */
@RestController
@RequestMapping("/jianchaxinxi")
public class JianchaxinxiController {
    @Autowired
    private JianchaxinxiService jianchaxinxiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JianchaxinxiEntity jianchaxinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jianchaxinxi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yewuyuan")) {
			jianchaxinxi.setYewuyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JianchaxinxiEntity> ew = new EntityWrapper<JianchaxinxiEntity>();
		PageUtils page = jianchaxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianchaxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JianchaxinxiEntity jianchaxinxi, 
		HttpServletRequest request){
        EntityWrapper<JianchaxinxiEntity> ew = new EntityWrapper<JianchaxinxiEntity>();
		PageUtils page = jianchaxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianchaxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JianchaxinxiEntity jianchaxinxi){
       	EntityWrapper<JianchaxinxiEntity> ew = new EntityWrapper<JianchaxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jianchaxinxi, "jianchaxinxi")); 
        return R.ok().put("data", jianchaxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JianchaxinxiEntity jianchaxinxi){
        EntityWrapper< JianchaxinxiEntity> ew = new EntityWrapper< JianchaxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jianchaxinxi, "jianchaxinxi")); 
		JianchaxinxiView jianchaxinxiView =  jianchaxinxiService.selectView(ew);
		return R.ok("查询检查信息成功").put("data", jianchaxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JianchaxinxiEntity jianchaxinxi = jianchaxinxiService.selectById(id);
        return R.ok().put("data", jianchaxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JianchaxinxiEntity jianchaxinxi = jianchaxinxiService.selectById(id);
        return R.ok().put("data", jianchaxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JianchaxinxiEntity jianchaxinxi, HttpServletRequest request){
    	jianchaxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jianchaxinxi);
        jianchaxinxiService.insert(jianchaxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JianchaxinxiEntity jianchaxinxi, HttpServletRequest request){
    	jianchaxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jianchaxinxi);
        jianchaxinxiService.insert(jianchaxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JianchaxinxiEntity jianchaxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jianchaxinxi);
        jianchaxinxiService.updateById(jianchaxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jianchaxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<JianchaxinxiEntity> wrapper = new EntityWrapper<JianchaxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yewuyuan")) {
			wrapper.eq("yewuyuanzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = jianchaxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
