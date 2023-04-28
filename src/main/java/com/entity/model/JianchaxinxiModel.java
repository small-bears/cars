package com.entity.model;

import com.entity.JianchaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 检查信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-25 11:46:50
 */
public class JianchaxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 汽车编号
	 */
	
	private String qichebianhao;
		
	/**
	 * 汽车品牌
	 */
	
	private String qichepinpai;
		
	/**
	 * 汽车型号
	 */
	
	private String qichexinghao;
		
	/**
	 * 车牌号
	 */
	
	private String chepaihao;
		
	/**
	 * 颜色
	 */
	
	private String yanse;
		
	/**
	 * 汽车类型
	 */
	
	private String qicheleixing;
		
	/**
	 * 租赁时间
	 */
	
	private String zulinshijian;
		
	/**
	 * 归还时间
	 */
	
	private String guihaishijian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机号码
	 */
	
	private String shoujihaoma;
		
	/**
	 * 身份证号
	 */
	
	private String shenfenzhenghao;
		
	/**
	 * 检查结果
	 */
	
	private String jianchajieguo;
		
	/**
	 * 存在问题
	 */
	
	private String cunzaiwenti;
		
	/**
	 * 赔付金额
	 */
	
	private Integer peifujine;
		
	/**
	 * 检查时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jianchashijian;
		
	/**
	 * 业务员账号
	 */
	
	private String yewuyuanzhanghao;
		
	/**
	 * 业务员姓名
	 */
	
	private String yewuyuanxingming;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：汽车编号
	 */
	 
	public void setQichebianhao(String qichebianhao) {
		this.qichebianhao = qichebianhao;
	}
	
	/**
	 * 获取：汽车编号
	 */
	public String getQichebianhao() {
		return qichebianhao;
	}
				
	
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
	 * 设置：租赁时间
	 */
	 
	public void setZulinshijian(String zulinshijian) {
		this.zulinshijian = zulinshijian;
	}
	
	/**
	 * 获取：租赁时间
	 */
	public String getZulinshijian() {
		return zulinshijian;
	}
				
	
	/**
	 * 设置：归还时间
	 */
	 
	public void setGuihaishijian(String guihaishijian) {
		this.guihaishijian = guihaishijian;
	}
	
	/**
	 * 获取：归还时间
	 */
	public String getGuihaishijian() {
		return guihaishijian;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机号码
	 */
	 
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
				
	
	/**
	 * 设置：身份证号
	 */
	 
	public void setShenfenzhenghao(String shenfenzhenghao) {
		this.shenfenzhenghao = shenfenzhenghao;
	}
	
	/**
	 * 获取：身份证号
	 */
	public String getShenfenzhenghao() {
		return shenfenzhenghao;
	}
				
	
	/**
	 * 设置：检查结果
	 */
	 
	public void setJianchajieguo(String jianchajieguo) {
		this.jianchajieguo = jianchajieguo;
	}
	
	/**
	 * 获取：检查结果
	 */
	public String getJianchajieguo() {
		return jianchajieguo;
	}
				
	
	/**
	 * 设置：存在问题
	 */
	 
	public void setCunzaiwenti(String cunzaiwenti) {
		this.cunzaiwenti = cunzaiwenti;
	}
	
	/**
	 * 获取：存在问题
	 */
	public String getCunzaiwenti() {
		return cunzaiwenti;
	}
				
	
	/**
	 * 设置：赔付金额
	 */
	 
	public void setPeifujine(Integer peifujine) {
		this.peifujine = peifujine;
	}
	
	/**
	 * 获取：赔付金额
	 */
	public Integer getPeifujine() {
		return peifujine;
	}
				
	
	/**
	 * 设置：检查时间
	 */
	 
	public void setJianchashijian(Date jianchashijian) {
		this.jianchashijian = jianchashijian;
	}
	
	/**
	 * 获取：检查时间
	 */
	public Date getJianchashijian() {
		return jianchashijian;
	}
				
	
	/**
	 * 设置：业务员账号
	 */
	 
	public void setYewuyuanzhanghao(String yewuyuanzhanghao) {
		this.yewuyuanzhanghao = yewuyuanzhanghao;
	}
	
	/**
	 * 获取：业务员账号
	 */
	public String getYewuyuanzhanghao() {
		return yewuyuanzhanghao;
	}
				
	
	/**
	 * 设置：业务员姓名
	 */
	 
	public void setYewuyuanxingming(String yewuyuanxingming) {
		this.yewuyuanxingming = yewuyuanxingming;
	}
	
	/**
	 * 获取：业务员姓名
	 */
	public String getYewuyuanxingming() {
		return yewuyuanxingming;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
