package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QicheguihaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QicheguihaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QicheguihaiView;


/**
 * 汽车归还
 *
 * @author 
 * @email 
 * @date 2022-02-25 11:46:49
 */
public interface QicheguihaiService extends IService<QicheguihaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QicheguihaiVO> selectListVO(Wrapper<QicheguihaiEntity> wrapper);
   	
   	QicheguihaiVO selectVO(@Param("ew") Wrapper<QicheguihaiEntity> wrapper);
   	
   	List<QicheguihaiView> selectListView(Wrapper<QicheguihaiEntity> wrapper);
   	
   	QicheguihaiView selectView(@Param("ew") Wrapper<QicheguihaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QicheguihaiEntity> wrapper);
   	

}

