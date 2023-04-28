package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QichezulinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QichezulinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QichezulinView;


/**
 * 汽车租赁
 *
 * @author 
 * @email 
 * @date 2022-02-25 11:46:49
 */
public interface QichezulinService extends IService<QichezulinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QichezulinVO> selectListVO(Wrapper<QichezulinEntity> wrapper);
   	
   	QichezulinVO selectVO(@Param("ew") Wrapper<QichezulinEntity> wrapper);
   	
   	List<QichezulinView> selectListView(Wrapper<QichezulinEntity> wrapper);
   	
   	QichezulinView selectView(@Param("ew") Wrapper<QichezulinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QichezulinEntity> wrapper);
   	

}

