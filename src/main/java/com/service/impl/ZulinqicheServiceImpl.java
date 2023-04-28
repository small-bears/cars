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


import com.dao.ZulinqicheDao;
import com.entity.ZulinqicheEntity;
import com.service.ZulinqicheService;
import com.entity.vo.ZulinqicheVO;
import com.entity.view.ZulinqicheView;

@Service("zulinqicheService")
public class ZulinqicheServiceImpl extends ServiceImpl<ZulinqicheDao, ZulinqicheEntity> implements ZulinqicheService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZulinqicheEntity> page = this.selectPage(
                new Query<ZulinqicheEntity>(params).getPage(),
                new EntityWrapper<ZulinqicheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZulinqicheEntity> wrapper) {
		  Page<ZulinqicheView> page =new Query<ZulinqicheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZulinqicheVO> selectListVO(Wrapper<ZulinqicheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZulinqicheVO selectVO(Wrapper<ZulinqicheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZulinqicheView> selectListView(Wrapper<ZulinqicheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZulinqicheView selectView(Wrapper<ZulinqicheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
