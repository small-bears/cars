package com.entity.model;

import com.entity.ZulinqicheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 租赁汽车
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-25 11:46:49
 */
public class ZulinqicheModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 汽车品牌
	 */
	
	private String qichepinpai;
		
	/**
	 * 汽车型号
	 */
	
	private String qichexinghao;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 汽车类型
	 */
	
	private String qicheleixing;
		
	/**
	 * 车牌号
	 */
	
	private String chepaihao;
		
	/**
	 * 颜色
	 */
	
	private String yanse;
		
	/**
	 * 押金
	 */
	
	private Integer yajin;
		
	/**
	 * 日租价格
	 */
	
	private Integer rizujiage;
		
	/**
	 * 租赁状态
	 */
	
	private String zulinzhuangtai;
		
	/**
	 * 汽车详情
	 */
	
	private String qichexiangqing;
		
	/**
	 * 提车地点
	 */
	
	private String tichedidian;
				
	
	/**
	 * 设置：汽车品牌
	 */
	 
	public void setQichepinpai(String qichepinpai) {
		this.qichepinpai = qichepinpai;
	}
	
	/**
	 * 获取：汽车品牌
	 */
	public String getQichepinpai() {
		return qichepinpai;
	}
				
	
	/**
	 * 设置：汽车型号
	 */
	 
	public void setQichexinghao(String qichexinghao) {
		this.qichexinghao = qichexinghao;
	}
	
	/**
	 * 获取：汽车型号
	 */
	public String getQichexinghao() {
		return qichexinghao;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：汽车类型
	 */
	 
	public void setQicheleixing(String qicheleixing) {
		this.qicheleixing = qicheleixing;
	}
	
	/**
	 * 获取：汽车类型
	 */
	public String getQicheleixing() {
		return qicheleixing;
	}
				
	
	/**
	 * 设置：车牌号
	 */
	 
	public void setChepaihao(String chepaihao) {
		this.chepaihao = chepaihao;
	}
	
	/**
	 * 获取：车牌号
	 */
	public String getChepaihao() {
		return chepaihao;
	}
				
	
	/**
	 * 设置：颜色
	 */
	 
	public void setYanse(String yanse) {
		this.yanse = yanse;
	}
	
	/**
	 * 获取：颜色
	 */
	public String getYanse() {
		return yanse;
	}
				
	
	/**
	 * 设置：押金
	 */
	 
	public void setYajin(Integer yajin) {
		this.yajin = yajin;
	}
	
	/**
	 * 获取：押金
	 */
	public Integer getYajin() {
		return yajin;
	}
				
	
	/**
	 * 设置：日租价格
	 */
	 
	public void setRizujiage(Integer rizujiage) {
		this.rizujiage = rizujiage;
	}
	
	/**
	 * 获取：日租价格
	 */
	public Integer getRizujiage() {
		return rizujiage;
	}
				
	
	/**
	 * 设置：租赁状态
	 */
	 
	public void setZulinzhuangtai(String zulinzhuangtai) {
		this.zulinzhuangtai = zulinzhuangtai;
	}
	
	/**
	 * 获取：租赁状态
	 */
	public String getZulinzhuangtai() {
		return zulinzhuangtai;
	}
				
	
	/**
	 * 设置：汽车详情
	 */
	 
	public void setQichexiangqing(String qichexiangqing) {
		this.qichexiangqing = qichexiangqing;
	}
	
	/**
	 * 获取：汽车详情
	 */
	public String getQichexiangqing() {
		return qichexiangqing;
	}
				
	
	/**
	 * 设置：提车地点
	 */
	 
	public void setTichedidian(String tichedidian) {
		this.tichedidian = tichedidian;
	}
	
	/**
	 * 获取：提车地点
	 */
	public String getTichedidian() {
		return tichedidian;
	}
			
}
