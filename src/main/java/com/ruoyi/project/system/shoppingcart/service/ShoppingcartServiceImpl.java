package com.ruoyi.project.system.shoppingcart.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.shoppingcart.mapper.ShoppingcartMapper;
import com.ruoyi.project.system.shoppingcart.domain.Shoppingcart;
import com.ruoyi.project.system.shoppingcart.service.IShoppingcartService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 购物车 服务层实现
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Service
public class ShoppingcartServiceImpl implements IShoppingcartService 
{
	@Autowired
	private ShoppingcartMapper shoppingcartMapper;

	/**
     * 查询购物车信息
     * 
     * @param cartId 购物车ID
     * @return 购物车信息
     */
    @Override
	public Shoppingcart selectShoppingcartById(Long cartId)
	{
	    return shoppingcartMapper.selectShoppingcartById(cartId);
	}
	
	/**
     * 查询购物车列表
     * 
     * @param shoppingcart 购物车信息
     * @return 购物车集合
     */
	@Override
	public List<Shoppingcart> selectShoppingcartList(Shoppingcart shoppingcart)
	{
	    return shoppingcartMapper.selectShoppingcartList(shoppingcart);
	}
	
    /**
     * 新增购物车
     * 
     * @param shoppingcart 购物车信息
     * @return 结果
     */
	@Override
	public int insertShoppingcart(Shoppingcart shoppingcart)
	{
	    return shoppingcartMapper.insertShoppingcart(shoppingcart);
	}
	
	/**
     * 修改购物车
     * 
     * @param shoppingcart 购物车信息
     * @return 结果
     */
	@Override
	public int updateShoppingcart(Shoppingcart shoppingcart)
	{
	    return shoppingcartMapper.updateShoppingcart(shoppingcart);
	}

	/**
     * 删除购物车对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteShoppingcartByIds(String ids)
	{
		return shoppingcartMapper.deleteShoppingcartByIds(Convert.toStrArray(ids));
	}
	
}
