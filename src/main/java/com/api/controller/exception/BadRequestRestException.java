package com.api.controller.exception;

import com.api.configuration.ErrorCode;
import com.api.configuration.exception.GenericException;

public class BadRequestRestException extends GenericException {

    public BadRequestRestException(ErrorCode errorCode, String message) {
        super(errorCode, message);
    }
}
