package com.inno.springsec.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author liangmaogu@gmail.com
 * @version 1.0
 * @since 1.0
 */


public class RolesAuthoritiesId implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	private java.lang.Integer roleId;
	private java.lang.Integer authorityId;

	public RolesAuthoritiesId(){
	}

	public RolesAuthoritiesId(
		java.lang.Integer roleId,
		java.lang.Integer authorityId
	){
		this.roleId = roleId;
		this.authorityId = authorityId;
	}

	
	public void setRoleId(java.lang.Integer value) {
		this.roleId = value;
	}
	
	public java.lang.Integer getRoleId() {
		return this.roleId;
	}
	public void setAuthorityId(java.lang.Integer value) {
		this.authorityId = value;
	}
	
	public java.lang.Integer getAuthorityId() {
		return this.authorityId;
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