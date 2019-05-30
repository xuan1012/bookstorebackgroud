package com.ruoyi.project.system.shoppingcart.mapper;

import com.ruoyi.project.system.shoppingcart.domain.Shoppingcart;
import java.util.List;	

/**
 * 购物车 数据层
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public interface ShoppingcartMapper 
{
	/**
     * 查询购物车信息
     * 
     * @param cartId 购物车ID
     * @return 购物车信息
     */
	public Shoppingcart selectShoppingcartById(Long cartId);
	
	/**
     * 查询购物车列表
     * 
     * @param shoppingcart 购物车信息
     * @return 购物车集合
     */
	public List<Shoppingcart> selectShoppingcartList(Shoppingcart shoppingcart);
	
	/**
     * 新增购物车
     * 
     * @param shoppingcart 购物车信息
     * @return 结果
     */
	public int insertShoppingcart(Shoppingcart shoppingcart);
	
	/**
     * 修改购物车
     * 
     * @param shoppingcart 购物车信息
     * @return 结果
     */
	public int updateShoppingcart(Shoppingcart shoppingcart);
	
	/**
     * 删除购物车
     * 
     * @param cartId 购物车ID
     * @return 结果
     */
	public int deleteShoppingcartById(Long cartId);
	
	/**
     * 批量删除购物车
     * 
     * @param cartIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteShoppingcartByIds(String[] cartIds);
	
}