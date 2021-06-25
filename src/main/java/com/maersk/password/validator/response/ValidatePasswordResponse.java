package com.maersk.password.validator.response;

import com.maersk.password.validator.constants.GenericConstants;

import lombok.Data;

/**
 * The Class ValidatePasswordResponse.
 */
@Data
public class ValidatePasswordResponse extends GenericResponse {

    /** The password. */
    private String password;

    /**
     * Instantiates a new validate password response.
     * @param password the password
     */
    public ValidatePasswordResponse(final String password) {
        super(GenericConstants.SUCCESS);
        this.password = password;
    }

}
