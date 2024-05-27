package com.api.controller.exception;

import com.api.configuration.ErrorCode;
import com.api.configuration.exception.GenericException;

public final class TimeoutRestException extends GenericException {

    public TimeoutRestException(ErrorCode errorCode) {
        super(errorCode);
    }

}
