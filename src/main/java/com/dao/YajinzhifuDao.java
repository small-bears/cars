package com.dao;

import com.entity.YajinzhifuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YajinzhifuVO;
import com.entity.view.YajinzhifuView;


/**
 * 押金支付
 * 
 * @author 
 * @email 
 * @date 2022-02-25 11:46:50
 */
public interface YajinzhifuDao extends BaseMapper<YajinzhifuEntity> {
	
	List<YajinzhifuVO> selectListVO(@Param("ew") Wrapper<YajinzhifuEntity> wrapper);
	
	YajinzhifuVO selectVO(@Param("ew") Wrapper<YajinzhifuEntity> wrapper);
	
	List<YajinzhifuView> selectListView(@Param("ew") Wrapper<YajinzhifuEntity> wrapper);

	List<YajinzhifuView> selectListView(Pagination page,@Param("ew") Wrapper<YajinzhifuEntity> wrapper);
	
	YajinzhifuView selectView(@Param("ew") Wrapper<YajinzhifuEntity> wrapper);
	

}
