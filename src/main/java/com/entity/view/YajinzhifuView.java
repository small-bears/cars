package com.entity.view;

import com.entity.YajinzhifuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 押金支付
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-25 11:46:50
 */
@TableName("yajinzhifu")
public class YajinzhifuView  extends YajinzhifuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YajinzhifuView(){
	}
 
 	public YajinzhifuView(YajinzhifuEntity yajinzhifuEntity){
 	try {
			BeanUtils.copyProperties(this, yajinzhifuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
