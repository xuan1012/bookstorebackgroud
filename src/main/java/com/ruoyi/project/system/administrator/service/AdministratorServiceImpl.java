package com.ruoyi.project.system.administrator.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.administrator.mapper.AdministratorMapper;
import com.ruoyi.project.system.administrator.domain.Administrator;
import com.ruoyi.project.system.administrator.service.IAdministratorService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 员 服务层实现
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Service
public class AdministratorServiceImpl implements IAdministratorService 
{
	@Autowired
	private AdministratorMapper administratorMapper;

	/**
     * 查询员信息
     * 
     * @param id 员ID
     * @return 员信息
     */
    @Override
	public Administrator selectAdministratorById(Long id)
	{
	    return administratorMapper.selectAdministratorById(id);
	}
	
	/**
     * 查询员列表
     * 
     * @param administrator 员信息
     * @return 员集合
     */
	@Override
	public List<Administrator> selectAdministratorList(Administrator administrator)
	{
	    return administratorMapper.selectAdministratorList(administrator);
	}
	
    /**
     * 新增员
     * 
     * @param administrator 员信息
     * @return 结果
     */
	@Override
	public int insertAdministrator(Administrator administrator)
	{
	    return administratorMapper.insertAdministrator(administrator);
	}
	
	/**
     * 修改员
     * 
     * @param administrator 员信息
     * @return 结果
     */
	@Override
	public int updateAdministrator(Administrator administrator)
	{
	    return administratorMapper.updateAdministrator(administrator);
	}

	/**
     * 删除员对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteAdministratorByIds(String ids)
	{
		return administratorMapper.deleteAdministratorByIds(Convert.toStrArray(ids));
	}
	
}
