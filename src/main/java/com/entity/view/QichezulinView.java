package com.entity.view;

import com.entity.QichezulinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 汽车租赁
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-25 11:46:49
 */
@TableName("qichezulin")
public class QichezulinView  extends QichezulinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QichezulinView(){
	}
 
 	public QichezulinView(QichezulinEntity qichezulinEntity){
 	try {
			BeanUtils.copyProperties(this, qichezulinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
