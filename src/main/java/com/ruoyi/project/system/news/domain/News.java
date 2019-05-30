package com.ruoyi.project.system.news.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 新闻表 news
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public class News extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 新闻Id */
	private Long newsId;
	/** 新闻内容 */
	private String newsContent;
	/** 新闻日期 */
	private Date newsDate;
	/** 新闻图片 */
	private String newsPicture;
	/**  */
	private Long bookId;

	public void setNewsId(Long newsId) 
	{
		this.newsId = newsId;
	}

	public Long getNewsId() 
	{
		return newsId;
	}
	public void setNewsContent(String newsContent) 
	{
		this.newsContent = newsContent;
	}

	public String getNewsContent() 
	{
		return newsContent;
	}
	public void setNewsDate(Date newsDate) 
	{
		this.newsDate = newsDate;
	}

	public Date getNewsDate() 
	{
		return newsDate;
	}
	public void setNewsPicture(String newsPicture) 
	{
		this.newsPicture = newsPicture;
	}

	public String getNewsPicture() 
	{
		return newsPicture;
	}
	public void setBookId(Long bookId) 
	{
		this.bookId = bookId;
	}

	public Long getBookId() 
	{
		return bookId;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("newsId", getNewsId())
            .append("newsContent", getNewsContent())
            .append("newsDate", getNewsDate())
            .append("newsPicture", getNewsPicture())
            .append("bookId", getBookId())
            .toString();
    }
}
