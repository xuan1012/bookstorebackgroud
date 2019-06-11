package com.ruoyi.project.system.orderbuy.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 订单表 orderbuy
 * 
 * @author ruoyi
 * @date 2019-06-11
 */
public class Orderbuy extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 订单Id */
	private Long orderId;
	/** 下单日期 */
	private Date orderDate;
	/** 订单价格 */
	private BigDecimal orderPrice;
	/** 订单商品 */
	private Long bookId;
	/** 订单数量 */
	private Integer orderCount;
	/** 下单用户Id */
	private Long userId;
	/** 用户地址 */
	private String userAddress;
	/** 订单状态 */
	private String state;
	/** 店铺Id */
	private Long storeId;
	/**  */
	private Long level;

	public void setOrderId(Long orderId) 
	{
		this.orderId = orderId;
	}

	public Long getOrderId() 
	{
		return orderId;
	}
	public void setOrderDate(Date orderDate) 
	{
		this.orderDate = orderDate;
	}

	public Date getOrderDate() 
	{
		return orderDate;
	}
	public void setOrderPrice(BigDecimal orderPrice) 
	{
		this.orderPrice = orderPrice;
	}

	public BigDecimal getOrderPrice() 
	{
		return orderPrice;
	}
	public void setBookId(Long bookId) 
	{
		this.bookId = bookId;
	}

	public Long getBookId() 
	{
		return bookId;
	}
	public void setOrderCount(Integer orderCount) 
	{
		this.orderCount = orderCount;
	}

	public Integer getOrderCount() 
	{
		return orderCount;
	}
	public void setUserId(Long userId) 
	{
		this.userId = userId;
	}

	public Long getUserId() 
	{
		return userId;
	}
	public void setUserAddress(String userAddress) 
	{
		this.userAddress = userAddress;
	}

	public String getUserAddress() 
	{
		return userAddress;
	}
	public void setState(String state) 
	{
		this.state = state;
	}

	public String getState() 
	{
		return state;
	}
	public void setStoreId(Long storeId) 
	{
		this.storeId = storeId;
	}

	public Long getStoreId() 
	{
		return storeId;
	}
	public void setLevel(Long level) 
	{
		this.level = level;
	}

	public Long getLevel() 
	{
		return level;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("orderId", getOrderId())
            .append("orderDate", getOrderDate())
            .append("orderPrice", getOrderPrice())
            .append("bookId", getBookId())
            .append("orderCount", getOrderCount())
            .append("userId", getUserId())
            .append("userAddress", getUserAddress())
            .append("state", getState())
            .append("storeId", getStoreId())
            .append("level", getLevel())
            .toString();
    }
}
