package com.api.controller.exception;

import com.api.configuration.ErrorCode;
import com.api.configuration.exception.GenericException;

public final class NonTargetRestException extends GenericException {

    public NonTargetRestException(ErrorCode errorCode) {
        super(errorCode);
    }

}
