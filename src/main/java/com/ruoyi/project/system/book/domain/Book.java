package com.ruoyi.project.system.book.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 书籍表 book
 * 
 * @author ruoyi
 * @date 2019-06-11
 */
public class Book extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 书籍Id */
	private Long bookId;
	/** 书名 */
	private String bookName;
	/** 单价 */
	private BigDecimal bookPrice;
	/** 作者 */
	private String author;
	/** 出版社 */
	private String publishing;
	/** 卖家店铺 */
	private Long storeId;
	/** 销量 */
	private Long sales;
	/** 出版日期 */
	private Date publicationDate;
	/** 余量 */
	private Integer count;
	/** 评分 */
	private BigDecimal score;
	/**  */
	private String classification;

	public void setBookId(Long bookId) 
	{
		this.bookId = bookId;
	}

	public Long getBookId() 
	{
		return bookId;
	}
	public void setBookName(String bookName) 
	{
		this.bookName = bookName;
	}

	public String getBookName() 
	{
		return bookName;
	}
	public void setBookPrice(BigDecimal bookPrice) 
	{
		this.bookPrice = bookPrice;
	}

	public BigDecimal getBookPrice() 
	{
		return bookPrice;
	}
	public void setAuthor(String author) 
	{
		this.author = author;
	}

	public String getAuthor() 
	{
		return author;
	}
	public void setPublishing(String publishing) 
	{
		this.publishing = publishing;
	}

	public String getPublishing() 
	{
		return publishing;
	}
	public void setStoreId(Long storeId) 
	{
		this.storeId = storeId;
	}

	public Long getStoreId() 
	{
		return storeId;
	}
	public void setSales(Long sales) 
	{
		this.sales = sales;
	}

	public Long getSales() 
	{
		return sales;
	}
	public void setPublicationDate(Date publicationDate) 
	{
		this.publicationDate = publicationDate;
	}

	public Date getPublicationDate() 
	{
		return publicationDate;
	}
	public void setCount(Integer count) 
	{
		this.count = count;
	}

	public Integer getCount() 
	{
		return count;
	}
	public void setScore(BigDecimal score) 
	{
		this.score = score;
	}

	public BigDecimal getScore() 
	{
		return score;
	}
	public void setClassification(String classification) 
	{
		this.classification = classification;
	}

	public String getClassification() 
	{
		return classification;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("bookId", getBookId())
            .append("bookName", getBookName())
            .append("bookPrice", getBookPrice())
            .append("author", getAuthor())
            .append("publishing", getPublishing())
            .append("storeId", getStoreId())
            .append("sales", getSales())
            .append("publicationDate", getPublicationDate())
            .append("count", getCount())
            .append("score", getScore())
            .append("classification", getClassification())
            .toString();
    }
}
