package com.ruoyi.project.system.administrator.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 员表 administrator
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public class Administrator extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 管理员Id */
	private Long id;
	/** 登陆账号 */
	private String loginName;
	/** 登录密码 */
	private String password;
	/** 真实姓名 */
	private String name;
	/** 身份证号 */
	private String identityCard;
	/** 联系电话 */
	private Integer phone;
	/** 所属部门 */
	private String department;

	public void setId(Long id) 
	{
		this.id = id;
	}

	public Long getId() 
	{
		return id;
	}
	public void setLoginName(String loginName) 
	{
		this.loginName = loginName;
	}

	public String getLoginName() 
	{
		return loginName;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}

	public String getPassword() 
	{
		return password;
	}
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	public void setIdentityCard(String identityCard) 
	{
		this.identityCard = identityCard;
	}

	public String getIdentityCard() 
	{
		return identityCard;
	}
	public void setPhone(Integer phone) 
	{
		this.phone = phone;
	}

	public Integer getPhone() 
	{
		return phone;
	}
	public void setDepartment(String department) 
	{
		this.department = department;
	}

	public String getDepartment() 
	{
		return department;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("loginName", getLoginName())
            .append("password", getPassword())
            .append("name", getName())
            .append("identityCard", getIdentityCard())
            .append("phone", getPhone())
            .append("department", getDepartment())
            .toString();
    }
}
