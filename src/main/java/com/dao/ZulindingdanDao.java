package com.dao;

import com.entity.ZulindingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZulindingdanVO;
import com.entity.view.ZulindingdanView;


/**
 * 租赁订单
 * 
 * @author 
 * @email 
 * @date 2022-02-25 11:46:49
 */
public interface ZulindingdanDao extends BaseMapper<ZulindingdanEntity> {
	
	List<ZulindingdanVO> selectListVO(@Param("ew") Wrapper<ZulindingdanEntity> wrapper);
	
	ZulindingdanVO selectVO(@Param("ew") Wrapper<ZulindingdanEntity> wrapper);
	
	List<ZulindingdanView> selectListView(@Param("ew") Wrapper<ZulindingdanEntity> wrapper);

	List<ZulindingdanView> selectListView(Pagination page,@Param("ew") Wrapper<ZulindingdanEntity> wrapper);
	
	ZulindingdanView selectView(@Param("ew") Wrapper<ZulindingdanEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZulindingdanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZulindingdanEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZulindingdanEntity> wrapper);
}
