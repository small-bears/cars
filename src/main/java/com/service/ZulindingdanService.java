package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZulindingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZulindingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZulindingdanView;


/**
 * 租赁订单
 *
 * @author 
 * @email 
 * @date 2022-02-25 11:46:49
 */
public interface ZulindingdanService extends IService<ZulindingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZulindingdanVO> selectListVO(Wrapper<ZulindingdanEntity> wrapper);
   	
   	ZulindingdanVO selectVO(@Param("ew") Wrapper<ZulindingdanEntity> wrapper);
   	
   	List<ZulindingdanView> selectListView(Wrapper<ZulindingdanEntity> wrapper);
   	
   	ZulindingdanView selectView(@Param("ew") Wrapper<ZulindingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZulindingdanEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZulindingdanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZulindingdanEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZulindingdanEntity> wrapper);
}

