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


import com.dao.DiscusszulinqicheDao;
import com.entity.DiscusszulinqicheEntity;
import com.service.DiscusszulinqicheService;
import com.entity.vo.DiscusszulinqicheVO;
import com.entity.view.DiscusszulinqicheView;

@Service("discusszulinqicheService")
public class DiscusszulinqicheServiceImpl extends ServiceImpl<DiscusszulinqicheDao, DiscusszulinqicheEntity> implements DiscusszulinqicheService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszulinqicheEntity> page = this.selectPage(
                new Query<DiscusszulinqicheEntity>(params).getPage(),
                new EntityWrapper<DiscusszulinqicheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszulinqicheEntity> wrapper) {
		  Page<DiscusszulinqicheView> page =new Query<DiscusszulinqicheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszulinqicheVO> selectListVO(Wrapper<DiscusszulinqicheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszulinqicheVO selectVO(Wrapper<DiscusszulinqicheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszulinqicheView> selectListView(Wrapper<DiscusszulinqicheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszulinqicheView selectView(Wrapper<DiscusszulinqicheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
