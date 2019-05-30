package com.ruoyi.project.system.categorie.mapper;

import com.ruoyi.project.system.categorie.domain.Categorie;
import java.util.List;	

/**
 * 分类 数据层
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public interface CategorieMapper 
{
	/**
     * 查询分类信息
     * 
     * @param categoriesId 分类ID
     * @return 分类信息
     */
	public Categorie selectCategorieById(Long categoriesId);
	
	/**
     * 查询分类列表
     * 
     * @param categorie 分类信息
     * @return 分类集合
     */
	public List<Categorie> selectCategorieList(Categorie categorie);
	
	/**
     * 新增分类
     * 
     * @param categorie 分类信息
     * @return 结果
     */
	public int insertCategorie(Categorie categorie);
	
	/**
     * 修改分类
     * 
     * @param categorie 分类信息
     * @return 结果
     */
	public int updateCategorie(Categorie categorie);
	
	/**
     * 删除分类
     * 
     * @param categoriesId 分类ID
     * @return 结果
     */
	public int deleteCategorieById(Long categoriesId);
	
	/**
     * 批量删除分类
     * 
     * @param categoriesIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteCategorieByIds(String[] categoriesIds);
	
}