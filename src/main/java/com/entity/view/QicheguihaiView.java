package com.entity.view;

import com.entity.QicheguihaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 汽车归还
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-25 11:46:49
 */
@TableName("qicheguihai")
public class QicheguihaiView  extends QicheguihaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QicheguihaiView(){
	}
 
 	public QicheguihaiView(QicheguihaiEntity qicheguihaiEntity){
 	try {
			BeanUtils.copyProperties(this, qicheguihaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
