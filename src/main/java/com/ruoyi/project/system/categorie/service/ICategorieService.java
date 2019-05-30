package com.ruoyi.project.system.categorie.service;

import com.ruoyi.project.system.categorie.domain.Categorie;
import java.util.List;

/**
 * 分类 服务层
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public interface ICategorieService 
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
     * 删除分类信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteCategorieByIds(String ids);
	
}
