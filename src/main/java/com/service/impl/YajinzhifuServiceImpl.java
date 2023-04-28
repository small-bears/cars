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


import com.dao.YajinzhifuDao;
import com.entity.YajinzhifuEntity;
import com.service.YajinzhifuService;
import com.entity.vo.YajinzhifuVO;
import com.entity.view.YajinzhifuView;

@Service("yajinzhifuService")
public class YajinzhifuServiceImpl extends ServiceImpl<YajinzhifuDao, YajinzhifuEntity> implements YajinzhifuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YajinzhifuEntity> page = this.selectPage(
                new Query<YajinzhifuEntity>(params).getPage(),
                new EntityWrapper<YajinzhifuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YajinzhifuEntity> wrapper) {
		  Page<YajinzhifuView> page =new Query<YajinzhifuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YajinzhifuVO> selectListVO(Wrapper<YajinzhifuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YajinzhifuVO selectVO(Wrapper<YajinzhifuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YajinzhifuView> selectListView(Wrapper<YajinzhifuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YajinzhifuView selectView(Wrapper<YajinzhifuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
