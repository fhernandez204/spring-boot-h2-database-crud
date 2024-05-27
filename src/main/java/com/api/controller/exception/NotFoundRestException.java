package com.api.controller.exception;

import com.api.configuration.ErrorCode;
import com.api.configuration.exception.GenericException;

public final class NotFoundRestException extends GenericException {

    public NotFoundRestException(ErrorCode errorCode) {
        super(errorCode);
    }
}
