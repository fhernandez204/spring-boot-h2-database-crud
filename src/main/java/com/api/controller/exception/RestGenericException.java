package com.api.controller.exception;

import com.api.configuration.ErrorCode;
import com.api.configuration.exception.GenericException;

public final class RestGenericException extends GenericException {

    public RestGenericException(ErrorCode errorCode) {
        super(errorCode);
    }

}
