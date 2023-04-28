package com.dao;

import com.entity.DiscusszulinqicheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszulinqicheVO;
import com.entity.view.DiscusszulinqicheView;


/**
 * 租赁汽车评论表
 * 
 * @author 
 * @email 
 * @date 2022-02-25 11:46:50
 */
public interface DiscusszulinqicheDao extends BaseMapper<DiscusszulinqicheEntity> {
	
	List<DiscusszulinqicheVO> selectListVO(@Param("ew") Wrapper<DiscusszulinqicheEntity> wrapper);
	
	DiscusszulinqicheVO selectVO(@Param("ew") Wrapper<DiscusszulinqicheEntity> wrapper);
	
	List<DiscusszulinqicheView> selectListView(@Param("ew") Wrapper<DiscusszulinqicheEntity> wrapper);

	List<DiscusszulinqicheView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszulinqicheEntity> wrapper);
	
	DiscusszulinqicheView selectView(@Param("ew") Wrapper<DiscusszulinqicheEntity> wrapper);
	

}
