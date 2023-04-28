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


import com.dao.ZulindingdanDao;
import com.entity.ZulindingdanEntity;
import com.service.ZulindingdanService;
import com.entity.vo.ZulindingdanVO;
import com.entity.view.ZulindingdanView;

@Service("zulindingdanService")
public class ZulindingdanServiceImpl extends ServiceImpl<ZulindingdanDao, ZulindingdanEntity> implements ZulindingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZulindingdanEntity> page = this.selectPage(
                new Query<ZulindingdanEntity>(params).getPage(),
                new EntityWrapper<ZulindingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZulindingdanEntity> wrapper) {
		  Page<ZulindingdanView> page =new Query<ZulindingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZulindingdanVO> selectListVO(Wrapper<ZulindingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZulindingdanVO selectVO(Wrapper<ZulindingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZulindingdanView> selectListView(Wrapper<ZulindingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZulindingdanView selectView(Wrapper<ZulindingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ZulindingdanEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ZulindingdanEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ZulindingdanEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
