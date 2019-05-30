package com.ruoyi.project.system.picture.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 图片表 picture
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public class Picture extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** Id */
	private Integer pictureId;
	/** 图片内容（地址） */
	private String pictureContent;
	/** 书的Id */
	private String bookId;

	public void setPictureId(Integer pictureId) 
	{
		this.pictureId = pictureId;
	}

	public Integer getPictureId() 
	{
		return pictureId;
	}
	public void setPictureContent(String pictureContent) 
	{
		this.pictureContent = pictureContent;
	}

	public String getPictureContent() 
	{
		return pictureContent;
	}
	public void setBookId(String bookId) 
	{
		this.bookId = bookId;
	}

	public String getBookId() 
	{
		return bookId;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pictureId", getPictureId())
            .append("pictureContent", getPictureContent())
            .append("bookId", getBookId())
            .toString();
    }
}
