package com.ruoyi.project.system.shoppingcart.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 购物车表 shoppingcart
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public class Shoppingcart extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 购物车id */
	private Long cartId;
	/** 用户id */
	private Long userId;
	/** 书id */
	private Long bookId;
	/** 数量 */
	private Long count;

	public void setCartId(Long cartId) 
	{
		this.cartId = cartId;
	}

	public Long getCartId() 
	{
		return cartId;
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
	public void setCount(Long count) 
	{
		this.count = count;
	}

	public Long getCount() 
	{
		return count;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("cartId", getCartId())
            .append("userId", getUserId())
            .append("bookId", getBookId())
            .append("count", getCount())
            .toString();
    }
}
