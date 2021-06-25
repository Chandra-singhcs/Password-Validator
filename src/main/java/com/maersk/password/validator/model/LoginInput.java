package com.maersk.password.validator.model;

import lombok.Data;

/**
 * The Class LoginInput.
 */
@Data
public class LoginInput {

    /** The password. */
    private String password;

    @Override
    public String toString() {
        return "LoginInput [password=" + password + "]";
    }


}
