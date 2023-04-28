package com.entity.view;

import com.entity.ZulindingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 租赁订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-25 11:46:49
 */
@TableName("zulindingdan")
public class ZulindingdanView  extends ZulindingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZulindingdanView(){
	}
 
 	public ZulindingdanView(ZulindingdanEntity zulindingdanEntity){
 	try {
			BeanUtils.copyProperties(this, zulindingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
