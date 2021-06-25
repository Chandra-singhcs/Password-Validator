package com.maersk.password.validator.enums;


/**
 * The Enum PasswordError.
 */
public enum PasswordError {

    /** The constraint empty. */
    CONSTRAINT_EMPTY("password.empty.constraint"), 
    CONSTRAINT_SIZE("password.size.constraint"), 
    CONSTRAINT_LOWER_CASE("password.lowercase.constraint"), 
    CONSTRAINT_UPPER_CASE("password.uppercase.constraint"), 
    CONSTRAINT_NUMBER("password.number.constraint");
    /** The error type. */
    private final String errorType;

    /**
     * Instantiates a new password error.
     * @param errorType the error type
     */
    private PasswordError(final String errorType) {
        this.errorType = errorType;
    }

    @Override
    public String toString() {
        return errorType;
    }

}
