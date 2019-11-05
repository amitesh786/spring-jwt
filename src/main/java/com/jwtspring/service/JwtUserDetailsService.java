package com.jwtspring.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("jwtsprint".equals(username)) {
			return new User("jwtsprint", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
					new Arrays<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}
