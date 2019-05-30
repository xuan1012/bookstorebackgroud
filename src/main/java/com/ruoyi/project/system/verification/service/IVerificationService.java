package com.ruoyi.project.system.verification.service;

import com.ruoyi.project.system.verification.domain.Verification;
import java.util.List;

/**
 * 验证码 服务层
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public interface IVerificationService 
{
	/**
     * 查询验证码信息
     * 
     * @param verificationId 验证码ID
     * @return 验证码信息
     */
	public Verification selectVerificationById(Integer verificationId);
	
	/**
     * 查询验证码列表
     * 
     * @param verification 验证码信息
     * @return 验证码集合
     */
	public List<Verification> selectVerificationList(Verification verification);
	
	/**
     * 新增验证码
     * 
     * @param verification 验证码信息
     * @return 结果
     */
	public int insertVerification(Verification verification);
	
	/**
     * 修改验证码
     * 
     * @param verification 验证码信息
     * @return 结果
     */
	public int updateVerification(Verification verification);
		
	/**
     * 删除验证码信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteVerificationByIds(String ids);
	
}
