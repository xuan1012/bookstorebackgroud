package com.ruoyi.project.system.administrator.service;

import com.ruoyi.project.system.administrator.domain.Administrator;
import java.util.List;

/**
 * 员 服务层
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public interface IAdministratorService 
{
	/**
     * 查询员信息
     * 
     * @param id 员ID
     * @return 员信息
     */
	public Administrator selectAdministratorById(Long id);
	
	/**
     * 查询员列表
     * 
     * @param administrator 员信息
     * @return 员集合
     */
	public List<Administrator> selectAdministratorList(Administrator administrator);
	
	/**
     * 新增员
     * 
     * @param administrator 员信息
     * @return 结果
     */
	public int insertAdministrator(Administrator administrator);
	
	/**
     * 修改员
     * 
     * @param administrator 员信息
     * @return 结果
     */
	public int updateAdministrator(Administrator administrator);
		
	/**
     * 删除员信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteAdministratorByIds(String ids);
	
}
