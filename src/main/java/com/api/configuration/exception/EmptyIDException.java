package com.api.configuration.exception;


import com.api.configuration.ErrorCode;

public class EmptyIDException extends GenericException {
    public EmptyIDException(ErrorCode errorCode) {
        super(errorCode);
    }
}
