package com.gagae.common.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseResponse extends BaseObject {
    private static final long serialVersionUID = 1L;

    private Logger log = LoggerFactory.getLogger(BaseResponse.class);

    @Getter @Setter
    @JsonProperty("res_code")
    protected int code = 200;

    @Getter @Setter
    @JsonProperty("res_msg")
    protected String message = "SUCCESS";

    @Getter @Setter
    @JsonProperty("data")
    @JsonInclude(Include.NON_NULL)
    protected Object data;

    public static BaseResponse ok(){
        return new BaseResponse(ResCode.OK.getCode(), ResCode.OK.getMessage());
    }

    public static BaseResponse of(ResCode resCode){
        return new BaseResponse(resCode.getCode(), resCode.getMessage());
    }

    @Getter @Setter
    @JsonProperty("error")
    @JsonInclude(Include.NON_NULL)
    private List<Map<String, String>> errors;

    public BaseResponse(){
    }

    public BaseResponse(int code, String message){
        this.code = code;
        this.message = message;

        log.debug("code: {}, message: {}", code, message);
    }

    public void add(String field, String message){
        if (errors == null) {
            errors = new ArrayList<>();
        }
        Map<String, String> map = new HashMap<>();
        map.put("field", field);
        map.put("message", message);
        errors.add(map);
    }
}
