package com.maersk.password.validator.controller;

import com.maersk.password.validator.webvalidators.PasswordValidator;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * The Class BaseController.
 */
public abstract class BaseController {

    /**
     * Inits the binder.
     * @param binder the binder
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setValidator(new PasswordValidator());
    }

}
