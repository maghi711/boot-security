package com.maghi711.bootsecuritydemo.security.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    static Map<String, String> users;

    // Setup local users
    static {
        users = Map.of("aadavan", "$2a$12$HJpuVMz4TVMgCkItTvmCVuYEh.XraHbckDHCqAsYBzzZTXlXFkM9q",
                "swetha", "$2a$12$vtWsz6.xafZVU2OavDgWkOrQCArCZ44QhPeZrza.fKYaJrl76zgTm");
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (username == null) {
            System.out.println("Username cannot be null");
        }
        return new User(username, getPassword(username), getAuthorities());
    }

    private Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(() -> "ALL");
    }

    private String getPassword(String username) {
        return users.get(username);
    }
}
