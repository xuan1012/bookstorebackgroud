package com.ruoyi.project.system.address.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.address.mapper.AddressMapper;
import com.ruoyi.project.system.address.domain.Address;
import com.ruoyi.project.system.address.service.IAddressService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 用户地址 服务层实现
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Service
public class AddressServiceImpl implements IAddressService 
{
	@Autowired
	private AddressMapper addressMapper;

	/**
     * 查询用户地址信息
     * 
     * @param addressId 用户地址ID
     * @return 用户地址信息
     */
    @Override
	public Address selectAddressById(Long addressId)
	{
	    return addressMapper.selectAddressById(addressId);
	}
	
	/**
     * 查询用户地址列表
     * 
     * @param address 用户地址信息
     * @return 用户地址集合
     */
	@Override
	public List<Address> selectAddressList(Address address)
	{
	    return addressMapper.selectAddressList(address);
	}
	
    /**
     * 新增用户地址
     * 
     * @param address 用户地址信息
     * @return 结果
     */
	@Override
	public int insertAddress(Address address)
	{
	    return addressMapper.insertAddress(address);
	}
	
	/**
     * 修改用户地址
     * 
     * @param address 用户地址信息
     * @return 结果
     */
	@Override
	public int updateAddress(Address address)
	{
	    return addressMapper.updateAddress(address);
	}

	/**
     * 删除用户地址对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteAddressByIds(String ids)
	{
		return addressMapper.deleteAddressByIds(Convert.toStrArray(ids));
	}
	
}
