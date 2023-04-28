package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QicheleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QicheleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QicheleixingView;


/**
 * 汽车类型
 *
 * @author 
 * @email 
 * @date 2022-02-25 11:46:49
 */
public interface QicheleixingService extends IService<QicheleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QicheleixingVO> selectListVO(Wrapper<QicheleixingEntity> wrapper);
   	
   	QicheleixingVO selectVO(@Param("ew") Wrapper<QicheleixingEntity> wrapper);
   	
   	List<QicheleixingView> selectListView(Wrapper<QicheleixingEntity> wrapper);
   	
   	QicheleixingView selectView(@Param("ew") Wrapper<QicheleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QicheleixingEntity> wrapper);
   	

}

