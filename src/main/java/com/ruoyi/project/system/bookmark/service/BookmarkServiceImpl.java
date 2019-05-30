package com.ruoyi.project.system.bookmark.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.bookmark.mapper.BookmarkMapper;
import com.ruoyi.project.system.bookmark.domain.Bookmark;
import com.ruoyi.project.system.bookmark.service.IBookmarkService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 收藏夹 服务层实现
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Service
public class BookmarkServiceImpl implements IBookmarkService 
{
	@Autowired
	private BookmarkMapper bookmarkMapper;

	/**
     * 查询收藏夹信息
     * 
     * @param markId 收藏夹ID
     * @return 收藏夹信息
     */
    @Override
	public Bookmark selectBookmarkById(Long markId)
	{
	    return bookmarkMapper.selectBookmarkById(markId);
	}
	
	/**
     * 查询收藏夹列表
     * 
     * @param bookmark 收藏夹信息
     * @return 收藏夹集合
     */
	@Override
	public List<Bookmark> selectBookmarkList(Bookmark bookmark)
	{
	    return bookmarkMapper.selectBookmarkList(bookmark);
	}
	
    /**
     * 新增收藏夹
     * 
     * @param bookmark 收藏夹信息
     * @return 结果
     */
	@Override
	public int insertBookmark(Bookmark bookmark)
	{
	    return bookmarkMapper.insertBookmark(bookmark);
	}
	
	/**
     * 修改收藏夹
     * 
     * @param bookmark 收藏夹信息
     * @return 结果
     */
	@Override
	public int updateBookmark(Bookmark bookmark)
	{
	    return bookmarkMapper.updateBookmark(bookmark);
	}

	/**
     * 删除收藏夹对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteBookmarkByIds(String ids)
	{
		return bookmarkMapper.deleteBookmarkByIds(Convert.toStrArray(ids));
	}
	
}
