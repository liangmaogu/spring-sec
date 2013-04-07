/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

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


public class RolesAuthorities implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "RolesAuthorities";
	public static final String ALIAS_ROLE_ID = "roleId";
	public static final String ALIAS_AUTHORITY_ID = "authorityId";
	
	private Integer roleId;
	
	private Integer authorityId;
	//columns END

	public RolesAuthorities(){
	}

	public RolesAuthorities(
		Integer roleId,
		Integer authorityId
	){
		this.roleId = roleId;
		this.authorityId = authorityId;
	}

	public void setRoleId(Integer value) {
		this.roleId = value;
	}
	
	public Integer getRoleId() {
		return this.roleId;
	}
	public void setAuthorityId(Integer value) {
		this.authorityId = value;
	}
	
	public Integer getAuthorityId() {
		return this.authorityId;
	}
	
	private Authorities authorities;
	
	public void setAuthorities(Authorities authorities){
		this.authorities = authorities;
	}
	
	public Authorities getAuthorities() {
		return authorities;
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
		if (obj instanceof RolesAuthorities == false)
			return false;
		if (this == obj)
			return true;
		return new EqualsBuilder().isEquals();
	}
}

