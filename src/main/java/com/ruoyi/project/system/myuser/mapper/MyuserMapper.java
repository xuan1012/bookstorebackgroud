package com.ruoyi.project.system.myuser.mapper;

import com.ruoyi.project.system.myuser.domain.Myuser;
import java.util.List;	

/**
 * 用户 数据层
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public interface MyuserMapper 
{
	/**
     * 查询用户信息
     * 
     * @param userId 用户ID
     * @return 用户信息
     */
	public Myuser selectMyuserById(Long userId);
	
	/**
     * 查询用户列表
     * 
     * @param myuser 用户信息
     * @return 用户集合
     */
	public List<Myuser> selectMyuserList(Myuser myuser);
	
	/**
     * 新增用户
     * 
     * @param myuser 用户信息
     * @return 结果
     */
	public int insertMyuser(Myuser myuser);
	
	/**
     * 修改用户
     * 
     * @param myuser 用户信息
     * @return 结果
     */
	public int updateMyuser(Myuser myuser);
	
	/**
     * 删除用户
     * 
     * @param userId 用户ID
     * @return 结果
     */
	public int deleteMyuserById(Long userId);
	
	/**
     * 批量删除用户
     * 
     * @param userIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteMyuserByIds(String[] userIds);
	
}