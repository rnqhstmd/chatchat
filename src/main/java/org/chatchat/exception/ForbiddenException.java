package org.chatchat.exception;

import org.chatchat.exception.type.ErrorType;
import org.springframework.http.HttpStatus;

public class ForbiddenException extends ApiException {

    public ForbiddenException(final ErrorType errorType) {
        super(errorType, HttpStatus.FORBIDDEN);
    }

    public ForbiddenException(final ErrorType errorType, final String detail) {
        super(errorType, detail, HttpStatus.FORBIDDEN);
    }
}
