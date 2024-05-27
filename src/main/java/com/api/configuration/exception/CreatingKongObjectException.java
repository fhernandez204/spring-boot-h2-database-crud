package com.api.configuration.exception;

import com.api.configuration.ErrorCode;

public final class CreatingKongObjectException extends GenericException {

    public CreatingKongObjectException(ErrorCode errorCode, String message){
        super(errorCode, message);
    }
}
