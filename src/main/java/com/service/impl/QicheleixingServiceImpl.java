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


import com.dao.QicheleixingDao;
import com.entity.QicheleixingEntity;
import com.service.QicheleixingService;
import com.entity.vo.QicheleixingVO;
import com.entity.view.QicheleixingView;

@Service("qicheleixingService")
public class QicheleixingServiceImpl extends ServiceImpl<QicheleixingDao, QicheleixingEntity> implements QicheleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QicheleixingEntity> page = this.selectPage(
                new Query<QicheleixingEntity>(params).getPage(),
                new EntityWrapper<QicheleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QicheleixingEntity> wrapper) {
		  Page<QicheleixingView> page =new Query<QicheleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QicheleixingVO> selectListVO(Wrapper<QicheleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QicheleixingVO selectVO(Wrapper<QicheleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QicheleixingView> selectListView(Wrapper<QicheleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QicheleixingView selectView(Wrapper<QicheleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
