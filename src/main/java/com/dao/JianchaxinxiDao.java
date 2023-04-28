package com.dao;

import com.entity.JianchaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianchaxinxiVO;
import com.entity.view.JianchaxinxiView;


/**
 * 检查信息
 * 
 * @author 
 * @email 
 * @date 2022-02-25 11:46:50
 */
public interface JianchaxinxiDao extends BaseMapper<JianchaxinxiEntity> {
	
	List<JianchaxinxiVO> selectListVO(@Param("ew") Wrapper<JianchaxinxiEntity> wrapper);
	
	JianchaxinxiVO selectVO(@Param("ew") Wrapper<JianchaxinxiEntity> wrapper);
	
	List<JianchaxinxiView> selectListView(@Param("ew") Wrapper<JianchaxinxiEntity> wrapper);

	List<JianchaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JianchaxinxiEntity> wrapper);
	
	JianchaxinxiView selectView(@Param("ew") Wrapper<JianchaxinxiEntity> wrapper);
	

}
