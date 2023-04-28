package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszulinqicheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszulinqicheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszulinqicheView;


/**
 * 租赁汽车评论表
 *
 * @author 
 * @email 
 * @date 2022-02-25 11:46:50
 */
public interface DiscusszulinqicheService extends IService<DiscusszulinqicheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszulinqicheVO> selectListVO(Wrapper<DiscusszulinqicheEntity> wrapper);
   	
   	DiscusszulinqicheVO selectVO(@Param("ew") Wrapper<DiscusszulinqicheEntity> wrapper);
   	
   	List<DiscusszulinqicheView> selectListView(Wrapper<DiscusszulinqicheEntity> wrapper);
   	
   	DiscusszulinqicheView selectView(@Param("ew") Wrapper<DiscusszulinqicheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszulinqicheEntity> wrapper);
   	

}

