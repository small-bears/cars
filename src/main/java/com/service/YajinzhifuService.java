package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YajinzhifuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YajinzhifuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YajinzhifuView;


/**
 * 押金支付
 *
 * @author 
 * @email 
 * @date 2022-02-25 11:46:50
 */
public interface YajinzhifuService extends IService<YajinzhifuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YajinzhifuVO> selectListVO(Wrapper<YajinzhifuEntity> wrapper);
   	
   	YajinzhifuVO selectVO(@Param("ew") Wrapper<YajinzhifuEntity> wrapper);
   	
   	List<YajinzhifuView> selectListView(Wrapper<YajinzhifuEntity> wrapper);
   	
   	YajinzhifuView selectView(@Param("ew") Wrapper<YajinzhifuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YajinzhifuEntity> wrapper);
   	

}

