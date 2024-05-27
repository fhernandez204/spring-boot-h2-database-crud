package com.api.controller.exception;

import com.api.configuration.ErrorCode;
import com.api.configuration.exception.GenericException;

public class ServiceUnavailableRestException extends GenericException {

    public ServiceUnavailableRestException(ErrorCode errorCode, String message) {
        super(errorCode, message);
    }
}
