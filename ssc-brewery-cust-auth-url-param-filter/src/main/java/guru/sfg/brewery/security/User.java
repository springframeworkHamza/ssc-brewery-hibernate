package guru.sfg.brewery.security;

import java.util.Set;

public class User {

    private String userName;
    private String password;
    private Set<Authority> authorities;
    private Boolean accountNonExpired;
    private Boolean accountNonLocked;
    private Boolean credentialsNonExpired;
    private Boolean enabled;

}
