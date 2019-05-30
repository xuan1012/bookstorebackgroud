package com.ruoyi.project.system.news.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.news.mapper.NewsMapper;
import com.ruoyi.project.system.news.domain.News;
import com.ruoyi.project.system.news.service.INewsService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 新闻 服务层实现
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Service
public class NewsServiceImpl implements INewsService 
{
	@Autowired
	private NewsMapper newsMapper;

	/**
     * 查询新闻信息
     * 
     * @param newsId 新闻ID
     * @return 新闻信息
     */
    @Override
	public News selectNewsById(Long newsId)
	{
	    return newsMapper.selectNewsById(newsId);
	}
	
	/**
     * 查询新闻列表
     * 
     * @param news 新闻信息
     * @return 新闻集合
     */
	@Override
	public List<News> selectNewsList(News news)
	{
	    return newsMapper.selectNewsList(news);
	}
	
    /**
     * 新增新闻
     * 
     * @param news 新闻信息
     * @return 结果
     */
	@Override
	public int insertNews(News news)
	{
	    return newsMapper.insertNews(news);
	}
	
	/**
     * 修改新闻
     * 
     * @param news 新闻信息
     * @return 结果
     */
	@Override
	public int updateNews(News news)
	{
	    return newsMapper.updateNews(news);
	}

	/**
     * 删除新闻对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteNewsByIds(String ids)
	{
		return newsMapper.deleteNewsByIds(Convert.toStrArray(ids));
	}
	
}
