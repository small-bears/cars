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


import com.dao.QicheguihaiDao;
import com.entity.QicheguihaiEntity;
import com.service.QicheguihaiService;
import com.entity.vo.QicheguihaiVO;
import com.entity.view.QicheguihaiView;

@Service("qicheguihaiService")
public class QicheguihaiServiceImpl extends ServiceImpl<QicheguihaiDao, QicheguihaiEntity> implements QicheguihaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QicheguihaiEntity> page = this.selectPage(
                new Query<QicheguihaiEntity>(params).getPage(),
                new EntityWrapper<QicheguihaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QicheguihaiEntity> wrapper) {
		  Page<QicheguihaiView> page =new Query<QicheguihaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QicheguihaiVO> selectListVO(Wrapper<QicheguihaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QicheguihaiVO selectVO(Wrapper<QicheguihaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QicheguihaiView> selectListView(Wrapper<QicheguihaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QicheguihaiView selectView(Wrapper<QicheguihaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
