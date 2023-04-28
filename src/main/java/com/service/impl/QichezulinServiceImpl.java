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


import com.dao.QichezulinDao;
import com.entity.QichezulinEntity;
import com.service.QichezulinService;
import com.entity.vo.QichezulinVO;
import com.entity.view.QichezulinView;

@Service("qichezulinService")
public class QichezulinServiceImpl extends ServiceImpl<QichezulinDao, QichezulinEntity> implements QichezulinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QichezulinEntity> page = this.selectPage(
                new Query<QichezulinEntity>(params).getPage(),
                new EntityWrapper<QichezulinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QichezulinEntity> wrapper) {
		  Page<QichezulinView> page =new Query<QichezulinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QichezulinVO> selectListVO(Wrapper<QichezulinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QichezulinVO selectVO(Wrapper<QichezulinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QichezulinView> selectListView(Wrapper<QichezulinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QichezulinView selectView(Wrapper<QichezulinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
