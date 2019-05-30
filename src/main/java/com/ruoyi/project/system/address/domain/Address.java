package com.ruoyi.project.system.address.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 用户地址表 address
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public class Address extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 地址Id */
	private Long addressId;
	/** 用户Id */
	private Long userId;
	/** 详细地址 */
	private String content;
	/** 区域 */
	private String area;
	/** 邮编 */
	private Integer postcode;
	/** 是否为默认地址 */
	private String defaultAddress;
	/** 手机号 */
	private Integer phone;

	public void setAddressId(Long addressId) 
	{
		this.addressId = addressId;
	}

	public Long getAddressId() 
	{
		return addressId;
	}
	public void setUserId(Long userId) 
	{
		this.userId = userId;
	}

	public Long getUserId() 
	{
		return userId;
	}
	public void setContent(String content) 
	{
		this.content = content;
	}

	public String getContent() 
	{
		return content;
	}
	public void setArea(String area) 
	{
		this.area = area;
	}

	public String getArea() 
	{
		return area;
	}
	public void setPostcode(Integer postcode) 
	{
		this.postcode = postcode;
	}

	public Integer getPostcode() 
	{
		return postcode;
	}
	public void setDefaultAddress(String defaultAddress) 
	{
		this.defaultAddress = defaultAddress;
	}

	public String getDefaultAddress() 
	{
		return defaultAddress;
	}
	public void setPhone(Integer phone) 
	{
		this.phone = phone;
	}

	public Integer getPhone() 
	{
		return phone;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("addressId", getAddressId())
            .append("userId", getUserId())
            .append("content", getContent())
            .append("area", getArea())
            .append("postcode", getPostcode())
            .append("defaultAddress", getDefaultAddress())
            .append("phone", getPhone())
            .toString();
    }
}
