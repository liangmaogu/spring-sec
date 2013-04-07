package com.inno.springsec.model;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.validator.constraints.Length;

/**
 * @author liangmaogu@gmail.com
 * @version 1.0
 * @since 1.0
 */

public class Authorities implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;

	// alias
	public static final String TABLE_ALIAS = "Authorities";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_NAME = "name";
	public static final String ALIAS_DISPLAY_NAME = "displayName";

	private Integer id;
	@Length(max = 20)
	private String name;
	@Length(max = 20)
	private String displayName;

	// columns END

	public Authorities() {
	}

	public Authorities(Integer id) {
		this.id = id;
	}

	public void setId(Integer value) {
		this.id = value;
	}

	public Integer getId() {
		return this.id;
	}

	public void setName(String value) {
		this.name = value;
	}

	public String getName() {
		return this.name;
	}

	public void setDisplayName(String value) {
		this.displayName = value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	private Set<RolesAuthorities> rolesAuthoritiess = new HashSet<RolesAuthorities>(0);

	public void setRolesAuthoritiess(Set<RolesAuthorities> rolesAuthorities) {
		this.rolesAuthoritiess = rolesAuthorities;
	}

	public Set<RolesAuthorities> getRolesAuthoritiess() {
		return rolesAuthoritiess;
	}

	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("Id", getId()).append("Name", getName())
				.append("DisplayName", getDisplayName()).toString();
	}

	public int hashCode() {
		return new HashCodeBuilder().append(getId()).toHashCode();
	}

	public boolean equals(Object obj) {
		if (obj instanceof Authorities == false)
			return false;
		if (this == obj)
			return true;
		Authorities other = (Authorities) obj;
		return new EqualsBuilder().append(getId(), other.getId()).isEquals();
	}
}
