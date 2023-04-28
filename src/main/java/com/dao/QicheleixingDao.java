package com.dao;

import com.entity.QicheleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QicheleixingVO;
import com.entity.view.QicheleixingView;


/**
 * 汽车类型
 * 
 * @author 
 * @email 
 * @date 2022-02-25 11:46:49
 */
public interface QicheleixingDao extends BaseMapper<QicheleixingEntity> {
	
	List<QicheleixingVO> selectListVO(@Param("ew") Wrapper<QicheleixingEntity> wrapper);
	
	QicheleixingVO selectVO(@Param("ew") Wrapper<QicheleixingEntity> wrapper);
	
	List<QicheleixingView> selectListView(@Param("ew") Wrapper<QicheleixingEntity> wrapper);

	List<QicheleixingView> selectListView(Pagination page,@Param("ew") Wrapper<QicheleixingEntity> wrapper);
	
	QicheleixingView selectView(@Param("ew") Wrapper<QicheleixingEntity> wrapper);
	

}
