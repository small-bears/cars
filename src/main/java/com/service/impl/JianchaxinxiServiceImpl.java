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


import com.dao.JianchaxinxiDao;
import com.entity.JianchaxinxiEntity;
import com.service.JianchaxinxiService;
import com.entity.vo.JianchaxinxiVO;
import com.entity.view.JianchaxinxiView;

@Service("jianchaxinxiService")
public class JianchaxinxiServiceImpl extends ServiceImpl<JianchaxinxiDao, JianchaxinxiEntity> implements JianchaxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianchaxinxiEntity> page = this.selectPage(
                new Query<JianchaxinxiEntity>(params).getPage(),
                new EntityWrapper<JianchaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianchaxinxiEntity> wrapper) {
		  Page<JianchaxinxiView> page =new Query<JianchaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianchaxinxiVO> selectListVO(Wrapper<JianchaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianchaxinxiVO selectVO(Wrapper<JianchaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianchaxinxiView> selectListView(Wrapper<JianchaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianchaxinxiView selectView(Wrapper<JianchaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
