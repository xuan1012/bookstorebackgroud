package com.ruoyi.project.system.bookmark.service;

import com.ruoyi.project.system.bookmark.domain.Bookmark;
import java.util.List;

/**
 * 收藏夹 服务层
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public interface IBookmarkService 
{
	/**
     * 查询收藏夹信息
     * 
     * @param markId 收藏夹ID
     * @return 收藏夹信息
     */
	public Bookmark selectBookmarkById(Long markId);
	
	/**
     * 查询收藏夹列表
     * 
     * @param bookmark 收藏夹信息
     * @return 收藏夹集合
     */
	public List<Bookmark> selectBookmarkList(Bookmark bookmark);
	
	/**
     * 新增收藏夹
     * 
     * @param bookmark 收藏夹信息
     * @return 结果
     */
	public int insertBookmark(Bookmark bookmark);
	
	/**
     * 修改收藏夹
     * 
     * @param bookmark 收藏夹信息
     * @return 结果
     */
	public int updateBookmark(Bookmark bookmark);
		
	/**
     * 删除收藏夹信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteBookmarkByIds(String ids);
	
}
