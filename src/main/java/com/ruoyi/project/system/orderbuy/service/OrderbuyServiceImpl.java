package com.ruoyi.project.system.orderbuy.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.orderbuy.mapper.OrderbuyMapper;
import com.ruoyi.project.system.orderbuy.domain.Orderbuy;
import com.ruoyi.project.system.orderbuy.service.IOrderbuyService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 订单 服务层实现
 * 
 * @author ruoyi
 * @date 2019-06-11
 */
@Service
public class OrderbuyServiceImpl implements IOrderbuyService 
{
	@Autowired
	private OrderbuyMapper orderbuyMapper;

	/**
     * 查询订单信息
     * 
     * @param orderId 订单ID
     * @return 订单信息
     */
    @Override
	public Orderbuy selectOrderbuyById(Long orderId)
	{
	    return orderbuyMapper.selectOrderbuyById(orderId);
	}
	
	/**
     * 查询订单列表
     * 
     * @param orderbuy 订单信息
     * @return 订单集合
     */
	@Override
	public List<Orderbuy> selectOrderbuyList(Orderbuy orderbuy)
	{
	    return orderbuyMapper.selectOrderbuyList(orderbuy);
	}
	
    /**
     * 新增订单
     * 
     * @param orderbuy 订单信息
     * @return 结果
     */
	@Override
	public int insertOrderbuy(Orderbuy orderbuy)
	{
	    return orderbuyMapper.insertOrderbuy(orderbuy);
	}
	
	/**
     * 修改订单
     * 
     * @param orderbuy 订单信息
     * @return 结果
     */
	@Override
	public int updateOrderbuy(Orderbuy orderbuy)
	{
	    return orderbuyMapper.updateOrderbuy(orderbuy);
	}

	/**
     * 删除订单对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteOrderbuyByIds(String ids)
	{
		return orderbuyMapper.deleteOrderbuyByIds(Convert.toStrArray(ids));
	}
	
}
