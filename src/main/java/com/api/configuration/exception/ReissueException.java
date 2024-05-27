package com.api.configuration.exception;

import com.api.configuration.ErrorCode;

public class ReissueException extends GenericException {
    public ReissueException(ErrorCode errorCode, String message) {
        super(errorCode, message);
    }
}
