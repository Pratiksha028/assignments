              
package com.training.SpringSecurity.entities;
import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
public class MyUserDetails implements UserDetails{
	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;
	publicMyUserDetails() {
		}
		publicMyUserDetails(User user) {
		this.userName = user.getName();
		this.password = user.getPassword();
	}
		@Override
	public Collection<? extendsGrantedAuthority>getAuthorities() {
		return null;
	}
	@Override
	public String getPassword() {
		return password;
	}
	@Override
	public String getUsername() {
		returnuserName;
	}
	@Override
	publicbooleanisAccountNonExpired() {
		return true;
	}
	@Override
	publicbooleanisAccountNonLocked() {
		return true;
	}
	@Override
	publicbooleanisCredentialsNonExpired() {
		return true;
	}
	@Override
	publicbooleanisEnabled() {
		return true;
	}
}
