package com.inno.springsec.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author liangmaogu@gmail.com
 * @version 1.0
 * @since 1.0
 */


public class UsersRolesId implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	private int userId;
	private int roleId;

	public UsersRolesId(){
	}

	public UsersRolesId(
		int userId,
		int roleId
	){
		this.userId = userId;
		this.roleId = roleId;
	}

	
	public void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return this.userId;
	}
	public void setRoleId(int value) {
		this.roleId = value;
	}
	
	public int getRoleId() {
		return this.roleId;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	
	public boolean equals(Object other) {
		return EqualsBuilder.reflectionEquals(this, other);
	}
}