package com.ruoyi.project.system.categorie.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 分类表 categorie
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public class Categorie extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** id */
	private Long categoriesId;
	/** 一级分类名 */
	private String oneCategories;
	/** 二级分类名 */
	private String twoCategories;
	/** 书的Id */
	private String bookId;

	public void setCategoriesId(Long categoriesId) 
	{
		this.categoriesId = categoriesId;
	}

	public Long getCategoriesId() 
	{
		return categoriesId;
	}
	public void setOneCategories(String oneCategories) 
	{
		this.oneCategories = oneCategories;
	}

	public String getOneCategories() 
	{
		return oneCategories;
	}
	public void setTwoCategories(String twoCategories) 
	{
		this.twoCategories = twoCategories;
	}

	public String getTwoCategories() 
	{
		return twoCategories;
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
            .append("categoriesId", getCategoriesId())
            .append("oneCategories", getOneCategories())
            .append("twoCategories", getTwoCategories())
            .append("bookId", getBookId())
            .toString();
    }
}
