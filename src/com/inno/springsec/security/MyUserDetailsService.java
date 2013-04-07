package com.inno.springsec.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.inno.springsec.model.RolesAuthorities;
import com.inno.springsec.model.Users;
import com.inno.springsec.model.UsersRoles;
import com.inno.springsec.service.IUserService;

public class MyUserDetailsService implements UserDetailsService {
	private IUserService userService;

	@SuppressWarnings("deprecation")
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = userService.getUserByName(username);
		if(user==null) {
			throw new UsernameNotFoundException("用户 " + username + " 不存在");
        }  
		
		// 新的权限列表
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		// 根据用户名查找对应的权限
		Set<UsersRoles> urs = user.getUsersRoless();
		// 将查找到的权限，封装成GrantedAuthorityImpl放到权限列表中
		for (UsersRoles rs : urs) {
			Set<RolesAuthorities> ras = rs.getRoles().getRolesAuthoritiess();
			for (RolesAuthorities ra : ras) {
				authorities.add(new GrantedAuthorityImpl(ra.getAuthorities().getDisplayName()));
			}
		}
		
		return new User(username, user.getPassword(), true, true, true, true, authorities);
	}
	

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

}
