package com.maersk.password.validator.model;

import lombok.Data;

/**
 * The Class GenericError.
 */
@Data
public class GenericError {

    /** The error code. */
    private int errorCode;

    /** The error message. */
    private String errorMessage;

}

