package com.ruoyi.project.system.orderbuy.mapper;

import com.ruoyi.project.system.orderbuy.domain.Orderbuy;
import java.util.List;	

/**
 * 订单 数据层
 * 
 * @author ruoyi
 * @date 2019-06-11
 */
public interface OrderbuyMapper 
{
	/**
     * 查询订单信息
     * 
     * @param orderId 订单ID
     * @return 订单信息
     */
	public Orderbuy selectOrderbuyById(Long orderId);
	
	/**
     * 查询订单列表
     * 
     * @param orderbuy 订单信息
     * @return 订单集合
     */
	public List<Orderbuy> selectOrderbuyList(Orderbuy orderbuy);
	
	/**
     * 新增订单
     * 
     * @param orderbuy 订单信息
     * @return 结果
     */
	public int insertOrderbuy(Orderbuy orderbuy);
	
	/**
     * 修改订单
     * 
     * @param orderbuy 订单信息
     * @return 结果
     */
	public int updateOrderbuy(Orderbuy orderbuy);
	
	/**
     * 删除订单
     * 
     * @param orderId 订单ID
     * @return 结果
     */
	public int deleteOrderbuyById(Long orderId);
	
	/**
     * 批量删除订单
     * 
     * @param orderIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrderbuyByIds(String[] orderIds);
	
}