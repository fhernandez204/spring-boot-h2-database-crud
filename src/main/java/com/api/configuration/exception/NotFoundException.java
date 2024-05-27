package com.api.configuration.exception;

import com.api.configuration.ErrorCode;

public class NotFoundException extends GenericException {

    public NotFoundException(ErrorCode errorCode) {
        super(errorCode);
    }
}
