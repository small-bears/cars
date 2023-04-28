package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YewuyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YewuyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YewuyuanView;


/**
 * 业务员
 *
 * @author 
 * @email 
 * @date 2022-02-25 11:46:49
 */
public interface YewuyuanService extends IService<YewuyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YewuyuanVO> selectListVO(Wrapper<YewuyuanEntity> wrapper);
   	
   	YewuyuanVO selectVO(@Param("ew") Wrapper<YewuyuanEntity> wrapper);
   	
   	List<YewuyuanView> selectListView(Wrapper<YewuyuanEntity> wrapper);
   	
   	YewuyuanView selectView(@Param("ew") Wrapper<YewuyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YewuyuanEntity> wrapper);
   	

}

