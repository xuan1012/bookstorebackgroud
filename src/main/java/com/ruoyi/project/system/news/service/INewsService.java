package com.ruoyi.project.system.news.service;

import com.ruoyi.project.system.news.domain.News;
import java.util.List;

/**
 * 新闻 服务层
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public interface INewsService 
{
	/**
     * 查询新闻信息
     * 
     * @param newsId 新闻ID
     * @return 新闻信息
     */
	public News selectNewsById(Long newsId);
	
	/**
     * 查询新闻列表
     * 
     * @param news 新闻信息
     * @return 新闻集合
     */
	public List<News> selectNewsList(News news);
	
	/**
     * 新增新闻
     * 
     * @param news 新闻信息
     * @return 结果
     */
	public int insertNews(News news);
	
	/**
     * 修改新闻
     * 
     * @param news 新闻信息
     * @return 结果
     */
	public int updateNews(News news);
		
	/**
     * 删除新闻信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteNewsByIds(String ids);
	
}
