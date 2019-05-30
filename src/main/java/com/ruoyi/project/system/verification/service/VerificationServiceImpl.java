package com.ruoyi.project.system.verification.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.verification.mapper.VerificationMapper;
import com.ruoyi.project.system.verification.domain.Verification;
import com.ruoyi.project.system.verification.service.IVerificationService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 验证码 服务层实现
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Service
public class VerificationServiceImpl implements IVerificationService 
{
	@Autowired
	private VerificationMapper verificationMapper;

	/**
     * 查询验证码信息
     * 
     * @param verificationId 验证码ID
     * @return 验证码信息
     */
    @Override
	public Verification selectVerificationById(Integer verificationId)
	{
	    return verificationMapper.selectVerificationById(verificationId);
	}
	
	/**
     * 查询验证码列表
     * 
     * @param verification 验证码信息
     * @return 验证码集合
     */
	@Override
	public List<Verification> selectVerificationList(Verification verification)
	{
	    return verificationMapper.selectVerificationList(verification);
	}
	
    /**
     * 新增验证码
     * 
     * @param verification 验证码信息
     * @return 结果
     */
	@Override
	public int insertVerification(Verification verification)
	{
	    return verificationMapper.insertVerification(verification);
	}
	
	/**
     * 修改验证码
     * 
     * @param verification 验证码信息
     * @return 结果
     */
	@Override
	public int updateVerification(Verification verification)
	{
	    return verificationMapper.updateVerification(verification);
	}

	/**
     * 删除验证码对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteVerificationByIds(String ids)
	{
		return verificationMapper.deleteVerificationByIds(Convert.toStrArray(ids));
	}
	
}
