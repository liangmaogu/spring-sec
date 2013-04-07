package com.inno.springsec.model;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

/**
 * @author liangmaogu@gmail.com
 * @version 1.0
 * @since 1.0
 */


public class Users implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "Users";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_LOGIN_NAME = "loginName";
	public static final String ALIAS_PASSWORD = "password";
	public static final String ALIAS_NAME = "name";
	public static final String ALIAS_EMAIL = "email";
		
	private Integer id;
	@Length(max=20)
	private String loginName;
	@Length(max=20)
	private String password;
	@Length(max=20)
	private String name;
	@Email @Length(max=30)
	private String email;
	//columns END

	public Users(){
	}

	public Users(
		Integer id
	){
		this.id = id;
	}

	public void setId(Integer value) {
		this.id = value;
	}
	
	public Integer getId() {
		return this.id;
	}
	public void setLoginName(String value) {
		this.loginName = value;
	}
	
	public String getLoginName() {
		return this.loginName;
	}
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return this.password;
	}
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	private Set<UsersRoles> usersRoless = new HashSet<UsersRoles>(0);
	public void setUsersRoless(Set<UsersRoles> usersRoles){
		this.usersRoless = usersRoles;
	}
	
	public Set<UsersRoles> getUsersRoless() {
		return usersRoless;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("LoginName",getLoginName())
			.append("Password",getPassword())
			.append("Name",getName())
			.append("Email",getEmail())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Users == false)
			return false;
		if (this == obj)
			return true;
		Users other = (Users) obj;
		return new EqualsBuilder().append(getId(), other.getId()).isEquals();
	}
}

