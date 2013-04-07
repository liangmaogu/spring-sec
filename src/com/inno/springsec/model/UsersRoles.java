package com.inno.springsec.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * @author liangmaogu@gmail.com
 * @version 1.0
 * @since 1.0
 */


public class UsersRoles implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "UsersRoles";
	public static final String ALIAS_USER_ID = "userId";
	public static final String ALIAS_ROLE_ID = "roleId";
	
	
	private Integer userId;
	
	private Integer roleId;
	//columns END

	public UsersRoles(){
	}

	public UsersRoles(
		Integer userId,
		Integer roleId
	){
		this.userId = userId;
		this.roleId = roleId;
	}

	public void setUserId(Integer value) {
		this.userId = value;
	}
	
	public Integer getUserId() {
		return this.userId;
	}
	public void setRoleId(Integer value) {
		this.roleId = value;
	}
	
	public Integer getRoleId() {
		return this.roleId;
	}
	
	private Users users;
	
	public void setUsers(Users users){
		this.users = users;
	}
	
	public Users getUsers() {
		return users;
	}
	
	private Roles roles;
	
	public void setRoles(Roles roles){
		this.roles = roles;
	}
	
	public Roles getRoles() {
		return roles;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof UsersRoles == false)
			return false;
		if (this == obj)
			return true;
		return new EqualsBuilder().isEquals();
	}
}

