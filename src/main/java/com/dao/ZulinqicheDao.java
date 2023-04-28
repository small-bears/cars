package com.dao;

import com.entity.ZulinqicheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZulinqicheVO;
import com.entity.view.ZulinqicheView;


/**
 * 租赁汽车
 * 
 * @author 
 * @email 
 * @date 2022-02-25 11:46:49
 */
public interface ZulinqicheDao extends BaseMapper<ZulinqicheEntity> {
	
	List<ZulinqicheVO> selectListVO(@Param("ew") Wrapper<ZulinqicheEntity> wrapper);
	
	ZulinqicheVO selectVO(@Param("ew") Wrapper<ZulinqicheEntity> wrapper);
	
	List<ZulinqicheView> selectListView(@Param("ew") Wrapper<ZulinqicheEntity> wrapper);

	List<ZulinqicheView> selectListView(Pagination page,@Param("ew") Wrapper<ZulinqicheEntity> wrapper);
	
	ZulinqicheView selectView(@Param("ew") Wrapper<ZulinqicheEntity> wrapper);
	

}
