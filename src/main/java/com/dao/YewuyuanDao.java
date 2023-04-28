package com.dao;

import com.entity.YewuyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YewuyuanVO;
import com.entity.view.YewuyuanView;


/**
 * 业务员
 * 
 * @author 
 * @email 
 * @date 2022-02-25 11:46:49
 */
public interface YewuyuanDao extends BaseMapper<YewuyuanEntity> {
	
	List<YewuyuanVO> selectListVO(@Param("ew") Wrapper<YewuyuanEntity> wrapper);
	
	YewuyuanVO selectVO(@Param("ew") Wrapper<YewuyuanEntity> wrapper);
	
	List<YewuyuanView> selectListView(@Param("ew") Wrapper<YewuyuanEntity> wrapper);

	List<YewuyuanView> selectListView(Pagination page,@Param("ew") Wrapper<YewuyuanEntity> wrapper);
	
	YewuyuanView selectView(@Param("ew") Wrapper<YewuyuanEntity> wrapper);
	

}
