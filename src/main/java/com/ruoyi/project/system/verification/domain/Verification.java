package com.ruoyi.project.system.verification.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 验证码表 verification
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public class Verification extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 验证码 */
	private Integer verificationId;
	/**  */
	private Integer verificationContent;
	/**  */
	private Integer userId;
	/**  */
	private Date date;

	public void setVerificationId(Integer verificationId) 
	{
		this.verificationId = verificationId;
	}

	public Integer getVerificationId() 
	{
		return verificationId;
	}
	public void setVerificationContent(Integer verificationContent) 
	{
		this.verificationContent = verificationContent;
	}

	public Integer getVerificationContent() 
	{
		return verificationContent;
	}
	public void setUserId(Integer userId) 
	{
		this.userId = userId;
	}

	public Integer getUserId() 
	{
		return userId;
	}
	public void setDate(Date date) 
	{
		this.date = date;
	}

	public Date getDate() 
	{
		return date;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("verificationId", getVerificationId())
            .append("verificationContent", getVerificationContent())
            .append("userId", getUserId())
            .append("date", getDate())
            .toString();
    }
}
