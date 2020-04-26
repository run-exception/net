package cn.leon.auth.confirm;

import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

/**
 * @ClassName SelfAuthenticationProvider
 * @Description
 * @Author Jevon
 * @Date2020/1/20 14:58
 **/
@Component
public class SelfAuthenticationProvider implements AuthenticationProvider {
    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        val userName = authentication.getPrincipal();
        val password = authentication.getCredentials();
        UserDetails userDetails = userDetailsService.loadUserByUsername((String) userName);
        if (password.equals(userDetails.getPassword())) {
            return new UsernamePasswordAuthenticationToken(userName, null, null);
        }
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
