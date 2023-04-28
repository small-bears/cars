package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZulinqicheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZulinqicheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZulinqicheView;


/**
 * 租赁汽车
 *
 * @author 
 * @email 
 * @date 2022-02-25 11:46:49
 */
public interface ZulinqicheService extends IService<ZulinqicheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZulinqicheVO> selectListVO(Wrapper<ZulinqicheEntity> wrapper);
   	
   	ZulinqicheVO selectVO(@Param("ew") Wrapper<ZulinqicheEntity> wrapper);
   	
   	List<ZulinqicheView> selectListView(Wrapper<ZulinqicheEntity> wrapper);
   	
   	ZulinqicheView selectView(@Param("ew") Wrapper<ZulinqicheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZulinqicheEntity> wrapper);
   	

}

