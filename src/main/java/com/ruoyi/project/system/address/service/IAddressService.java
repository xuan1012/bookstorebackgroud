package com.ruoyi.project.system.address.service;

import com.ruoyi.project.system.address.domain.Address;
import java.util.List;

/**
 * 用户地址 服务层
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public interface IAddressService 
{
	/**
     * 查询用户地址信息
     * 
     * @param addressId 用户地址ID
     * @return 用户地址信息
     */
	public Address selectAddressById(Long addressId);
	
	/**
     * 查询用户地址列表
     * 
     * @param address 用户地址信息
     * @return 用户地址集合
     */
	public List<Address> selectAddressList(Address address);
	
	/**
     * 新增用户地址
     * 
     * @param address 用户地址信息
     * @return 结果
     */
	public int insertAddress(Address address);
	
	/**
     * 修改用户地址
     * 
     * @param address 用户地址信息
     * @return 结果
     */
	public int updateAddress(Address address);
		
	/**
     * 删除用户地址信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteAddressByIds(String ids);
	
}
