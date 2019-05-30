package com.ruoyi.project.system.store.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;
import java.math.BigDecimal;

/**
 * 商家表 store
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public class Store extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 店铺Id */
	private Integer storeId;
	/** 店铺名 */
	private String storeName;
	/** 开店区域 */
	private String storeAddress;
	/** 普通，黄金，砖石，皇冠等 */
	private String storeLevel;
	/** 开店时长 */
	private String storeAge;
	/** 店铺评分 */
	private BigDecimal storeScore;
	/** 总销量 */
	private Long totleSales;
	/** 0：正常。1：审核中。2：冻结 */
	private String state;

	public void setStoreId(Integer storeId) 
	{
		this.storeId = storeId;
	}

	public Integer getStoreId() 
	{
		return storeId;
	}
	public void setStoreName(String storeName) 
	{
		this.storeName = storeName;
	}

	public String getStoreName() 
	{
		return storeName;
	}
	public void setStoreAddress(String storeAddress) 
	{
		this.storeAddress = storeAddress;
	}

	public String getStoreAddress() 
	{
		return storeAddress;
	}
	public void setStoreLevel(String storeLevel) 
	{
		this.storeLevel = storeLevel;
	}

	public String getStoreLevel() 
	{
		return storeLevel;
	}
	public void setStoreAge(String storeAge) 
	{
		this.storeAge = storeAge;
	}

	public String getStoreAge() 
	{
		return storeAge;
	}
	public void setStoreScore(BigDecimal storeScore) 
	{
		this.storeScore = storeScore;
	}

	public BigDecimal getStoreScore() 
	{
		return storeScore;
	}
	public void setTotleSales(Long totleSales) 
	{
		this.totleSales = totleSales;
	}

	public Long getTotleSales() 
	{
		return totleSales;
	}
	public void setState(String state) 
	{
		this.state = state;
	}

	public String getState() 
	{
		return state;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("storeId", getStoreId())
            .append("storeName", getStoreName())
            .append("storeAddress", getStoreAddress())
            .append("storeLevel", getStoreLevel())
            .append("storeAge", getStoreAge())
            .append("storeScore", getStoreScore())
            .append("totleSales", getTotleSales())
            .append("state", getState())
            .toString();
    }
}
