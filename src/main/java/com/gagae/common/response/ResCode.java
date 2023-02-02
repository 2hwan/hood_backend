package com.gagae.common.response;

import com.gagae.common.response.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResCode {
    OK(200, "OK"),
    BAD_REQUEST(400, "BAD REQUEST"),
    UNAUTHORISED(401, "UNAUTHORISED"),
    FORBIDDEN(403,"FORBIDDEN"),
    NOT_FOUND(404, "NOT FOUND"),
    INTERNAL_SERVER_ERROR(500, "INTERNAL SERVER ERROR"),
    SERVICE_UNAVAILABLE(503, "SERVICE UNAVAILABLE");

    private final int code;
    private final String message;

    public BaseResponse toResponse() {return BaseResponse.of(this);}
}
