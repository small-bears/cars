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


import com.dao.YewuyuanDao;
import com.entity.YewuyuanEntity;
import com.service.YewuyuanService;
import com.entity.vo.YewuyuanVO;
import com.entity.view.YewuyuanView;

@Service("yewuyuanService")
public class YewuyuanServiceImpl extends ServiceImpl<YewuyuanDao, YewuyuanEntity> implements YewuyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YewuyuanEntity> page = this.selectPage(
                new Query<YewuyuanEntity>(params).getPage(),
                new EntityWrapper<YewuyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YewuyuanEntity> wrapper) {
		  Page<YewuyuanView> page =new Query<YewuyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YewuyuanVO> selectListVO(Wrapper<YewuyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YewuyuanVO selectVO(Wrapper<YewuyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YewuyuanView> selectListView(Wrapper<YewuyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YewuyuanView selectView(Wrapper<YewuyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
