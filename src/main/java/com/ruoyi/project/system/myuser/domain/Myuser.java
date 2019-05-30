package com.ruoyi.project.system.myuser.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 用户表 myuser
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public class Myuser extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 用户Id */
	private Long userId;
	/** 用户名 */
	private String username;
	/** 密码 */
	private String password;
	/** 手机 */
	private String phone;
	/** 性别M/F */
	private String sex;
	/** 邮箱 */
	private String email;
	/** 身份证号 */
	private String identityCard;
	/** 头像 */
	private String avatar;
	/** 0：正常。1：审核中。2：冻结 */
	private String state;

	public void setUserId(Long userId) 
	{
		this.userId = userId;
	}

	public Long getUserId() 
	{
		return userId;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}

	public String getUsername() 
	{
		return username;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}

	public String getPassword() 
	{
		return password;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	public String getPhone() 
	{
		return phone;
	}
	public void setSex(String sex) 
	{
		this.sex = sex;
	}

	public String getSex() 
	{
		return sex;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getEmail() 
	{
		return email;
	}
	public void setIdentityCard(String identityCard) 
	{
		this.identityCard = identityCard;
	}

	public String getIdentityCard() 
	{
		return identityCard;
	}
	public void setAvatar(String avatar) 
	{
		this.avatar = avatar;
	}

	public String getAvatar() 
	{
		return avatar;
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
            .append("userId", getUserId())
            .append("username", getUsername())
            .append("password", getPassword())
            .append("phone", getPhone())
            .append("sex", getSex())
            .append("email", getEmail())
            .append("identityCard", getIdentityCard())
            .append("avatar", getAvatar())
            .append("state", getState())
            .toString();
    }
}
