package com.ruoyi.project.system.myuser.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.myuser.mapper.MyuserMapper;
import com.ruoyi.project.system.myuser.domain.Myuser;
import com.ruoyi.project.system.myuser.service.IMyuserService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 用户 服务层实现
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Service
public class MyuserServiceImpl implements IMyuserService 
{
	@Autowired
	private MyuserMapper myuserMapper;

	/**
     * 查询用户信息
     * 
     * @param userId 用户ID
     * @return 用户信息
     */
    @Override
	public Myuser selectMyuserById(Long userId)
	{
	    return myuserMapper.selectMyuserById(userId);
	}
	
	/**
     * 查询用户列表
     * 
     * @param myuser 用户信息
     * @return 用户集合
     */
	@Override
	public List<Myuser> selectMyuserList(Myuser myuser)
	{
	    return myuserMapper.selectMyuserList(myuser);
	}
	
    /**
     * 新增用户
     * 
     * @param myuser 用户信息
     * @return 结果
     */
	@Override
	public int insertMyuser(Myuser myuser)
	{
	    return myuserMapper.insertMyuser(myuser);
	}
	
	/**
     * 修改用户
     * 
     * @param myuser 用户信息
     * @return 结果
     */
	@Override
	public int updateMyuser(Myuser myuser)
	{
	    return myuserMapper.updateMyuser(myuser);
	}

	/**
     * 删除用户对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteMyuserByIds(String ids)
	{
		return myuserMapper.deleteMyuserByIds(Convert.toStrArray(ids));
	}
	
}
