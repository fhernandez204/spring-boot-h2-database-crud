package com.api.configuration.exception;

import com.api.configuration.ErrorCode;

public final class RetrievingKongObjectException extends GenericException{

    public RetrievingKongObjectException(ErrorCode errorCode, String message) {
        super(errorCode, message);
    }
}
