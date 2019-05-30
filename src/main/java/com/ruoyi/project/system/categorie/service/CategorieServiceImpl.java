package com.ruoyi.project.system.categorie.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.categorie.mapper.CategorieMapper;
import com.ruoyi.project.system.categorie.domain.Categorie;
import com.ruoyi.project.system.categorie.service.ICategorieService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 分类 服务层实现
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Service
public class CategorieServiceImpl implements ICategorieService 
{
	@Autowired
	private CategorieMapper categorieMapper;

	/**
     * 查询分类信息
     * 
     * @param categoriesId 分类ID
     * @return 分类信息
     */
    @Override
	public Categorie selectCategorieById(Long categoriesId)
	{
	    return categorieMapper.selectCategorieById(categoriesId);
	}
	
	/**
     * 查询分类列表
     * 
     * @param categorie 分类信息
     * @return 分类集合
     */
	@Override
	public List<Categorie> selectCategorieList(Categorie categorie)
	{
	    return categorieMapper.selectCategorieList(categorie);
	}
	
    /**
     * 新增分类
     * 
     * @param categorie 分类信息
     * @return 结果
     */
	@Override
	public int insertCategorie(Categorie categorie)
	{
	    return categorieMapper.insertCategorie(categorie);
	}
	
	/**
     * 修改分类
     * 
     * @param categorie 分类信息
     * @return 结果
     */
	@Override
	public int updateCategorie(Categorie categorie)
	{
	    return categorieMapper.updateCategorie(categorie);
	}

	/**
     * 删除分类对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteCategorieByIds(String ids)
	{
		return categorieMapper.deleteCategorieByIds(Convert.toStrArray(ids));
	}
	
}
