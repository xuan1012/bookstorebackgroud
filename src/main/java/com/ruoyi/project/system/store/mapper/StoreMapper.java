package com.ruoyi.project.system.store.mapper;

import com.ruoyi.project.system.store.domain.Store;
import java.util.List;	

/**
 * 商家 数据层
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public interface StoreMapper 
{
	/**
     * 查询商家信息
     * 
     * @param storeId 商家ID
     * @return 商家信息
     */
	public Store selectStoreById(Integer storeId);
	
	/**
     * 查询商家列表
     * 
     * @param store 商家信息
     * @return 商家集合
     */
	public List<Store> selectStoreList(Store store);
	
	/**
     * 新增商家
     * 
     * @param store 商家信息
     * @return 结果
     */
	public int insertStore(Store store);
	
	/**
     * 修改商家
     * 
     * @param store 商家信息
     * @return 结果
     */
	public int updateStore(Store store);
	
	/**
     * 删除商家
     * 
     * @param storeId 商家ID
     * @return 结果
     */
	public int deleteStoreById(Integer storeId);
	
	/**
     * 批量删除商家
     * 
     * @param storeIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteStoreByIds(String[] storeIds);
	
}