package com.ruoyi.project.system.bookmark.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 收藏夹表 bookmark
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public class Bookmark extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 收藏Id */
	private Long markId;
	/** 用户Id */
	private Long userId;
	/** 书籍Id */
	private Long bookId;
	/** 收藏日期 */
	private Date markDate;

	public void setMarkId(Long markId) 
	{
		this.markId = markId;
	}

	public Long getMarkId() 
	{
		return markId;
	}
	public void setUserId(Long userId) 
	{
		this.userId = userId;
	}

	public Long getUserId() 
	{
		return userId;
	}
	public void setBookId(Long bookId) 
	{
		this.bookId = bookId;
	}

	public Long getBookId() 
	{
		return bookId;
	}
	public void setMarkDate(Date markDate) 
	{
		this.markDate = markDate;
	}

	public Date getMarkDate() 
	{
		return markDate;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("markId", getMarkId())
            .append("userId", getUserId())
            .append("bookId", getBookId())
            .append("markDate", getMarkDate())
            .toString();
    }
}
