package com.ruoyi.project.system.store.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.store.mapper.StoreMapper;
import com.ruoyi.project.system.store.domain.Store;
import com.ruoyi.project.system.store.service.IStoreService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 商家 服务层实现
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Service
public class StoreServiceImpl implements IStoreService 
{
	@Autowired
	private StoreMapper storeMapper;

	/**
     * 查询商家信息
     * 
     * @param storeId 商家ID
     * @return 商家信息
     */
    @Override
	public Store selectStoreById(Integer storeId)
	{
	    return storeMapper.selectStoreById(storeId);
	}
	
	/**
     * 查询商家列表
     * 
     * @param store 商家信息
     * @return 商家集合
     */
	@Override
	public List<Store> selectStoreList(Store store)
	{
	    return storeMapper.selectStoreList(store);
	}
	
    /**
     * 新增商家
     * 
     * @param store 商家信息
     * @return 结果
     */
	@Override
	public int insertStore(Store store)
	{
	    return storeMapper.insertStore(store);
	}
	
	/**
     * 修改商家
     * 
     * @param store 商家信息
     * @return 结果
     */
	@Override
	public int updateStore(Store store)
	{
	    return storeMapper.updateStore(store);
	}

	/**
     * 删除商家对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteStoreByIds(String ids)
	{
		return storeMapper.deleteStoreByIds(Convert.toStrArray(ids));
	}
	
}
