package com.maersk.password.validator.response;

import java.util.Date;
import java.util.List;

import com.maersk.password.validator.model.GenericError;

import lombok.Data;


/**
 * The Class GenericResponse.
 */
@Data
public class GenericResponse {

    /** The status. */
    private int status;

    /** The message. */
    private String message;

    /** The timestamp. */
    private Date timestamp;

    /** The errors. */
    private List<GenericError> errors;
 
    /**
     * Instantiates a new generic response.
     * @param message the message
     */
    public GenericResponse(String message) {
        this.message = message;
    }


    public GenericResponse(String message, List<GenericError> errors, int status) {
        this.message = message;
        this.errors = errors;
        this.status = status;
    }

  
}
