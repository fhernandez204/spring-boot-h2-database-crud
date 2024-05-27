package com.api.controller.exception;

import com.api.configuration.ErrorCode;
import com.api.configuration.exception.GenericException;

public final class EmptyOrNullBodyRestException extends GenericException {

    public EmptyOrNullBodyRestException(ErrorCode errorCode) {
        super(errorCode);
    }

}
