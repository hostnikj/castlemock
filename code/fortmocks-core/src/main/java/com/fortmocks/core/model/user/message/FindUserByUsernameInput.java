package com.fortmocks.core.model.user.message;

import com.fortmocks.core.model.Input;

/**
 * @author Karl Dahlgren
 * @since 1.0
 */
public class FindUserByUsernameInput implements Input {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}