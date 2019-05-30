package com.ruoyi.project.system.comment.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 评论表 comment
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public class Comment extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 评论Id */
	private Long commentId;
	/** 用户Id */
	private Long userId;
	/** 书籍Id */
	private Long bookId;
	/** 订单Id */
	private Long orderId;
	/** 评论内容 */
	private String content;
	/** 评论日期 */
	private Date commentDate;
	/** 评论级别（0：好评，1：中评，2：差评，3：卖家回复） */
	private Integer level;

	public void setCommentId(Long commentId) 
	{
		this.commentId = commentId;
	}

	public Long getCommentId() 
	{
		return commentId;
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
	public void setOrderId(Long orderId) 
	{
		this.orderId = orderId;
	}

	public Long getOrderId() 
	{
		return orderId;
	}
	public void setContent(String content) 
	{
		this.content = content;
	}

	public String getContent() 
	{
		return content;
	}
	public void setCommentDate(Date commentDate) 
	{
		this.commentDate = commentDate;
	}

	public Date getCommentDate() 
	{
		return commentDate;
	}
	public void setLevel(Integer level) 
	{
		this.level = level;
	}

	public Integer getLevel() 
	{
		return level;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("commentId", getCommentId())
            .append("userId", getUserId())
            .append("bookId", getBookId())
            .append("orderId", getOrderId())
            .append("content", getContent())
            .append("commentDate", getCommentDate())
            .append("level", getLevel())
            .toString();
    }
}
