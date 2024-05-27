package com.api.configuration.exception;


import com.api.configuration.ErrorCode;

public final class DecryptionException extends GenericException {

    public DecryptionException(ErrorCode errorCode) {
        super(errorCode);
    }
}
