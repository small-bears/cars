package com.entity.view;

import com.entity.DiscusszulinqicheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 租赁汽车评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-25 11:46:50
 */
@TableName("discusszulinqiche")
public class DiscusszulinqicheView  extends DiscusszulinqicheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszulinqicheView(){
	}
 
 	public DiscusszulinqicheView(DiscusszulinqicheEntity discusszulinqicheEntity){
 	try {
			BeanUtils.copyProperties(this, discusszulinqicheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
